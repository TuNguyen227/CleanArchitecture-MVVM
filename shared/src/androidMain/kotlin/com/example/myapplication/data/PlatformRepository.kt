package com.example.myapplication.data

import com.example.myapplication.Platform

internal class PlatformRepository : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
