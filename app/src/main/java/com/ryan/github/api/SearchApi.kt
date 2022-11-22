package com.ryan.github.api

import com.ryan.github.data.model.SearchUserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApi {

    companion object {
        const val BASE_URL = "https://api.github.com/"
        const val SEARCH_ITEM_LIMIT = 15
    }

    @GET("search/users")
    suspend fun searchUsers(
        @Query("q") query: String,
        @Query("per_page") limit: Int = SEARCH_ITEM_LIMIT,
        @Query("page") page: Int = 1
    ): SearchUserResponse
}