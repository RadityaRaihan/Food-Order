package com.example.foodorderapp // Ganti dengan nama paket Anda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AuthSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_selection)

        val signupButton: Button = findViewById(R.id.btn_signup)
        val loginButton: Button = findViewById(R.id.btn_login)

        // Logika Tombol Sign Up (pindah ke RegisterActivity / Screen 4)
        signupButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Logika Tombol Login (pindah ke LoginActivity / Screen 3)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}