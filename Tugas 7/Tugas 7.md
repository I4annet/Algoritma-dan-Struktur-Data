## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## Absen : 16
## NIM : 2341720126


# Jobsheet VI SEARCHING

## A. Searching / Pencarian Menggunakan Agoritma Sequential Search
1. Buatlah Project baru pada dengan nama TestSearching 
2. Kemuadian buat packages baru dengan nama P7 
3. Buat class BukuNoAbsen, kemudian deklarasikan atribut berikut ini:

![image](./Laporan/gambar%201.png)

4. Buatlah konstruktor dengan nama Buku dengan parameter (String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) kemudian Isi 
konstruktor tersebut dengan kode berikut!  

![image](./Laporan/gambar%202.png)

5. Buatlah method tampilDataBuku bertipe void. 

![image](./Laporan/gambar%203.png)

6. Buat class baru dengan nama PencarianBukuNoAbsen seperti di bawah ini!

![image](./Laporan/gambar%204.png)

7. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk 
menambahkan objek dari class Buku ke dalam atribut listBk. 

![image](./Laporan/gambar%205.png)

8. Tambahkan method tampil() di dalam class PencarianBukuNoAbsen Method tampil() 
digunakan untuk menampilkan semua data buku yang ada di dalam class tersebut! Perhatikan 
penggunaan sintaks for yang menggunakan konsep for-each. Syntax tersebut akan memberikan 
tanda error berupa garis merah, Perbaiki agar tidak ada error!

![image](./Laporan/gambar%206.png)

9. Tambahkan method FindSeqSearch bertipe integer dengan parameter cari bertipe int. 
Kemudian Deklarasikan isi method FindSeqSearch dengan algoritma pencarian data 
menggunakan teknik sequential searching.

![image](./Laporan/gambar%207.png)

10. Buatlah method Tampilpoisisi bertipe void dan Deklarasikan isi dari method 
Tampilpoisisi. 

![image](./Laporan/gambar%208.png)

11. Buatlah class baru dengan nama BukuMainNoAbsen tambahkan method main. buatlah 
sebuah objek PencarianMhs dan buatlah 5 objek buku kemudian tambahkan semua objek buku 
tersebut dengan memanggil fungsi tambah pada objek PencarianBuku.

![image](./Laporan/gambar%209.png)

12. Panggil method tampil() untuk melihat semua data yang telah dimasukan.

![image](./Laporan/gambar%2010.png)

13. Untuk melakukan pencarian berdasarkan kode buku. Buatlah variable cari yang dapat 
menampung masukan dari keyboard lalu panggil method FindSeqSearch dengan isi 
parameternya adalah variable cari. Untuk menampilkan index data yang dicari panggil method 
TampilPosisi

![image](./Laporan/gambar%2011.png)

Verifikasi Hasil Pencarian : 




14. Buatlah method TampilData bertipe void pada class PencarianBukuNoAbsen dan 
tambahkan isi dari method TampilData.
![image](./Laporan/gambar%2012.png)

15. Di dalam method main(), Lakukan pemanggilan method TampilData dari class 
PencarianMhs.

![image](./Laporan/gambar%2013.png)


16. Jalankan dan amati hasilnya. 

## A1. Verifikasi Hasil Percobaan

## A2. Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!

<i> jawaban : </i> 

2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih 
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti 
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?  
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe 
method dari FindBuku adalah BukuNoAbsen.  Sehingga Anda bisa memanggil method 
tersebut pada class BukuMain seperti gambar berikut :


## B. Searching / Pencarian Menggunakan Binary Search 
1. Pada percobaan 6.2.1 (sequential search) tambahkan method FindBinarySearch bertipe 
integer pada class PencarianBukuNoAbsen. Kemudian Deklarasikan isi method 
FindBinarySearch dengan algoritma pencarian data menggunakan teknik binary searching.
```java 
 public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (right) / 2;

            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } 

            else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }   

            }
            return -1;
        }
    }
```
2. Panggil method FindBinarySearch di kelas BukuMainNoAbsen. Kemudia panggil 
method tampilposisi dan tampilData.

```java
System.out.println("=============================");
    System.out.println("Menggunakan binary Search");
    posisi = data.FindBinarySearch(cari, 0,jumBuku - 1);
    data.Tampilposisi(cari, posisi);
    data.TampilData(cari, posisi);
        }
    }
```
3. Jalankan dan amati hasilnya. 

## B1. Verifikasi Hasil Percobaan

## B2. Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan! 
2. Tunjukkan pada kode program yang mana proses conquer dijalankan! 
4. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa 
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan 
Mengapa hal tersebut bisa terjadi?  
3. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? 
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai! 

## C. Percobaan Pengayaan Divide and Conquer
1. Buatlah Package baru didalam package P5 dengan nama MergeSortTest 
2. Tambahkan class MergeSortingNoAbsen pada package tersebut 
3. Pada class MergeSortingNoAbsen buatlah method mergeSort yang menerima parameter 
data array yang akan diurutkan
4. Buatlah method merge untuk melakukan proses penggabungan data dari bagian kiri dan kanan. 
5. Implementasikan proses merge sebagai berikut. 
6. Buatlah method sort
7. Implementasikan kode berikut pada method sort
8. Pada method mergeSort, panggil method sort dengan parameter data yang ingin diurutkan 
serta range data awal sampai dengan akhir. 
9. Tambahkan method printArray  
10. Sebagai langkah terakhir, deklarasikan data yang akan diurutkan kemudian panggil proses 
sorting pada class MergeSortMainNoAbsen. Tambahkan fungsi main pada kelas tersebut, 
kemudian tuliskan kode berikut didalam fungsi main. 

## C1. Verifikasi Hasil Percobaan 





## Latihan Praktikum 
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini - - 
Ubah tipe data dari kode Buku yang awalnya int menjadi String 
Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan 
sequential search dan binary search. 
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan 
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga 
ketika input data acak, maka algoritma searching akan tetap berjalan 
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam 
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang 
diberikan!

<i> jawaban </i>

