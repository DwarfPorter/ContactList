package ru.geekbrains.contactlist

import android.app.Application
import android.content.Context

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        lateinit var context: Context
    }
}

interface IContextProvider{
    val context: Context
}

object ContextProvider: IContextProvider{
    override val context: Context
        get() = App.context
}