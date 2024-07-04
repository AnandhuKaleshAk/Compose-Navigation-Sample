package com.status.compose_nav_sample

sealed class NavScreen(val route:String) {
    data object Home:NavScreen("home_screen")
    data object Detail:NavScreen("detail_screen")
}