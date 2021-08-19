package ru.geekbrains.contactlist.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.contactlist.AppState
import ru.geekbrains.contactlist.repository.RepositoryContact
import ru.geekbrains.contactlist.repository.RepositoryContactImpl

class MainViewModel(private val repository: RepositoryContact = RepositoryContactImpl()) : ViewModel() {
    val contacts: MutableLiveData<AppState> = MutableLiveData()

    fun getContacts(){
        contacts.value = AppState.Loading
        val answer = repository.getListOfContact()
        contacts.value = AppState.Success(answer)
    }
}