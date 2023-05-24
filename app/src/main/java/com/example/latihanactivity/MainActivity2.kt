package com.example.latihanactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanactivity.databinding.ActivityMain2Binding
import com.example.latihanactivity.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val name = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val address = intent.getStringExtra("alamat")
        val number = intent.getStringExtra("no.Hp")
        binding.tvNama.text = name.toString()
        binding.tvEmail.text = email.toString()
        binding.tvAlamat.text = address.toString()
        binding.tvHp.text = number.toString()
        setContentView(binding.root)
    }
}