package com.game.wintercoming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import network.RestService;
import network.ServiceGenerator;
import network.responseModels.House;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import utils.Data;

public class SplashActivity extends AppCompatActivity {

    public static String TAG = "TAG ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO загрузка приложения, запрос к апи, запись/чтение данных

//        RestService mRestService = ServiceGenerator.createService(RestService.class);
//        for(String house : Data.numberOfHouses) {
//            mRestService.getHouses(house)
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new Subscriber<House>() {
//                        @Override
//                        public final void onCompleted() {
//                            Log.d(TAG, "onCompleted");
//                        }
//
//                        @Override
//                        public final void onError(Throwable e) {
//                            Log.e(TAG, e.getMessage());
//                        }
//
//                        @Override
//                        public final void onNext(House response) {
//                            Log.d(TAG, "onNext " + response.getName());
//                        }
//                    });

//            mRestService.getHouses(house);
//            call.enqueue((new Callback<House>() {
//                @Override
//                public void onResponse(Call<House> call, Response<House> response) {
//                    if (response.code() == 200) {
//                        Log.d(TAG, "onResponse " + response.body().getName());
//                    } else if (response.code() == 404) {
//                        Log.d(TAG, "onResponse " + "400");
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<House> call, Throwable t) {
//                    Log.d(TAG, "onFailure " + t.getMessage());
//                }
//            }));
//        }
    }
}
