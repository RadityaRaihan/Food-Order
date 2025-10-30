package com.example.foodorderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderapp.HomeActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val backHomeButton: Button = findViewById(R.id.btn_back_home)

        // Ambil data dari Intent jika ingin menampilkan ringkasan di layar sukses (opsional)
        val namaPelanggan = intent.getStringExtra("NAMA_PELANGGAN") ?: "Pengguna"
        Toast.makeText(this, "Order atas nama $namaPelanggan berhasil!", Toast.LENGTH_LONG).show()

        // Logika Tombol Kembali ke Home
        backHomeButton.setOnClickListener {
            // Membuat Intent baru ke HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            // Menghapus semua Activity sebelumnya (agar tidak bisa kembali ke formulir/sukses)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}