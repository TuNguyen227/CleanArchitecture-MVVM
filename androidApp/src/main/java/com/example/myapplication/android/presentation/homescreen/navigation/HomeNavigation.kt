package com.example.myapplication.android.presentation.loginscreen.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.android.presentation.homescreen.HomeRoute
import com.example.myapplication.android.utils.AppConstains

val HOME_ROUTE = AppConstains.HOME_ROUTE

fun NavGraphBuilder.homeScreen(
) {
    composable(route = HOME_ROUTE) {
        HomeRoute()
    }
}