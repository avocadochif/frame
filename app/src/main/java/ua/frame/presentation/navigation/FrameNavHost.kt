package ua.frame.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ua.frame.other.GreetingRoute
import ua.frame.other.GreetingScreen

@Composable
fun FrameNavHost(
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = GreetingRoute,
        modifier = modifier,
        builder = {
            composable<GreetingRoute> { navBackStackEntry ->
                GreetingScreen(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    )
}