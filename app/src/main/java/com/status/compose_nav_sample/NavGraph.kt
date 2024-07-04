package com.status.compose_nav_sample

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetUpNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = NavScreen.Home.route
    ) {

        composable(route = NavScreen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(route = NavScreen.Detail.route) {
            DetailScreen(navHostController = navHostController)
        }
    }
}