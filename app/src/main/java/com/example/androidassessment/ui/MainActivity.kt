package com.example.androidassessment.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidassessment.R
import com.example.androidassessment.databinding.ActivityMainBinding
import org.koin.android.ext.android.getKoin

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initViewModel()
        initViews()
    }

    private fun initViews() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = viewModel
        }
    }

    private fun initViewModel() {
        viewModel = MainActivityViewModel(getKoin().get())
    }
}
