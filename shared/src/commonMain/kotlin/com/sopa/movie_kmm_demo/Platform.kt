package com.sopa.movie_kmm_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform