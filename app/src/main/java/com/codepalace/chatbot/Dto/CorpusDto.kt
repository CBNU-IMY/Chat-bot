package com.codepalace.chatbot.Dto

data class CorpusDto(val corpus_id : Int,
                     val status_keyword: String,
                     val physical_illness: String,
                     val emotion_maincategory: String,
                     val emotion_subcategory: String,
                     val human_sentence1: String,
                     val system_response1: String,
                     val human_sentence2: String,
                     val system_response2: String,
                     val human_sentence3: String,
                     val system_response3: String,
                     val human_sentence4: String,
                     val system_response4: String)
