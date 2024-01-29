package com.example.intentsandstartingactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentsandstartingactivites.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    public lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnOpenActivity.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}