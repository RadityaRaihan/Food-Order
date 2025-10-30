package com.example.foodorderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
// Import untuk formatRupiah jika Anda meletakkannya sebagai fungsi top-level di MakananAdapter.kt
// import com.example.foodorderapp.formatRupiah


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Baris yang Anda miliki: setContentView(R.layout.activity_home) sudah BENAR.
        setContentView(R.layout.activity_home)

        // HAPUS SEMUA KODE EDGE-TO-EDGE DI SINI
        // val backHomeButton: Button = findViewById(R.id.btn_back_home) <--- Ganti dengan logika HomeActivity

        // 1. Persiapan Data (Minimal 10 Menu)
        val daftarMakanan = generateDummyMenu()

        // 2. Setup RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.rv_makanan)

        // 3. Setup Adapter dengan Click Listener
        val adapter = MakananAdapter(daftarMakanan) { makananDipilih ->
            // Aksi ketika item makanan diklik: Pindah ke OrderConfirmationActivity (Screen 6)
            Toast.makeText(this, "Memilih ${makananDipilih.nama}", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, OrderConfirmationActivity::class.java).apply {
                putExtra("NAMA_MAKANAN", makananDipilih.nama)
                putExtra("HARGA_MAKANAN", makananDipilih.harga)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }

    private fun generateDummyMenu(): List<Makanan> {
        // Ganti R.drawable.ic_launcher_background dengan ID gambar makanan Anda
        val dummyImageId = R.drawable.ic_launcher_background

        return listOf(
            Makanan("Nasi Goreng Spesial", "Nasi digoreng dengan bumbu rahasia.", 25000, dummyImageId),
            Makanan("Ayam Geprek Sambal Matah", "Ayam krispi digeprek dengan sambal matah pedas.", 22000, dummyImageId),
            Makanan("Mie Ayam Bakso", "Mie kenyal dengan topping ayam dan bakso.", 18000, dummyImageId),
            Makanan("Sate Ayam Madura", "10 tusuk sate ayam dengan bumbu kacang.", 30000, dummyImageId),
            Makanan("Gado-Gado Lontong", "Sayuran segar dengan bumbu kacang.", 20000, dummyImageId),
            Makanan("Soto Betawi Daging", "Soto kuah santan dengan daging sapi.", 35000, dummyImageId),
            Makanan("Martabak Manis Cokelat", "Martabak tebal dengan taburan cokelat.", 32000, dummyImageId),
            Makanan("Es Jeruk Peras", "Jeruk segar diperas dan disajikan dingin.", 10000, dummyImageId),
            Makanan("Kopi Susu Dingin", "Kopi kekinian dengan susu creamy.", 15000, dummyImageId),
            Makanan("Nasi Uduk Komplit", "Nasi gurih dengan lauk komplit.", 28000, dummyImageId),
            Makanan("Tahu Tek Surabaya", "Tahu goreng dengan bumbu petis spesial.", 21000, dummyImageId)
        )
    }
}