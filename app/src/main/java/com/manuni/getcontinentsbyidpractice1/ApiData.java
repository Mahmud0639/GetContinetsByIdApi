package com.manuni.getcontinentsbyidpractice1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiData {
    @GET("continents/{id}")
    Call<MainObjectData> getContinentsById(@Path("id")int id, @Query("api_token")String token);
}
