package com.example.intentsandstartingactivites

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentsandstartingactivites.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {

    public lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
               Intent(this,MainActivity::class.java).also {
               startActivity(it)
           }
//            finish()
        }

        binding.btnNext.setOnClickListener {
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}