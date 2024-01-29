package com.example.intentsandstartingactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentsandstartingactivites.databinding.ActivitySecondBinding
import com.example.intentsandstartingactivites.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    public lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityThirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGoSecond.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}