package com.ryan.github.data.model


import com.google.gson.annotations.SerializedName

data class SearchUserResponse(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val users: List<User>,
    @SerializedName("total_count")
    val totalCount: Int
)