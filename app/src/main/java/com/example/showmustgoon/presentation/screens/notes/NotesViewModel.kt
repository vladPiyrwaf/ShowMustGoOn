package com.example.showmustgoon.presentation.screens.notes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NotesViewModel() : ViewModel() {
    private val _state: MutableStateFlow<NotesScreenState> =
        MutableStateFlow(NotesScreenState())
    val state = _state.asStateFlow()


    fun processCommand(command: CreateNotesCommand) {
        when (command) {

            is CreateNotesCommand.InputContent -> {
                _state.update { previousState ->
                     previousState.copy(title = command.content)

                }
            }

            is CreateNotesCommand.InputTitle -> {
                _state.update { previousState ->
                     previousState.copy(title = command.title)

                }
            }
        }
    }

}

sealed interface CreateNotesCommand {

    data class InputTitle(val title: String) : CreateNotesCommand
    data class InputContent(val content: String) : CreateNotesCommand

}

data class NotesScreenState(
    val title: String = "",
    val content: String = ""

)