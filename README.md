# Sistem Informasi Manajemen Aset Digital

Proyek Java berbasis Object-Oriented Programming (OOP) yang dikembangkan untuk mengelola berbagai jenis aset digital menggunakan kombinasi **Abstract Class** dan **Interface**, serta menerapkan konsep polimorfisme, pewarisan (*inheritance*), dan *runtime type checking*.

## 📌 Fitur & Struktur Program

Program ini mengimplementasikan beberapa pilar OOP utama:
1. **Abstract Class (`AsetDigital`)**: Berperan sebagai kelas induk universal yang mendefinisikan atribut dasar (`id`, `namaFile`, `ukuranMB`), *constructor*, metode konkrit `getInfo()`, dan metode abstrak `tampilkanPreview()`.
2. **Subclass Konkret (`Gambar`, `Video`, `Dokumen`)**: Mewarisi `AsetDigital` dan meng-*override* metode `tampilkanPreview()` untuk menampilkan informasi spesifik (resolusi, durasi, jumlah halaman).
3. **Interface (`DapatDipromosikan`)**: Menyediakan kontrak perilaku khusus berupa metode `promosikan()` dan *default method* `infoPromosi()`.
4. **Hybrid Subclass (`VideoPromosi`)**: Kelas khusus yang menerapkan *multiple inheritance* konseptual dengan mewarisi kelas `Video` (`extends`) sekaligus mengimplementasikan *interface* `DapatDipromosikan` (`implements`).
5. **Program Utama (`MainAsset`)**: Menangani pengelolaan data menggunakan `ArrayList`, iterasi polimorfik, serta pengecekan tipe data *runtime* menggunakan operator `instanceof` dan *downcasting*.

---

## 💡 Lessons Learned

Melalui pengembangan proyek ini, beberapa konsep penting OOP berhasil dipelajari dan diterapkan secara langsung:

* **Abstraksi vs Antarmuka (Abstract Class vs Interface):**
  * Memahami kapan harus menggunakan *Abstract Class* (untuk hierarki objek yang memiliki karakteristik "is-a" dan berbagi atribut/metode dasar yang sama).
  * Memahami kapan harus menggunakan *Interface* (untuk menyematkan kemampuan atau perilaku "can-do" / *behavior* khusus pada kelas yang tidak harus berada dalam satu garis keturunan kelas induk yang sama).
* **Polimorfisme Ganda:**
  * Menggunakan polimorfisme via *Abstract Class* untuk mengelola koleksi objek heterogen dalam satu `ArrayList<AsetDigital>`.
  * Menggunakan polimorfisme via *Interface* untuk mengelompokkan objek-objek spesifik ke dalam `ArrayList<DapatDipromosikan>`.
* **Runtime Type Checking & Downcasting:**
  * Menggunakan operator `instanceof` untuk mendeteksi kemampuan spesifik suatu objek secara dinamis di dalam perulangan *looping*.
  * Melakukan *downcasting* (`(NamaInterface) objek`) secara aman setelah pengecekan `instanceof` berhasil, guna memanggil metode khusus yang hanya ada di dalam *interface*.

---

## Output

<img width="678" height="491" alt="Screenshot from 2026-11-12 09-47-02" src="https://github.com/user-attachments/assets/3f875fec-7391-4239-8794-d139ff0b22da" />
