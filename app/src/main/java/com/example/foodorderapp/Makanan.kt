package com.example.foodorderapp

data class Makanan(
    val nama: String,
    val deskripsi: String,
    val harga: Int, // Harga dalam Rupiah
    val imageResId: Int // ID gambar (misalnya R.drawable.nasi_goreng)
)