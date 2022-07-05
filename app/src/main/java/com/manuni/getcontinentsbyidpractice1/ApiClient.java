package com.manuni.getcontinentsbyidpractice1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit RETROFIT = null;

    public static Retrofit getRetrofit(){
        if (RETROFIT == null){
            OkHttpClient client = new OkHttpClient.Builder().build();
            Gson gson = new GsonBuilder().create();
            RETROFIT = new Retrofit.Builder().baseUrl(Utils.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return RETROFIT;
    }

}
