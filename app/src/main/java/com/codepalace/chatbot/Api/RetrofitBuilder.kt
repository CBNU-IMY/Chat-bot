package com.codepalace.chatbot.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitBuilder {
    var userapi: UserApi
    var corpusapi: CorpusApi
    init{
        val retrofit= Retrofit.Builder()
            .baseUrl("http://175.115.202.240:81/")   //요청 보내는 API 서버 url /로 끝나야 함
            .addConverterFactory(ScalarsConverterFactory.create() )
            .addConverterFactory(GsonConverterFactory.create())//Gson을 역직렬화
            .build()
        userapi=retrofit.create(UserApi::class.java)
        corpusapi=retrofit.create(CorpusApi::class.java)


    }
}