package com.f55119087.sriwidyaningrum_tugaspraktikum.api

import com.f55119087.sriwidyaningrum_tugaspraktikum.data.model.DetailUser
import com.f55119087.sriwidyaningrum_tugaspraktikum.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users" )
    @Headers( "Authorization: token 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" )

    fun getSearchUsers (
        @Query ( "q" ) query : String
    ): Call<UserResponse>

    @GET( "users/{username}" )
    @Headers( "Authorization: token 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" )

    fun getUserDetail (
        @Path ( "username" ) username : String
    ): Call<DetailUser>
}