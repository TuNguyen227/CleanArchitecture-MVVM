package com.example.myapplication.core.data.platform

import com.example.myapplication.Platform
import com.example.myapplication.getPlatform

class Platform {
    private val platform: Platform = getPlatform()

    fun getName(): String = platform.name
}