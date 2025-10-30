package com.example.foodorderapp // Ganti dengan nama paket Anda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val namaInput: EditText = findViewById(R.id.et_nama_register)
        val usernameInput: EditText = findViewById(R.id.et_username_register)
        val passwordInput: EditText = findViewById(R.id.et_password_register)
        val registerButton: Button = findViewById(R.id.btn_register)
        val toLoginText: TextView = findViewById(R.id.tv_to_login)

        // 1. Logika Tombol Register
        registerButton.setOnClickListener {
            val nama = namaInput.text.toString().trim()
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            // Pemeriksaan dasar
            if (nama.isNotEmpty() && username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Pendaftaran berhasil! Silakan Login.", Toast.LENGTH_LONG).show()

                // Pindah kembali ke LoginActivity (Screen 3)
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() // Menutup Register agar alur kembali ke Login
            } else {
                Toast.makeText(this, "Mohon lengkapi semua data", Toast.LENGTH_SHORT).show()
            }
        }

        // 2. Logika Navigasi ke Login
        toLoginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}