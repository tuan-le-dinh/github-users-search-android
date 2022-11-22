package com.ryan.github.data

import androidx.paging.PagingSource
import com.ryan.github.api.SearchApi
import com.ryan.github.data.model.User
import retrofit2.HttpException
import java.io.IOException

private const val STARTING_PAGE_INDEX = 1

class SearchPagingSource(
    private val searchApi: SearchApi,
    private val query: String
) : PagingSource<Int, User>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, User> {
        val position = params.key ?: STARTING_PAGE_INDEX

        return try {
            val response = searchApi.searchUsers(query, page = position)
            val users = response.users

            LoadResult.Page(
                data = users,
                prevKey = null, // Only paging forward
                nextKey = if (users.isEmpty()) null else position + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}