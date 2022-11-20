package com.codepalace.chatbot.Api


import com.codepalace.chatbot.Dto.ChatbotDto
import retrofit2.Call
import retrofit2.http.*

interface ChatbotApi {


    @GET("/chatbot/g")
    fun getKogpt2Response(
        @Query("s") s:String
    ): Call<ChatbotDto>


    @GET("/")
    fun getHomeResponse(
    ): Call<String>
}