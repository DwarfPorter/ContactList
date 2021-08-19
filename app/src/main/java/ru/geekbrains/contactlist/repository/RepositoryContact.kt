package ru.geekbrains.contactlist.repository

interface RepositoryContact {
    fun getListOfContact(): List<String>
}