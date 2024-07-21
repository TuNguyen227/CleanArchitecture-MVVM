package com.example.myapplication.data

import com.example.myapplication.Platform
import platform.UIKit.UIDevice

internal class PlatformRepository : Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}