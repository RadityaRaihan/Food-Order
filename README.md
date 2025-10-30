🍔 Aplikasi Mesen Makanan (Food Order App Prototype)
 
💡 Deskripsi Proyek
Aplikasi Pemesanan Makanan adalah prototipe sederhana berbasis Android (Kotlin). Proyek ini berfungsi untuk mendemonstrasikan alur dasar pemesanan, mulai dari Activity autentikasi hingga menampilkan daftar menu dinamis dan simulasi checkout.
Proyek ini menyoroti implementasi RecyclerView untuk daftar menu, BottomNavigationView untuk navigasi utama, dan penanganan resource (gambar dan warna) agar user interface terlihat clean dan fungsional.
________________


🖼️ Tampilan Aplikasi (Alur Pengguna)
Berikut adalah alur Activity utama yang disimulasikan dalam aplikasi ini:
* Welcome & Autentikasi: Pengguna memulai dari [SplashActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/SplashActivity.png), dilanjutkan ke [AuthSelectionActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/AuthSelectionActivity.png) (memilih Login atau Sign Up), yang kemudian menavigasi ke [LoginActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/LoginActivity.png) atau [RegisterActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/RegisterActivity.png).
* Daftar Menu (Home): Setelah melewati autentikasi, pengguna masuk ke [HomeActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/HomeActivity.png). Halaman ini menampilkan daftar menu makanan yang dapat di-scroll.
* Pemesanan: Mengetuk item menu pada RecyclerView akan langsung mengarahkan pengguna ke [OrderConfirmationActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/OrderConfirmationActivity.png) untuk memulai proses pemesanan.
* Navigasi Utama: HomeActivity dilengkapi dengan BottomNavigationView yang fungsional, menavigasi ke Home, Order, dan Profile.
* Checkout & Selesai: Alur simulasi dilanjutkan ke [ShippingAddressActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/ShippingAddressActivity.png) dan diakhiri di [SuccessActivity](https://github.com/RadityaRaihan/Food-Order/blob/main/assests/SuccessActivity.png) (berdasarkan deklarasi di AndroidManifest.xml).


✨ Fitur dan Peningkatan Utama
Proyek Aplikasi Pemesanan Makanan ini memiliki beberapa fitur inti dan perbaikan penting yang meningkatkan fungsionalitas dan pengalaman pengguna (UX):

Daftar Menu Dinamis: Kami berhasil mengimplementasikan RecyclerView di HomeActivity. Fitur ini menampilkan daftar makanan yang lengkap dengan data dinamis, termasuk gambar (R.drawable.), nama, deskripsi, dan harga untuk setiap item menu.

Navigasi Kontras (UX): Salah satu perbaikan utama adalah pada BottomNavigationView. Navigasi ini dikonfigurasi menggunakan Color Selector (bottom_nav_color.xml) untuk memastikan ikon dan teks terlihat jelas (kontras) di atas background yang gelap, sehingga meningkatkan aksesibilitas dan tampilan antarmuka pengguna.

Navigasi Fungsional: Semua tombol navigasi utama telah dihubungkan. Tombol di AuthSelectionActivity (Login/Sign Up) berfungsi penuh, dan Item Selected Listener pada Bottom Nav (untuk Order/Profile) berhasil menavigasi pengguna ke Activity tujuan yang sesuai.

Alur Pemesanan Dasar: Kami mengimplementasikan Click Listener pada setiap item menu di RecyclerView. Fitur ini berfungsi sebagai simulasi Order, yang akan langsung menavigasi pengguna ke OrderConfirmationActivity untuk melanjutkan proses pemesanan.

Perbaikan Stabilitas Tema: Koreksi krusial dilakukan pada AndroidManifest.xml untuk mengatasi masalah crash tema (Theme.AppCompat) yang terjadi saat aplikasi mencoba berpindah antar Activity. Stabilitas aplikasi kini terjamin selama alur navigasi.


🚀 Teknologi yang Digunakan
* Bahasa: [Kotlin](https://kotlinlang.org/)
* UI Komponen: RecyclerView, BottomNavigationView, ConstraintLayout, Material Design Components.
* Arsitektur: AppCompatActivity dan Intent (untuk navigasi).
* Struktur Data: Data Class (Makanan.kt).


⚙️ Cara Menjalankan Proyek
Clone repositori ini:
Bash
git clone https://github.com/RadityaRaihan/Food-Order.git
1. 2. Buka proyek menggunakan Android Studio.
3. Jalankan aplikasi pada emulator atau perangkat Android fisik.






