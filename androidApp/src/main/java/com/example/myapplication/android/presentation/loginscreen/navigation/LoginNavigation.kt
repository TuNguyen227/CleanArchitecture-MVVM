package com.example.myapplication.android.presentation.loginscreen.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.android.presentation.loginscreen.LoginRoute
import com.example.myapplication.android.utils.AppConstains

val LOGIN_ROUTE = AppConstains.LOGIN_ROUTE


fun NavGraphBuilder.loginScreen(
    onLogin : () -> Unit
) {
    composable(route = LOGIN_ROUTE) {
        LoginRoute(onLogin = onLogin)
    }
}