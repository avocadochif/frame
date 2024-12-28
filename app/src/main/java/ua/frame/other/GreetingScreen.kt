package ua.frame.other

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.frame.core.ui.components.ecosystem.Screen
import ua.frame.core.ui.theme.FrameTheme

@Composable
fun GreetingScreen(
    modifier: Modifier
) {
    Screen<GreetingViewModel, GreetingUiState, GreetingUiEvent>(
        modifier = modifier,
        content = { viewModel, uiState ->
            Greeting(
                name = "Android",
                modifier = Modifier
            )
        }
    )
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    FrameTheme {
        Greeting("Android")
    }
}