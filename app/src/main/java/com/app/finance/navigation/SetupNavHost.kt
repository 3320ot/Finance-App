package com.app.finance.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.finance.screens.main.MainScreen
import com.app.finance.screens.mainDetails.MainDetailsScreen

sealed class Screens(val rout: String) {
    object MainScreen: Screens(rout = "main_screen")
    object MainDetailsScreen: Screens(rout = "main_details_screen")
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.rout
    ) {
        composable(route = Screens.MainScreen.rout) {
            MainScreen(navController = navController)
        }
        composable(route = Screens.MainDetailsScreen.rout) {
            MainDetailsScreen(navController = navController)
        }
    }
}