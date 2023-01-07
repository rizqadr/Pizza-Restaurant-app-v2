package com.rizqiadr.pizzarest;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceAPI {

    @GET("data")
    Call<List<Posts>> getPosts();
}
