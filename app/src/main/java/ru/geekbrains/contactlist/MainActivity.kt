package ru.geekbrains.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.contactlist.databinding.MainActivityBinding
import ru.geekbrains.contactlist.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}