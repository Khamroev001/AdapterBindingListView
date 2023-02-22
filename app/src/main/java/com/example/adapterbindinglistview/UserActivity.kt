package com.example.adapterbindinglistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adapterbindinglistview.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}