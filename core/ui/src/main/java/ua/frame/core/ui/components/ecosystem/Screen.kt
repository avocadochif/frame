package ua.frame.core.ui.components.ecosystem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ua.frame.core.ui.viewmodel.FrameViewModel

@Composable
public inline fun <reified ViewModel, reified State, reified Event> Screen(
    modifier: Modifier,
    crossinline content: @Composable BoxScope.(viewModel: ViewModel, uiState: State) -> Unit,
) where ViewModel : FrameViewModel<State, Event>, State : UiState, Event : UiEvent {
    val viewModel = hiltViewModel<ViewModel>()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    Surface(
        modifier = modifier,
        content = {
            Box(
                modifier = Modifier.fillMaxSize(),
                content = {
                    when (uiState == null) {
                        true -> return@Surface
                        false -> content(viewModel, uiState)
                    }
                }
            )
        }
    )
}