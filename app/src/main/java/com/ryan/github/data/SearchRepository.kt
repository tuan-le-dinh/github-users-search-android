package com.ryan.github.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.ryan.github.api.SearchApi
import com.ryan.github.api.SearchApi.Companion.SEARCH_ITEM_LIMIT
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchRepository @Inject constructor(private val searchApi: SearchApi) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = SEARCH_ITEM_LIMIT,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { SearchPagingSource(searchApi, query) }
        ).liveData
}