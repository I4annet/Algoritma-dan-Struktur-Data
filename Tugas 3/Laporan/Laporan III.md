# Jobsheet 2 : ARRAY OF OBJEK 

## Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan 

1. Buat Project baru, dengan nama “ArrayObjects”. 
2. Buat class PersegiPanjang:
 ![image](./class%20array%20object.png)

3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 elemen :
![image](./main%20praktikum%201.png)

4. Kemudian isikan masing-masing atributnya: 
![image](./atribut%20praktikum%201.png)

5. Cetak ke layar semua atribut dari objek ppArray:
![image](./munculkan%20hasil%20atribut.png)

## Verifikasi Hasil Percobaan 
![image](./hasil%20array%20object.png)

## Pertanyaan 1
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan!
<p> jawaban : Tidak, karena array of object hanya array yanng berisi elemen-elemen object </p>

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut :

<i> ppArray[1] = new PersegiPanjang();</i>

<p> jawaban : Tidak, karena dengan memanggil konstruktor default untuk membuat objek PersegiPanjang dan menetapkannya ke elemen ke-1 dalam array 'ppArray' </p> 

3. Apa yang dimaksud dengan kode berikut ini:

<i> PersegiPanjang[] ppArray = new PersegiPanjang[3];</i> 
<p> jawaban : deklarasi dan inisialisasi array of object. </p>

4. Apa yang dimaksud dengan kode berikut ini:

<i><p>ppArray[1] = new PersegiPanjang();</p>
<p>ppArray[1].panjang = 80;</p>
<p>ppArray[1].lebar = 40;</i></p>

<p> jawaban : membuat objek PersegiPanjang, menetapkan ke dalam elemen ke-1 dalam array, dan mengatur nilai atribut panjang dan lebar dari objek tersebut. </p>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

<p> jawaban : Dengan memisahkan class main dan class persegi panjang membuat kode pemrograman menjadi lebih jelas dan mudah dipahami</p>


## Percobaan 2 : Menerima Input Isian Array Menggunakan Looping 
1. Import scanner pada class ArrayObjects. 
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek 
Scanner untuk menerima input, kemudian melakukan looping untuk menerima input: 
![image](./praktikum%202%20no%202.png)

3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping untuk mengakses isi array ppArray dan menampilkannya ke layar:
![image](./Praktikum%202%20no%203.png)

4. Jalankan dan amati hasilnya. 

## Verifikasi Hasil Percobaan 
![image](./hasil%20praktikum%202.png)

## Pertanyaan 2 
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? 
<p> jawaban : Ya Bisa </p>

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
 

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan.
<p> <i> Persegi[] pgArray = new Persegi[100];</p>
<p> pgArray[5].sisi = 20; </i> </p>  
Mengapa?
<p> jawaban : karena pgArray[5] adalah elemen yang masih null dan akan mengakibatkan 'NullPointerException' </p>

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner! 
![image](./pertanyaan%202%20no%204.png)

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! 
<p> jawaban :  Boleh, karena setiap elemen array hanya menyimpan referensi ke objek, bukan objek itu sendiri</p>

## Percobaan 3 : Penambahan Operasi Matematika di Dalam Method
1. Buat package baru “ArrayBalok”. 
2. Buat class Balok:
![image](./Percobaan%203%20no%202.png)
3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen:

![image](./Percobaan%203%20no%203.png)
4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor 
dari class Balok:
![image](./Percobaan%203%20no%204.png) 
5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di dalam looping seperti berikut ini:
![image](./Percobaan%203%20no%205.png)
6. Jalankan dan amati hasilnya.

## Verifikasi Hasil Percobaan 
![image](./hasil%20praktikum%203.png)


## Pertanyaan 3 
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! 
![image](./Pertanyaan%203%20no%201.png)

2. Jika diketahui terdapat class Segitiga seperti berikut ini: 
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. 
    ![image](./pertanyaan%203%20no%202.png)

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga 
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)
![image](./pertanyaan%203%20no%203.png)


4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut: 
<li> sgArray ke-0 alas: 10, tinggi: </li> 
<li> sgArray ke-1 alas: 20, tinggi: 10 </li>
<li> sgArray ke-2 alas: 15, tinggi: 6 </li>
<li> sgArray ke-3 alas: 25, tinggi: 10 </li>

![image](./Pertanyaan%203%20no%204.png)

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().
![image](./Pertanyaan%203%20no%205.png)





## Latihan Praktikum 
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, 
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut
atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan, 
<li>a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.</li> 
<li>b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring</li> 
<li> c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan 
tinggi limas </li>
<li> d. Pada bola, inpuntan untuk atribut hanya jari-jari </li> 

![image](./praktikum%20no%201%20(1).png)
![image](./praktikum%20no%201%20(2).png)
![image](./hasil%20praktikum%20no%201.png)


2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. 
3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, 
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing 
proses tersebut)
![image](./Praktikum%20no%202-3%20(1)%20.png)
![image](./Praktikum%20no%202-3%20(2)%20.png)
![image](./hasil%20praktikum%20no%202-3.png)