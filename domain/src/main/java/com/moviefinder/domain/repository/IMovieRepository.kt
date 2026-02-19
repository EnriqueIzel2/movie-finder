package com.moviefinder.domain.repository

import com.moviefinder.domain.model.Movie

interface IMovieRepository {
    suspend fun getMovies(): Result<List<Movie>>

    suspend fun getMovieDetails(id: Int): Result<Movie>
}