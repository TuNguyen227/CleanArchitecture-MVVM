package com.example.myapplication.android.presentation.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.android.presentation.loginscreen.LoginScreen
import com.example.myapplication.android.presentation.loginscreen.LoginViewModel
import com.example.myapplication.android.presentation.theme.MyApplicationTheme
@Composable
fun HomeRoute(
    viewModel: LoginViewModel = LoginViewModel()
) {
    HomeScreen()
}
@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize().background(Color.White))
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        HomeScreen()
    }
}