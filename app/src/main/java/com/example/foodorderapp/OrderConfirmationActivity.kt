package com.example.foodorderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class OrderConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirmation)

        val namaMakananView: TextView = findViewById(R.id.tv_conf_nama_makanan)
        val totalHargaView: TextView = findViewById(R.id.tv_conf_total_harga)
        val kirimButton: Button = findViewById(R.id.btn_kirim_order)

        // 1. Ambil data dari Intent (yang dikirim dari HomeActivity)
        val namaMakanan = intent.getStringExtra("NAMA_MAKANAN") ?: "Menu Tidak Diketahui"
        val hargaMakanan = intent.getIntExtra("HARGA_MAKANAN", 0)

        // 2. Tampilkan data
        namaMakananView.text = "$namaMakanan (x1)"
        totalHargaView.text = "Total: Rp ${hargaMakanan.formatRupiah()}"

        // 3. Logika Tombol Kirim (Pindah ke ShippingAddressActivity / Screen 7)
        kirimButton.setOnClickListener {
            val intent = Intent(this, ShippingAddressActivity::class.java).apply {
                // Kirim ulang data pesanan ke layar alamat (opsional, untuk konfirmasi akhir)
                putExtra("PESANAN_FINAL_NAMA", namaMakanan)
                putExtra("PESANAN_FINAL_HARGA", hargaMakanan)
            }
            startActivity(intent)
        }
    }

    // Fungsi utilitas untuk format harga ke Rupiah
    private fun Int.formatRupiah(): String {
        val formatter = DecimalFormat("#,###")
        return formatter.format(this).replace(',', '.')
    }
}