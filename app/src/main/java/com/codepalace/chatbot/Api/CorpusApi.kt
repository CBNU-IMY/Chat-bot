package com.codepalace.chatbot.Api

import com.codepalace.chatbot.Dto.CorpusDto
import retrofit2.Call
import retrofit2.http.*

public interface CorpusApi {


    @GET("/api/corpus/emotion_maincategory/{emotion_maincategory}")
    fun getAllByMaincategoryResponse(
        @Path("emotion_maincategory") emotion_maincategory: String,
    ) : Call<List<CorpusDto>>

/*

    @FormUrlEncoded
    @PUT("api/user/{user_id}")
    fun postUpdateResponse(
        @Path("user_id") user_id: String?,
        @Field("user_pw") user_pw: String,
        @Field("user_phone") user_phone: String,
        @Field("user_name") user_name: String
    ): Call<String>*/

}