package com.example.myapplication.android.presentation.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.android.presentation.theme.MyApplicationTheme


@Composable
fun LoginRoute(
    viewModel: LoginViewModel = LoginViewModel(),
    onLogin: () -> Unit
) {
    val isLogin = viewModel.isLogin.collectAsState().value
    LaunchedEffect(isLogin) {
        if (isLogin) {
            onLogin()
        }
    }
    LoginScreen(onLogin = viewModel::login)
}

@Composable
fun LoginScreen(
    onLogin: () -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White), contentAlignment = Alignment.Center) {
        Button(onClick = onLogin) {
            Text(text = "Login")
        }
    }
}

@Preview(device = Devices.PIXEL_3)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        LoginScreen(
            onLogin = {}
        )
    }
}