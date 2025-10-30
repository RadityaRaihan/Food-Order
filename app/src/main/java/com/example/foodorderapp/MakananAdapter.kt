package com.example.foodorderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.DecimalFormat

class MakananAdapter(
    private val listMakanan: List<Makanan>,
    private val clickListener: (Makanan) -> Unit // Untuk menangani klik
) : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    // 1. ViewHolder: Menampung referensi ke view dari item_makanan.xml
    class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nama: TextView = itemView.findViewById(R.id.tv_nama_makanan)
        val deskripsi: TextView = itemView.findViewById(R.id.tv_deskripsi_makanan)
        val harga: TextView = itemView.findViewById(R.id.tv_harga_makanan)
        val gambar: ImageView = itemView.findViewById(R.id.iv_makanan)
        val layout: LinearLayout = itemView.findViewById(R.id.item_layout)
    }

    // 2. Membuat ViewHolder baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_makanan, parent, false)
        return MakananViewHolder(view)
    }

    // 3. Menghubungkan data ke ViewHolder
    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = listMakanan[position]

        holder.nama.text = makanan.nama
        holder.deskripsi.text = makanan.deskripsi

        // KODE YANG DIPERBAIKI: Panggil formatRupiah() langsung pada Int (makanan.harga)
        holder.harga.text = "Rp ${makanan.harga.formatRupiah()}"

        holder.gambar.setImageResource(makanan.imageResId)

        // Tambahkan Aksi Klik
        holder.layout.setOnClickListener {
            clickListener(makanan)
        }
    }

    // 4. Mengembalikan jumlah item
    override fun getItemCount() = listMakanan.size
}


// -------------------------------------------------------------
// FUNGSI EKSTENSI GLOBAL UNTUK FORMAT RUPIAH
// -------------------------------------------------------------

fun Int.formatRupiah(): String {
    val formatter = DecimalFormat("#,###")
    return formatter.format(this).replace(',', '.')
}