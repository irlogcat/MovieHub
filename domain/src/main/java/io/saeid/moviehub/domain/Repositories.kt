package io.saeid.moviehub.domain

interface TVShowRepository {
    fun getAllShows(): List<TVShow>
}