package ua.frame.core.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
import ua.frame.core.ui.components.ecosystem.UiEvent
import ua.frame.core.ui.components.ecosystem.UiState

public abstract class FrameViewModel<S : UiState, E : UiEvent> : ViewModel() {

    public abstract val uiState: StateFlow<S?>

    public abstract fun onEvent(event: E)

}