package ua.frame.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import ua.frame.core.ui.theme.FrameTheme
import ua.frame.presentation.navigation.FrameNavHost

@Composable
fun FrameApp(
    navController: NavHostController
) {
    FrameTheme(
        darkTheme = false,
        dynamicColor = false,
        content = {
            FrameNavHost(
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
        }
    )
}