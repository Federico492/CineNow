package com.devspacecinenow

import retrofit2.Call
import retrofit2.http.GET

//create interface second

interface ApiService {
    @GET("now_playing?language=en-US&page=1") //this is your service for NOW PLAYING
    fun getNowPlayingMovies() : Call<MovieResponse>

    @GET("top_rated?language=en-US&page=1") //this is your service for TOP RATED
    fun getTopRatedMovies() : Call<MovieResponse>

    @GET("popular?language=en-US&page=1") //this is your service for POPULAR
    fun getPopularMovies() : Call<MovieResponse>

    @GET("upcoming?language=en-US&page=1") //this is your service for UPCOMING
    fun getUpcomingMovies() : Call<MovieResponse>

}