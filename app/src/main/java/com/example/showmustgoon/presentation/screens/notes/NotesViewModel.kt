package com.example.showmustgoon.presentation.screens.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.showmustgoon.data.NotesRepository
import com.example.showmustgoon.domain.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val repository: NotesRepository) : ViewModel() {

    private val _state = MutableStateFlow(NotesScreenState())
    val state = _state.asStateFlow()

    init {
        repository.getAllNotes()
            .onEach { notes ->
                _state.update { it.copy(notes = notes) }
            }
            .launchIn(viewModelScope)
    }
}

data class NotesScreenState(

    val notes: List<Note> = listOf(),

    )