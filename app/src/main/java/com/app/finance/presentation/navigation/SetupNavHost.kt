package com.app.finance.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.app.finance.presentation.screens.details.MainDetailsScreen
import com.app.finance.presentation.screens.main.MainScreen

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
        composable(route = Screens.MainDetailsScreen.rout + "/{id}", arguments = listOf(navArgument("id") { type = NavType.StringType })) {
            MainDetailsScreen(navController = navController, it.arguments?.getString("id"))
        }
    }
}