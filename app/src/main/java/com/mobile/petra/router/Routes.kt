package com.mobile.petra.router

sealed class Routes(val route: String) {

    object Home : Routes("home")
    object Details : Routes("details")

}
