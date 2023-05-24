package com.example.latihanactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.latihanactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnKirim.setOnClickListener(){
            sendMessage()
        }
        setContentView(binding.root)
        Log.d("lifecycle", "OnCreate dimulai")
    }
    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "OnStart dimulai")
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "OnResume dimulai")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "OnRestart dimulai")
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "OnPause dimulai")
    }
    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "OnStop dimulai")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "OnDestroy Dimulai")
    }

    fun sendMessage(){
        val nama2 = binding.etNama.text.toString()
        val email2 = binding.etEmail.text.toString()
        val alamat2 = binding.etAlamat.text.toString()
        val hp2 = binding.etHp.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nama", nama2)
        intent.putExtra("email", email2)
        intent.putExtra("alamat", alamat2)
        intent.putExtra("no.Hp", hp2)
        startActivity(intent)
    }

}