# JOBSHEET IV : BRUTE FORCE DAN DIVIDE CONQUER

## Percobaan 1
1. Buat Project baru, dengan nama “BruteForceDivideConquer”. Buat package dengan nama 
minggu5. 
2. Buatlah class baru dengan nama Faktorial 
3. Lengkapi class Faktorial dengan atribut dan method yang telah digambarkan di dalam diagram 
class di atas, sebagai berikut:  
a) Tambahkan atribut nilai 
b) Tambahkan method faktorialBF() nilai
c) Tambahkan method faktorialDC() nilai
4. Coba jalankan (Run) class Faktorial dengan membuat class baru MainFaktorial. 
a) Di dalam fungsi main sediakan komunikasi dengan user untuk menginputkan jumlah angka 
yang akan dicari nilai faktorialnya 
b) Buat Array of Objek pada fungsi main, kemudian inputkan beberapa nilai yang akan 
dihitung faktorialnya 
c) Tampilkan hasil pemanggilan method faktorialDC() dan faktorialBF() 
d) Pastikan program sudah berjalan dengan baik!

## Verifikasi Hasil Percobaan 1
![image](./Laporan/hasil%20faktorial.png)

## Pertanyaan 1
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else

<i> Jawaban : </i> 
if digunakan untuk memeriksa apakah nilai 'n' sama dengan 1, jika ya maka fungsi langsung mengembalikan nilai 1 sebagai hasil faktorial dari 1.
Sedangkan else akan mengeksekusi kodenya ketika kondisi if tidak terpenuhi.

2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!
<i> Jawaban : </i> 
Ya, kita bisa merubah dalam bentuk perulangan yang lain sebagai contoh menggunakan 'while' :


3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

<i> Jawaban : </i> 
fakto *= i adalah operasi yang mengalikan 'fakto' dengan 'i' dan menyimpan hasilnya kembali ke 'fakto'. operasi ini digunakan untuk mengakumulasi nilai faktorial dengan mengalikan setiap iterasi dengan hasil sebelumnya, Sedangkan int fakto = n * faktorialDC(n-1) adalah mengalikan 'n' dengan hasil dari panggilan rekursif 'faktorialDC(n-1)'.

## Percobaan 2 
1. Di dalam paket minggu5, buatlah class baru dengan nama Pangkat. Dan di dalam class Pangkat 
tersebut, buat atribut angka yang akan dipangkatkan sekaligus dengan angka pemangkatnya.
2. Pada class Pangkat tersebut, tambahkan method PangkatBF()
3. Pada class Pangkat juga tambahkan method PangkatDC() 
4. Perhatikan apakah sudah tidak ada kesalahan yang muncul dalam pembuatan class Pangkat 
5. Selanjutnya buat class baru yang di dalamnya terdapat method main. Class tersebut dapat 
dinamakan MainPangkat. Tambahkan kode pada class main untuk menginputkan jumlah nilai 
yang akan dihitung pangkatnya.
6. Nilai pada tahap 5 selanjutnya digunakan untuk instansiasi array of objek. Di dalam Kode berikut 
ditambahkan proses pengisian beberapa nilai yang akan dipangkatkan sekaligus dengan 
pemangkatnya.
7. Kemudian, panggil hasil nya dengan mengeluarkan return value dari method PangkatBF() dan

## Verifikasi Hasil Percobaan 2
![image](./Laporan/Hasil%20pangkat.png)

## Pertanyaan 2
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!

<i> Jawaban : </i> PangkatBF() / brute force untuk menghitung pangkat dengan cara menghitung 'a' pangkat 'n', lalu kita akan mengalikan 'a' dengan dirinya sendiri sebanyak 'n' yang diinginkan, Sedangkan PangkatDc() / Divide and Conquer untuk menghitung pangkat dengan cara menghitung pangkat 'a' pangkat 'n', kita membagi masalah menjadi dua bagian, yaitu pangkat 'a' pangkat 'n/2' lalu menggabungkan solusinya untuk mendapatkan hasil akhirnya.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

<i> Jawaban : </i> sTidak, karena tahap combine biasanya terjadi pada algoritma Divide and Conquer setelah solusi dari submasalah-submasalah diperoleh.

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.

<i> Jawaban : </i> 


4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!
<i> Jawaban : </i>

## Percobaan 3
1. Pada paket minggu5. Buat class baru yaitu class Sum. DI salam class tersebut terdapat beberapa 
atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class Sum.
2. Tambahkan method TotalBF() yang akan menghitung total nilai array dengan cara iterative.
3. Tambahkan pula method TotalDC() untuk implementasi perhitungan nilai total array 
menggunakan algoritma Divide and Conquer.
4. Buat class baru yaitu MainSum. Di dalam kelas ini terdapat method main. Pada method ini user 
dapat menuliskan berapa bulan keuntungan yang akan dihitung. Dalam kelas ini sekaligus dibuat 
instansiasi objek untuk memanggil atribut ataupun fungsi pada class Sum.
5. Karena yang akan dihitung adalah total nilai keuntungan, maka ditambahkan pula pada method 
main mana array yang akan dihitung. Array tersebut merupakan atribut yang terdapat di class 
Sum, maka dari itu dibutuhkan pembuatan objek Sum terlebih dahulu.
6. Tampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua cara yang ada (Brute 
Force dan Divide and Conquer)

## Verifikasi Hasil Percobaan 3
![image](./Laporan/hasil%20sum.png)

## Pertanyaan 3
1. Mengapa terdapat formulasi return value berikut?Jelaskan!

<i> Jawaban : </i>

2. Kenapa dibutuhkan variable mid pada method TotalDC()?

<i> Jawaban : </i> karena digunakan untuk menghitung total nilai DC dari rentang data yang berada di tengah.

3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!

<i> Jawaban : </i>

## Latihan Praktikum 
1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini !
![image](./Laporan/Gambar%20soal%20latihan%20praktikum.png)

Tentukan: 

a) top_acceleration tertinggi menggunakan Divide and Conquer! 

b) top_acceleration terendah menggunakan Divide and Conquer! 

c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force!
