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

public class SplashActivity extends AppCompatActivity {

    public static String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO загрузка приложения, запрос к апи, запись/чтение данных

         RestService mRestService = ServiceGenerator.createService(RestService.class);
        Call<House> call = mRestService.getHouses();
        call.enqueue((new Callback<House>() {
            @Override
            public void onResponse(Call<House> call, Response<House> response) {
                if (response.code() == 200) {
                    Log.d(TAG, "onResponse " + response.body().getName());
                } else if (response.code() == 404) {
                    Log.d(TAG, "onResponse " + "400");
                }
            }

            @Override
            public void onFailure(Call<House> call, Throwable t) {
                Log.d(TAG, "onFailure " + t.getMessage());
            }
        }));
    }
}
