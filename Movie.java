package com.example.movieapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movies")
public class Movie {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private boolean isFavorite;
    private boolean isInWatchlist;

    // Getters and Setters
}