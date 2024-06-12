package com.example.movieapp.network;

import com.example.movieapp.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("movies")
    Call<List<Movie>> getMovies();
}