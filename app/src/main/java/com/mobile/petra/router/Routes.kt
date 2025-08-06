package com.mobile.petra.router

sealed class Routes(val route: String) {

    object Home : Routes("home")
    object SignIn : Routes("/sign-in")
    object SignUp : Routes("/sign-up")
    object ProductsListing : Routes("/products-listing")
    object ProductDetail : Routes("/product-details")


}
