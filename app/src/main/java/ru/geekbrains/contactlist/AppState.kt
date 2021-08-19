package ru.geekbrains.contactlist

sealed class AppState {
    class Success(val data: List<String>) : AppState()
    object Loading : AppState()
}
