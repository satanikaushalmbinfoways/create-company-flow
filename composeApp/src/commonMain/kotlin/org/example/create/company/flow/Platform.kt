package org.example.create.company.flow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform