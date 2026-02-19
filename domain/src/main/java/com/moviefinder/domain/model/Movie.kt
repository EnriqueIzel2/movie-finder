package com.moviefinder.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val backdropUrl: String,
    val overview: String,
    val releaseDate: String,
    val voteAverage: Double
)