package com.mobile.petra.router

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.annotation.OptIn
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import kotlinx.coroutines.delay

@SuppressLint("NewApi")
@Composable
fun AppNavigators() {
//    val appInBackground = kegowViewModel.isAppInBackground.collectAsState().value
    val navController = rememberNavController()
    val navigation = Navigator(navController)


    NavHost(navController, startDestination = Routes.Home.route) {

//        if (appInBackground == 1) {
//            navigation.navToWelcomeScreen()
//            kegowViewModel.setBackground(0)
//        } else if (appInBackground == 2) {
//            navigation.navToLoginScreen()
//            kegowViewModel.setBackground(0)
//        }

//        composable(Routes.WelcomeScreen.route) {
//            WelcomeBack(navigation, kegowViewModel = kegowViewModel)
//        }
//        composable(Routes.Home.route) {
//            DashboardWithDelay(navigation = navigation, kegowViewModel)
//        }


//        composable(Routes.EnterPhoneNumber.route,
//            deepLinks = listOf(
//                navDeepLink {
//                    uriPattern = if(isDebugConstant){"https://staging-dot-kegow-315917.nw.r.appspot.com/referral/{id}"}else{"https://app.kegow.com/signup/{id}"}
//                    // uriPattern = "https://app.kegow.com/{id}"
//                    action = Intent.ACTION_VIEW
//                }
//            ),
//            arguments = listOf(
//                navArgument(name = "id") {
//                    type = NavType.StringType
//                    defaultValue = ""
//                }
//            )
//        ) { entry ->
//
//            val referral = entry.arguments?.getString("id") ?: ""
//            InputPhoneNumber(
//                navigator = navigation,
//                kegowViewModel = kegowViewModel,
//                referral =  referral
//            )
//
//        }


//        composable(
//            Routes.TransactionsHistory.route + "/{walletNumber}",
//            arguments = listOf(navArgument("walletNumber") {
//                type = NavType.StringType
//            })
//        ) { args ->
//            val state = args.arguments?.getString("walletNumber")
//            TransactionsHistory(
//                navigation = navigation,
//                kegowViewModel = kegowViewModel,
//                walletNumber = state,
//
//                )
//        }


//        composable(Routes.DeactivateCard.route) {
//            DeactivateCard(
//                onNavigateUp = { navController.navigateUp() },
//                onOkayClicked = {
//                    navController.navigate(Routes.KegowApp.route) {
//                        navController.popBackStack(
//                            BottomNavigationScreen.Card.route,
//                            inclusive = true
//                        )
//                    }
//                }
//            )
//        }

    }
}


//@Composable
//fun DashboardWithDelay(
//    navigation: Navigator,
//    kegowViewModel: KegowViewModel,
//
//    ) {
//    val context = LocalContext.current
//    val sharedPreferencesManager = AndroidSharedPreferencesManager(context)
//    val navigateToOnboarding = remember { mutableStateOf(false) }
//    val hideOnboardingScreens = sharedPreferencesManager.getBoolean("hide_onboarding_screen")
//    LaunchedEffect(Unit) {
//        delay(4000)
//        navigateToOnboarding.value = true
//    }
//
//    if (navigateToOnboarding.value) {
//        if (!hideOnboardingScreens)
//            SwipeScreen(navigator = navigation)
//        else
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//                Login(navigator = navigation, kegowViewModel = kegowViewModel)
//            }
//    } else {
//        LauncherScreen()
//    }
//
//}