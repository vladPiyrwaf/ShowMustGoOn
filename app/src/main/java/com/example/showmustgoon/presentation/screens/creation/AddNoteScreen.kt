package com.example.showmustgoon.presentation.screens.creation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.showmustgoon.domain.Note

@Composable
fun NotesScreen(
    modifier: Modifier = Modifier,
    viewModel: AddNoteViewModel = viewModel(),
    onNoteClick1: (Note) -> Unit// плэйсхолдер для коллбэка который мы реализуем в навигации
) {
   // Scaffold(
        //modifier = modifier

            //) {}
}