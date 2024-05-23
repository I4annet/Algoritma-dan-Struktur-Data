## JOBSHEET IV : BRUTE FORCE DAN DIVIDE CONQUER
## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## NIM : 2341720126
## Prodi : D-IV Teknik Informatika

## Percobaan 1
1. Buat Project baru, dengan nama “BruteForceDivideConquer”. Buat package dengan nama 
minggu5. 
2. Buatlah class baru dengan nama Faktorial 
```java
/**
 * Faktorial
 */
public class Faktorial {
```

3. Lengkapi class Faktorial dengan atribut dan method yang telah digambarkan di dalam diagram 
class di atas, sebagai berikut:  
a) Tambahkan atribut nilai 
```java
public int nilai;
```

b) Tambahkan method faktorialBF() nilai
```java
 int faktorialBF(int n) {
        int fakto = 1;
        for(int i = 1; i <= n; i++) {
            fakto = fakto * i; // Menggantikan dari fakto = fakto * 1
        }
        return fakto;
    }
```
c) Tambahkan method faktorialDC() nilai
```java
int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
```

4. Coba jalankan (Run) class Faktorial dengan membuat class baru MainFaktorial. 
a) Di dalam fungsi main sediakan komunikasi dengan user untuk menginputkan jumlah angka 
yang akan dicari nilai faktorialnya 
```java
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();
```
b) Buat Array of Objek pada fungsi main, kemudian inputkan beberapa nilai yang akan 
dihitung faktorialnya 
```java
 Faktorial[] fk = new Faktorial[iJml]; // Ganti ke iJml
        for(int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // Simpan nilai yang dimasukkan ke dalam objek
        }
```
c) Tampilkan hasil pemanggilan method faktorialDC() dan faktorialBF() 

```java
  System.out.println("HASIL-BRUTE FORCE");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " 
            + fk[i].faktorialBF(fk[i].nilai));
        }
     System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " 
            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
```
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
```java
public class Pangkat {

    public int nilai, pangkat;
```

2. Pada class Pangkat tersebut, tambahkan method PangkatBF()
```java
int pangkatBF(int a, int n) {
        int hasil = 1; // Inisialisasi ke 1, bukan 0
        for (int i = 0; i < n; i++) {
            hasil *= a; //Kalikan 'hasil' dengan 'a' sebanyak 'n' kali
        }
        return hasil;
    }
```
3. Pada class Pangkat juga tambahkan method PangkatDC() 
```java
int pangkatDC(int a, int n) {
        if (n == 1) {
            return a; 
        } else {
            if (n % 2 == 1) // BILANGAN GANJIL
            {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else { // BILANGAN GENAP
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
```

4. Perhatikan apakah sudah tidak ada kesalahan yang muncul dalam pembuatan class Pangkat 
5. Selanjutnya buat class baru yang di dalamnya terdapat method main. Class tersebut dapat 
dinamakan MainPangkat. Tambahkan kode pada class main untuk menginputkan jumlah nilai yang akan dihitung pangkatnya.

```java
class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
```

6. Nilai pada tahap 5 selanjutnya digunakan untuk instansiasi array of objek. Di dalam Kode berikut 
ditambahkan proses pengisian beberapa nilai yang akan dipangkatkan sekaligus dengan pemangkatnya.

```java
Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt(); // Simpan nilai yang dimasukkan ke dalam objek
            System.out.println("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc.nextInt(); // Simpan nilai yang dimasukkan ke dalam objek


        }
```
7. Kemudian, panggil hasil nya dengan mengeluarkan return value dari method PangkatBF() dan PangkatDC()

```java
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

          System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    
        }
```

## Verifikasi Hasil Percobaan 2
![image](./Laporan/Hasil%20pangkat.png)

## Pertanyaan 2
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!

<i> Jawaban : </i> PangkatBF() / brute force untuk menghitung pangkat dengan cara menghitung 'a' pangkat 'n', lalu kita akan mengalikan 'a' dengan dirinya sendiri sebanyak 'n' yang diinginkan, Sedangkan PangkatDc() / Divide and Conquer untuk menghitung pangkat dengan cara menghitung pangkat 'a' pangkat 'n', kita membagi masalah menjadi dua bagian, yaitu pangkat 'a' pangkat 'n/2' lalu menggabungkan solusinya untuk mendapatkan hasil akhirnya.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

<i> Jawaban : </i> Tidak, karena tahap combine biasanya terjadi pada algoritma Divide and Conquer setelah solusi dari submasalah-submasalah diperoleh.

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.

