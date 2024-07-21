package com.example.myapplication

import com.example.myapplication.core.data.platform.Platform
import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Platform().greet().contains("iOS"), "Check iOS is mentioned")
    }
}