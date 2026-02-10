package com.example.showmustgoon.data

import com.example.showmustgoon.domain.Note
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class NotesRepository {
    private val notesFlow = MutableStateFlow(
        listOf(
            Note(1, "Первая заметка", "Привет, Влад!"),
            Note(2, "Вторая заметка", "Как дела?")
        )
    )
    fun getAllNotes(): Flow<List<Note>> = notesFlow
}