# JOBSHEET X : QUEUE
## Praktikum 1 

```java
package tugas10.Praktikum1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if(!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i !=rear) {
                System.out.print(data[i] + " ");
                i = (i +1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                     rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
  }
}
```    
```java
package tugas10.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                   Q.clear();
                   break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
   }
}
```
## Verifikasi Hasil Percobaan
```java
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
4
Elemen terdepan: 15
```
## Pertanyaan 1
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0?

<i> Jawaban : </i>
karena nilai awal bernilai -1 menunjukkan bahwa tidak ada nilai / data di dalam size.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```java
  if (rear == max -1) {
            rear = 0;
```
<i> Jawaban : </i>
Untuk memastikan jika nilai belakang (rear) sama dengan max -1, maka antrian sudah penuh. 

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (front == max -1) {
            front = 0;
```
<i> Jawaban : </i>
Untuk memastikan jika nilai depan (front) sama dengan max - 1, maka ketika diambil, nilai depannya diganti dengan indeks ke-0

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?

<i> Jawaban : </i>
Karena int i = 0 menandakan bahwa i merupakan indeks ke-0, sementara int i = front menandakan bahwa i merupakan nilai depan (front) karena nilai depan (front) tidak selalu berada pada indeks ke-0.

5.  Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
```java
i = (i +1) % max;
```
<i> Jawaban : </i>
hasil i akan ditambahkan 1 lalu dikurangi oleh maksimal penampung data (max array)


6. Tunjukkan potongan kode program yang merupakan queue overflow!
```java
  public void Enqueue(Nasabah dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                     rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan! 
```java
 public boolean IsEmpty() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            System.out.println("Queue Overflow");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
```

```java
Masukkan kapasitas queue: 2
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
1
Masukkan data baru: 23
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
1
Masukkan data baru: 24
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
1
Masukkan data baru: 21
Queue sudah penuh
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
2
Data yang dikeluarkan: 23
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
2
Data yang dikeluarkan: 24
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
2
Queue masih kosong
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------------------
```
## Praktikum 2
```java
package tugas10.Praktikum2;

public class Nasabah {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;
    
    Nasabah(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek= norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}
```
```java
package tugas10.Praktikum2;

public class Queue {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if(!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
            + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println( data[i].norek + " " + data[i].nama + " "
                + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i +1) % max;
                count++;
            }
            
            System.out.println("Jumlah elemen = " + size);
        }
    }
   
    public void Enqueue(Nasabah dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                     rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public Nasabah Dequeue() {
        Nasabah dt = new Nasabah(null, null, null, max, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
  
     
}
```

```java
package tugas10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur != 0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama +
                        " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
    }
}
```
## Verifikasi Hasil Percobaan
```java
Masukkan kapasitas queue: 8
Pilih menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
-----------------------------
1
No Rekening: 12345
Nama: Dewi
Alamat: Malang
Umur: 23
Saldo: 1300000
Pilih menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
-----------------------------
1
No Rekening: 32940
Nama: Susan
Alamat: Surabaya
Umur: 39
Saldo: 42000000
Pilih menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
-----------------------------
4
12345 Dewi Malang 23 1300000.0
32940 Susan Surabaya 39 4.2E7
Jumlah elemen = 2
Pilih menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
-----------------------------
```
## Pertanyaan 2
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
 if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur != 0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama +
                        " " + data.alamat + " " + data.umur + " " + data.saldo);
```

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear 
dapat dipanggil! 

### Class Queue
```java
 public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang : " + data[rear].norek + " " +
            data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo + " ");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
```
### Class QueueMain
```java
package tugas10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur != 0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama +
                        " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```
```java
24 ivansyah Gresik 19 4.0E7
26 Farel Blitar 19 4.5E7
Jumlah elemen = 2
Pilih menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian paling belakang
-----------------------------
5
Antrian paling belakang : 26 Farel Blitar 19 4.5E7
```
## Tugas
1. Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang 
pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang

Keterangan :
Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti 
yang telah dibuat pada Praktikum 
• Method peek(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian paling 
depan 
• Method peekRear(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian 
paling belakang 
• Method peekPosition(): digunakan untuk menampilkan seorang pembeli (berdasarkan nama) 
posisi antrian ke berapa 
• Method daftarPembeli(): digunakan untuk menampilkan data seluruh pembeli 

### Class Pembeli
```java
package tugas10.Latihan;

public class Pembeli {
    String nama;
    int noHp;

    Pembeli (String nama, int noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }
}
```

### Class Queue
```java
package tugas10.Latihan;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear - 1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
     public void Enqueue(Pembeli pb) {
        if (IsFull()) {
             System.out.println("Pembeli sudah penuh");
         } else {
             if (IsEmpty()) {
                 front = rear = 0;
             } else {
                 if (rear == max -1) {
                     rear = -1;
                 } else {
                     rear++;
                    
                 }
             }
             antrian[++rear] = pb;
             size++;

         }
    }
    public Pembeli Dequeue() {
        Pembeli pb = new Pembeli(null, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            pb = antrian[front++];
            if (front == max) {
                front = 0;
            }
            size--;
            return pb;
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Daftar pembeli masih kosong");
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println( antrian[rear].nama + " " + antrian[rear].noHp + " ");
                i = (i + 1) % max;
                count++;
            }
            System.out.println("Elemen terdepan: " + size );
    }
}
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan : " + antrian[front].nama);
        } else {
            System.out.println("Pembeli masih kosong");
        }

    }
    public void peekRear() {
        if (IsFull()) {
            System.out.println("Antrian terbelakang: " + antrian[rear].nama + " " 
            + antrian[rear].noHp + " ");
        } else {
            System.out.println("Pembeli masih kosong");            
        }
    }
    public void peekPosition(String nama) {
        boolean found = false;
        int pos = -1;
        for (int i = front; i <= rear; i++) {
            if (antrian[i].equals(nama)) {
            found = true;
            pos = i;
            break;
        }
        if (found) {
            System.out.println("Pembeli dengan nama " + nama + " berada pada posisi antrian ke-" + (pos - front + 1));
        } else {
            System.out.println("Pembeli dengan nama" + nama + "tidak ditemukan");
        }
    }
}
}
```

```java
package tugas10.Latihan;

import java.util.Scanner;

public class PembeliMain {
    public static void menu() {
        System.out.println("PILIH MENU :");
        System.out.println("1. Pendaftaran");
        System.out.println("2. Antrial keluar");
        System.out.println("3. Antrian paling depan");
        System.out.println("4. Antrian paling belakang");
        System.out.println("5. Daftar posisi antrian");
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas pembeli: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No.Hp: ");
                    int noHp = sc.nextInt();
                    Pembeli pb = new Pembeli(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(pb);
                    break;
                case 2:
                Pembeli antrian = antri.Dequeue();
                if (!"".equals(antrian.nama) && !"".equals(antrian.noHp)) {
                    System.out.println("Antrian yang keluar: " + antrian.nama + " " + antrian.noHp + " " );
                    break;
                }
                case 3:
                antri.peek();
                break;
                case 4: 
                antri.peekRear();
                break;
                case 5:
                System.out.print("Masukkan nama pembeli: ");
                String namaPembeli = sc.nextLine();
                antri.peekPosition(namaPembeli);
                break;
                
                default:
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 );
    }
}
```