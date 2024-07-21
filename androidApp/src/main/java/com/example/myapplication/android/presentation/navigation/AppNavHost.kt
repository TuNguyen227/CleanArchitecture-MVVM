package com.example.myapplication.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.android.presentation.loginscreen.navigation.homeScreen
import com.example.myapplication.android.presentation.loginscreen.navigation.loginScreen
import com.example.myapplication.android.utils.AppConstains

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    startDestination: String = AppConstains.LOGIN_ROUTE,
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        loginScreen {
            navController.navigate(AppConstains.HOME_ROUTE)
        }

        homeScreen()
    }
}