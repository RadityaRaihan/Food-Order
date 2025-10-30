package com.example.foodorderapp // Ganti dengan nama paket Anda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput: EditText = findViewById(R.id.et_username_login)
        val passwordInput: EditText = findViewById(R.id.et_password_login)
        val loginButton: Button = findViewById(R.id.btn_login)
        val toRegisterText: TextView = findViewById(R.id.tv_to_register)

        // 1. Logika Tombol Login
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            // Pemeriksaan dasar (Anda bisa ganti dengan logika autentikasi yang sebenarnya)
            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()

                // Pindah ke HomeActivity (Screen 5)
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Menghindari kembali ke layar Login
            } else {
                Toast.makeText(this, "Mohon isi Username dan Password", Toast.LENGTH_SHORT).show()
            }
        }

        // 2. Logika Navigasi ke Register (Sesuai panah di wireframe)
        toRegisterText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish() // Opsional: Menutup Login agar alur lebih jelas
        }
    }
}