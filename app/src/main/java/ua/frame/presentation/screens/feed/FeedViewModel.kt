package ua.frame.presentation.screens.feed

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ua.frame.core.ui.viewmodel.FrameViewModel
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor() : FrameViewModel<FeedUiState, FeedUiEvent>() {

    private val _uiState = MutableStateFlow<FeedUiState?>(value = null)
    override val uiState: StateFlow<FeedUiState?> = _uiState.asStateFlow()

    override fun onEvent(event: FeedUiEvent) {

    }

}