<i> Jawaban : </i> 


4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!
<i> Jawaban : </i>

```java
switch (pilihan) {
            case 1:
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;
        
        case 2:
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    
        }
        break;
        default: 
        System.out.println("Pilihan tidak valid");
    }

Masukkan jumlah elemen yang dihitung: 
2 
Masukkan nilai yang hendak dipangkatkan: 
4
Masukkan nilai pemangkat : 
6
Masukkan nilai yang hendak dipangkatkan: 
3
Masukkan nilai pemangkat : 
7
Pilih Operasi Perhitungan: 
1. Brute Force
2. Divide and Conquer
1
HASIL PANGKAT - BRUTE FORCE
Hasil dari 4 pangkat 6 adalah 4096
Hasil dari 3 pangkat 7 adalah 2187

```

## Percobaan 3
1. Pada paket minggu5. Buat class baru yaitu class Sum. DI salam class tersebut terdapat beberapa 
atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class Sum.
```java
public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
```
2. Tambahkan method TotalBF() yang akan menghitung total nilai array dengan cara iterative.

```java

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }
```
3. Tambahkan pula method TotalDC() untuk implementasi perhitungan nilai total array menggunakan algoritma Divide and Conquer.
```java

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
```

4. Buat class baru yaitu MainSum. Di dalam kelas ini terdapat method main. Pada method ini user 
dapat menuliskan berapa bulan keuntungan yang akan dihitung. Dalam kelas ini sekaligus dibuat 
instansiasi objek untuk memanggil atribut ataupun fungsi pada class Sum.
```java
class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
    }
```
5. Karena yang akan dihitung adalah total nilai keuntungan, maka ditambahkan pula pada method 
main mana array yang akan dihitung. Array tersebut merupakan atribut yang terdapat di class 
Sum, maka dari itu dibutuhkan pembuatan objek Sum terlebih dahulu.
```java
 Sum sm = new Sum(elm);
        System.out.println("=================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
```
6. Tampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua cara yang ada (Brute 
Force dan Divide and Conquer)
```java
        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
```

## Verifikasi Hasil Percobaan 3
![image](./Laporan/hasil%20sum.png)

## Pertanyaan 3
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
 ```java
 return lsum + rsum+arr[mid];
```

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


````java
/**
 * Showroom
 */
public class Showroom {

    static class Car {
        String merk;
        String tipe;
        int tahun;
        int topAcceleration;
        int topPower;

        public Car(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
            this.merk = merk;
            this.tipe = tipe;
            this.tahun = tahun;
            this.topAcceleration = topAcceleration;
            this.topPower = topPower;
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new Car("BMW", "M2 Coupe", 2016, 6816, 728),
            new Car("Ford", "Fiesta ST", 2014, 3921, 575),
            new Car("Nissan", "370Z", 2009, 4360, 657),
            new Car("Subaru", "BRZ", 2014, 4058, 609),
            new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Car("Toyota", "AE86", 1986, 3700, 553),
            new Car("Toyota", "86/GT86", 2014, 4180, 609),
            new Car("Volkswagen", "Golf GTI", 2014, 4180, 631),
        };

        System.out.println("Highest Top Acceleration: " + maxTopAcceleration(cars, 0, cars.length-1));
        System.out.println("Lowest Top Acceleration: " + minTopAcceleration(cars, 0, cars.length-1));
        
        double totalTopPower = 0;

        for(int i=0; i < cars.length; i++) {
            totalTopPower += cars[i].topPower;
        }

        double avgTopPower = totalTopPower / cars.length;

        System.out.println("Average Top Power: " + avgTopPower);
    }

    static int maxTopAcceleration(Car[] carArray, int low, int high) {
        if (low == high) {
            return carArray[low].topAcceleration;
        }
        int mid = (low + high) / 2;

        return Math.max(carArray[mid].topAcceleration,
                        Math.max(maxTopAcceleration(carArray, low, mid),
                                 maxTopAcceleration(carArray, mid + 1, high)));
    }

    static int minTopAcceleration(Car[] carArray, int low, int high) {
        if (low == high) {
            return carArray[low].topAcceleration;
        }
        int mid = (low + high) / 2;

        return Math.min(carArray[mid].topAcceleration,
                        Math.min(minTopAcceleration(carArray, low, mid),
                                 minTopAcceleration(carArray, mid + 1, high)));
    }
}
```
```java
Highest Top Acceleration: 6816
Lowest Top Acceleration: 3700
Average Top Power: 633.125
```