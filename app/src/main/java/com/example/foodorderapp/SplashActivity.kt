package com.example.foodorderapp // Ganti dengan nama paket Anda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // 1. Temukan Tombol
        val startButton: Button = findViewById(R.id.btn_start_now)

        // 2. Tambahkan Listener untuk menangani klik
        startButton.setOnClickListener {
            // 3. Buat Intent untuk pindah ke AuthSelectionActivity (Screen 2)
            val intent = Intent(this, AuthSelectionActivity::class.java)
            startActivity(intent)

            // Opsional: Hentikan SplashActivity agar tidak bisa kembali ke sini
            finish()
        }
    }
}