package com.example.myapplication

import com.example.myapplication.core.data.platform.Platform
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidPlatformTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Platform()
            .greet().contains("Android"))
    }
}