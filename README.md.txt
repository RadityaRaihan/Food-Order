🍔 Aplikasi Mesen Makanan (Food Order App Prototype)
💡 Deskripsi Proyek
Aplikasi Pemesanan Makanan adalah prototipe sederhana berbasis Android (Kotlin). Proyek ini berfungsi untuk mendemonstrasikan alur dasar pemesanan, mulai dari Activity autentikasi hingga menampilkan daftar menu dinamis dan simulasi checkout.
Proyek ini menyoroti implementasi RecyclerView untuk daftar menu, BottomNavigationView untuk navigasi utama, dan penanganan resource (gambar dan warna) agar user interface terlihat clean dan fungsional.
________________


🖼️ Tampilan Aplikasi (Alur Pengguna)
Berikut adalah alur Activity utama yang disimulasikan dalam aplikasi ini:
* Welcome & Autentikasi: Pengguna memulai dari SplashActivity, dilanjutkan ke AuthSelectionActivity (memilih Login atau Sign Up), yang kemudian menavigasi ke LoginActivity atau RegisterActivity.
* Daftar Menu (Home): Setelah melewati autentikasi, pengguna masuk ke HomeActivity. Halaman ini menampilkan daftar menu makanan yang dapat di-scroll.
* Pemesanan: Mengetuk item menu pada RecyclerView akan langsung mengarahkan pengguna ke OrderConfirmationActivity untuk memulai proses pemesanan.
* Navigasi Utama: HomeActivity dilengkapi dengan BottomNavigationView yang fungsional, menavigasi ke Home, Order, dan Profile.
* Checkout & Selesai: Alur simulasi dilanjutkan ke ShippingAddressActivity dan diakhiri di SuccessActivity (berdasarkan deklarasi di AndroidManifest.xml).
________________


✨ Fitur Utama
Fitur
	Detail Implementasi
	Daftar Menu Dinamis
	Implementasi RecyclerView yang menampilkan daftar makanan lengkap dengan data gambar (R.drawable.), nama, deskripsi, dan harga yang bersumber dari fungsi dummy (generateDummyMenu).
	Navigasi Kontras (UX)
	BottomNavigationView dikonfigurasi dengan Color Selector (bottom_nav_color.xml) untuk memastikan ikon dan teks terlihat jelas dan kontras, memperbaiki masalah visibilitas ikon.
	Navigasi Penuh
	Tombol di AuthSelectionActivity berfungsi penuh. Navigasi Home, Order, dan Profile di Bottom Nav juga sudah dihubungkan ke Activity tujuan.
	Penanganan Data Model
	Penggunaan Data Class (Makanan.kt) untuk struktur data menu yang bersih dan mudah dikelola.
	Perbaikan Tema
	Koreksi pada AndroidManifest.xml dan file tema untuk mengatasi crash tema (Theme.AppCompat) saat berpindah Activity.
	________________


🚀 Teknologi yang Digunakan
* Bahasa: Kotlin
* UI Komponen: RecyclerView, BottomNavigationView, ConstraintLayout, Material Design Components.
* Arsitektur: AppCompatActivity dan Intent (untuk navigasi).
* Struktur Data: Data Class (Makanan.kt).
________________


📸 Tangkapan Layar Aplikasi
Pastikan semua gambar di bawah ini sudah Anda upload di folder screenshots/.
1. Halaman Utama (Home Screen)
Menampilkan daftar menu dinamis dengan gambar dan Bottom Navigation yang fungsional.
2. Detail Navigasi Bawah
Visualisasi Bottom Navigation Bar yang sudah dikoreksi agar ikon dan teks memiliki kontras yang jelas.
3. Alur Autentikasi
Titik awal alur pengguna yang menavigasi ke Login atau Register.
________________


⚙️ Cara Menjalankan Proyek
Clone repositori ini:
Bash
git clone [LINK_REPOSITORY_ANDA]
1. 2. Buka proyek menggunakan Android Studio.
3. Jalankan aplikasi pada emulator atau perangkat Android fisik.