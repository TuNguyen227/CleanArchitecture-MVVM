package com.example.myapplication

import com.example.myapplication.core.data.platform.Platform
import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Platform().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}