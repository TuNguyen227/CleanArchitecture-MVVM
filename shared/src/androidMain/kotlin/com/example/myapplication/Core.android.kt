package com.example.myapplication

import com.example.myapplication.data.PlatformRepository


actual fun getPlatform(): Platform = PlatformRepository()