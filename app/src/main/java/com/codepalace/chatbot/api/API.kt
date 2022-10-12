package com.codepalace.chatbot.api

import com.codepalace.chatbot.data.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

public interface API {
    @POST("api/user")
    fun postSignupResponse(@Body user: User): Call<String>

    @GET("api/user")
    fun getUserlistResponse(): Call<String>

    // @DELETE("api/user/{user_id}")
    // fun updateUserResponse(@Path("user_id") String user_id)


}