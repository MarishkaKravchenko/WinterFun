package com.game.wintercoming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import network.RestService;
import network.ServiceGenerator;
import network.responseModels.House;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import utils.Data;

public class SplashActivity extends AppCompatActivity {

    public static String TAG = "TAG ";

    private Realm realmUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO загрузка приложения, запрос к апи, запись/чтение данных
        realmUI = Realm.getDefaultInstance();
        RestService mRestService = ServiceGenerator.createService(RestService.class);

        for (String house : Data.numberOfHouses) {
            mRestService.getHouses(house)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<House>() {
                        @Override
                        public final void onCompleted() {
                            Log.d(TAG, "onCompleted");
                        }

                        @Override
                        public final void onError(Throwable e) {
                            Log.e(TAG, e.getMessage());
                        }

                        @Override
                        public final void onNext(House response) {
                            Log.d(TAG, "onNext " + response.getName() + " " + response.getUrl());
                        }
                    });

        }
    }
}
