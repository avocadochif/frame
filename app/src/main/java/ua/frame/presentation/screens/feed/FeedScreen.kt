package ua.frame.presentation.screens.feed

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.frame.core.ui.components.ecosystem.Screen

@Composable
fun FeedScreen() {
    Screen<FeedViewModel, FeedUiState, FeedUiEvent>(
        modifier = Modifier.fillMaxSize(),
        content = { viewModel, uiState ->
            Content(
                modifier = Modifier.fillMaxSize()
            )
        }
    )
}

@Composable
private fun Content(
    modifier: Modifier
) {

}

@Preview
@Composable
private fun ContentPreview() {

}
