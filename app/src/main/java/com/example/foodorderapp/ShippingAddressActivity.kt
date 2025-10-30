package com.example.foodorderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Pastikan SuccessActivity di-import karena dipanggil di Intent
import com.example.foodorderapp.SuccessActivity

class ShippingAddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shipping_address) // <-- Baris ini tetap

        // Ambil referensi ke elemen View
        val etNama: EditText = findViewById(R.id.et_nama_lengkap)
        val etEmail: EditText = findViewById(R.id.et_email)
        val etAlamat: EditText = findViewById(R.id.et_alamat_lengkap)
        val btnOrderKirim: Button = findViewById(R.id.btn_order_kirim)

        // Ambil data pesanan dari Intent
        val namaPesanan = intent.getStringExtra("PESANAN_FINAL_NAMA")
        val hargaPesanan = intent.getIntExtra("PESANAN_FINAL_HARGA", 0)

        // Logika Tombol Order dan Kirim
        btnOrderKirim.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val alamat = etAlamat.text.toString().trim()

            if (nama.isNotEmpty() && email.isNotEmpty() && alamat.isNotEmpty()) {
                // Semua field terisi, pindah ke SuccessActivity (Screen 8)
                Toast.makeText(this, "Data Alamat Tersimpan.", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SuccessActivity::class.java).apply {
                    putExtra("NAMA_PELANGGAN", nama)
                    putExtra("NAMA_MAKANAN", namaPesanan)
                    putExtra("HARGA_MAKANAN", hargaPesanan)
                }
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Mohon lengkapi semua data alamat", Toast.LENGTH_SHORT).show()
            }
        }
    }
}