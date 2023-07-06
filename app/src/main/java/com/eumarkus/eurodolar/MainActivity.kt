package com.eumarkus.eurodolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eumarkus.eurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConvert.setOnClickListener {
            val euros = binding.editEuro.text.toString().toDouble()
            val dolares =   String.format("%.2f", euros * 0.8)

            binding.txtDolar.text = "${dolares} $"
        }
    }
}