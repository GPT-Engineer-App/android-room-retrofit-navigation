package com.example.movieapp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.movieapp.model.Movie;

import java.util.List;

@Dao
public interface MovieDao {
    @Insert
    void insert(Movie movie);

    @Update
    void update(Movie movie);

    @Delete
    void delete(Movie movie);

    @Query("SELECT * FROM movies")
    LiveData<List<Movie>> getAllMovies();

    @Query("SELECT * FROM movies WHERE isFavorite = 1")
    LiveData<List<Movie>> getFavoriteMovies();

    @Query("SELECT * FROM movies WHERE isInWatchlist = 1")
    LiveData<List<Movie>> getWatchlistMovies();
}