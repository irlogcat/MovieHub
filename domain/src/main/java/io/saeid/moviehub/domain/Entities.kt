package io.saeid.moviehub.domain

import java.util.*

data class TVShow(
        val id: Int,
        val name: String,
        val summary: String,
        val schedule: Schedule,
        val tvNetwork: TVNetwork,
        val url: String
        //...
)

data class TVNetwork(
        val id: Int
        //...
)

data class Schedule(
        val time: Date
        //...
)