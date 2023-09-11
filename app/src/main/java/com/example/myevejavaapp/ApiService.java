package com.example.myevejavaapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface ApiService {
    @POST("signup")
    Call<User> register(@Body User user);
}
