package com.example.myapplication

import com.example.myapplication.data.PlatformRepository
import platform.UIKit.UIDevice

actual fun getPlatform(): Platform = PlatformRepository()