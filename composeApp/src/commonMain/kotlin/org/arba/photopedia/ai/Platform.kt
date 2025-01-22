package org.arba.photopedia.ai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform