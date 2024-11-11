package ua.frame

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ua.frame.core.ui.viewmodel.FrameViewModel
import javax.inject.Inject

@HiltViewModel
class GreetingViewModel @Inject constructor() : FrameViewModel<GreetingUiState, GreetingUiEvent>() {

    private val _uiState = MutableStateFlow<GreetingUiState?>(value = GreetingUiState)
    override val uiState: StateFlow<GreetingUiState?> = _uiState.asStateFlow()

    override fun onEvent(event: GreetingUiEvent) {
        TODO("Not yet implemented")
    }
}