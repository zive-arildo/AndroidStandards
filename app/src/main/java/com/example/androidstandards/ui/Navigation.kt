package com.example.androidstandards.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.androidstandards.ui.Destinations.DETAIL_ROUTE
import com.example.androidstandards.ui.DestinationsArgs.IMAGE_URL_ARG
import com.example.androidstandards.ui.Routes.DETAIL
import com.example.androidstandards.ui.Routes.HOME
import com.example.androidstandards.ui.screens.DetailScreen
import com.example.androidstandards.ui.screens.HomeScreen

private object Routes {
    const val HOME = "home"
    const val DETAIL = "detail"
}

object DestinationsArgs {
    const val IMAGE_URL_ARG = "imageUrl"
}

object Destinations {
    const val DETAIL_ROUTE = "$DETAIL?$IMAGE_URL_ARG={$IMAGE_URL_ARG}"
}

@Composable
fun AndroidStandardsNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = HOME,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = HOME) {
            HomeScreen(
                onItemClick = { imageUrl ->
                    navController.navigate("$DETAIL?$IMAGE_URL_ARG=$imageUrl")
                }
            )
        }
        composable(
            route = DETAIL_ROUTE,
            arguments = listOf(
                navArgument(IMAGE_URL_ARG) { type = NavType.StringType; defaultValue = "" }
            )
        ) {
            val imageUrl = it.arguments?.getString(IMAGE_URL_ARG) ?: ""
            DetailScreen(imageUrl = imageUrl)
        }
    }
}