package com.example.showmustgoon.presentation.screens.notes

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.example.showmustgoon.domain.Note
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NotesScreen(
    modifier: Modifier = Modifier,
    viewModel: NotesViewModel = viewModel(),
    onNoteClick1: (Note) -> Unit// плэйсхолдер для коллбэка который мы реализуем в навигации
) {
    Scaffold(
        modifier = modifier

        ) {}
}