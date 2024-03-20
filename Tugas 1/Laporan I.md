# JOBSHEET I : KONSEP DASAR PEMROGRAMAN

## Praktikum Pemilihan 
1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan diluar rentang tersebut maka
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya
lakukan konversi nilai dengan ketentuan sebagai berikut:

![image](./Pemilihan%20pertanyaan.png)

Jika Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E
maka TIDAK LULUS.
<li> Input dari program berupa komponen nilai tugas,kuis, UTS, UAS </li>
<li>  Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan </li>
<li> Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan
LULUS/TIDAK LULUS </li>

![image](./pemilihan.png)
![image](./hasil%20pemilihan.png)


## Praktikum Perulangan 
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n kecuali
angka 6 dan 10, angka ganjil dicetak dengan asterik “*”, angka genap dicetak sesuai bilangan
aslinya, dengan n = 2 digit terakhir NIM anda.
*bila n<10 maka tambahkan 10 (n+=10)
<p> Contoh:
Input NIM: 2341720102 maka n=12
OUTPUT : * 2 * 4 * * 8 * * 12 </p>
<p> Contoh 2:
Input NIM: 2341720113 maka n=13
OUTPUT : * 2 * 4 * * 8 * * 12 </p>

![image](./perulangan.png)
![image](./hasil%20perulangan.png)


## Praktikum Array
1. Buatlah program untuk menghitung IP Semester dari matakuliah yang Anda tempuh
semester lalu. Formula untuk menghitung IP semester sebagai berikut :
𝐼𝑃 𝑆𝑒𝑚𝑒𝑠𝑡𝑒𝑟 = ∑𝑖(𝑁𝑖𝑙𝑎𝑖 𝑆𝑒𝑡𝑎𝑟𝑎𝑖 ∗𝑏𝑜𝑏𝑜𝑡 𝑆𝐾𝑆𝑖) / ∑ 𝑆𝐾𝑆
Nilai setara didapatkan dari tabel konversi berikut ini : 
![image](./Pemilihan%20pertanyaan.png)
Input dari program berupa nama matakuliah, bobot SKS, serta nilai huruf dari matakuliah
tersebut.

![image](./array%201.png)
![image](./array%202.png)
![image](./)



## Praktikum Fungsi
1. RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bungabunga yang dijual selalu dicatat dengan rincian seperti berikut ini:
Baris = Cabang Toko, Kolom = Stock bunga pada hari x
![image](./tabel%20pertanyaan%20fungsi.png)

Rincian Harga Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000.
1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis
terjual.
2. Buatlah fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden
4. Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati.
Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.
![image](./fungsi%201.png)
![image](./fungsi%202.png)
![image](./hasil%20fungsi.png)


## Tugas
1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array
pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array
dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.
Ilustrasi tampilan array tersebut adalah sebagai berikut :
![image](./tugas%20Tabel%20kota.png)

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan
nama kota dari kode plat nomor tersebut.
![image](./tugas1.png)

![image](./hasil%20tugas1.png)

2. Buat program untuk menghitung rumus kecepatan, jarak, dan waktu
Berikut adalah persamaan untuk menghitung rumus tersebut :
<li> Rumus Kecepatan
𝑣 = 𝑠/𝑡 </li>
<li> Rumus Jarak
𝑠 = 𝑣.𝑡 </li>
<li> Rumus Waktu
𝑡 =𝑠/𝑣 </li>
<li> Keterangan :
𝑣 = 𝑘𝑒𝑐𝑒𝑝𝑎𝑡𝑎𝑛,
𝑠 = 𝑗𝑎𝑟𝑎𝑘,
𝑡 = 𝑤𝑎𝑘𝑡𝑢
</li>
Program yang dibuat memiliki fungsi sebagai berikut:
<li> Menu (Untuk memilih rumus yang akan dihitung (kecepatan/jarak/waktu) </li>
<li> Menghitung hasil perhitungan Kecepatan </li>
<li> Menghitung hasil perhitungan Jarak </li>
<li> Menghitung hasil perhitungan Waktu </li>
Panggil fungsi-fungsi tersebut pada fungsi main!

![image](./tugas2.png)

![image](./hasil%20tugas2.png)

