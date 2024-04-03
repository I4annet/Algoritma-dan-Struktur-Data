# Jobsheet 8 : Stack
### Nama : Ivansyah Eka Oktaviadi Santoso
### Kelas : 1B
### NIM : 2341720126
### Absen : 16

## Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang


```java
/**
 * Barang16
 */
public class Barang16 {
    int kode;
    String nama;
    String kategori;
        
    public Barang16(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }

}
```
```java
import java.util.Stack;

public class Gudang16 {
    Barang16[] tumpukan;
    int size;
    int top;

    public Gudang16(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang16[size];
        top = -1;
    }
    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        return cekKosong();
    }

    public void tambahBarang(Barang16 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " +  brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");            
        }
    }
    public Barang16 ambilBarang16() {
        if (!cekKosong()) {
            Barang16 delete = tumpukan[top];
            top--;
            System.out.println("Barang " +  delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan Barang kosong");
            return null;            
        }
    }
    public Barang16 lihatBarangTeratas() {
        if (!isEmpty()) {
            Barang16 barangTeratas = tumpukan[top]; 
            System.out.println("Barang teratas : " +  barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");            
            return null;
        }
    }
    
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode: %s, Nama: %s, (Kategori: %s\n ) ", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong ");
        }
    }
```

```java
import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Gudang16 gudang = new Gudang16(7);
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang ");
            System.out.println("2. Ambil barang ");
            System.out.println("3. Tampilkan tumpukan barang ");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi:  ");
            int pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan kode barang: ");
                int kode = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan nama barang: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nama kategori: ");
                String kategori = sc.nextLine();
                Barang16 barangBaru = new Barang16(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;

            case 2:
            gudang.ambilBarang16();
            break;

            case 3:
            gudang.tampilkanBarang();
            break;

            case 4: 
            break;

            default:
            System.out.println("Pilihan tidak valid. Coba lagi.");
        }
        }
    }
}
```            
## Verifikasi Hasil Percobaan 




## Pertanyaan 1
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
hasil percobaan! Bagian mana saja yang perlu diperbaiki? 
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode 
programnya! 
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi 
tersebut dihapus, apa dampaknya? 
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang! 
5. Commit dan push kode program ke Github


## Percobaan 2: Konversi Kode Barang ke Biner 
```java
 public String konversiDesimalkeBiner(int kode) {
        StackKonversi16 stack = new StackKonversi16();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
```

```java
public class StackKonversi16 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi16() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
```
```java
public Barang16 ambilBarang16() {
        if (!cekKosong()) {
            Barang16 delete = tumpukan[top];
            top--;
            System.out.println("Barang " +  delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan Barang kosong");
            return null;            
        }
    }
```

## Verifikasi Hasil Percobaan 

## Pertanyaan 2
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), 
bagaimana hasilnya? Jelaskan alasannya! 
2. Jelaskan alur kerja dari method konversiDesimalKeBiner! 

## Percobaan 3
```java
public class Postfix16 {
    int n;
    char[] stack;
    int top;

    public Postfix16(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public boolean IsOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int precedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                p += c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    p += pop();
                }
                pop();
            } else if (IsOperator(c)) {
                while (top >= 0 && precedence(stack[top]) >= precedence(c)) {
                    p += pop();
                }
                push(c);
            }
        }
        return p;
    }
}
```
```java
import java.util.Scanner;

public class PostfixMain16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p, Q;

        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = scanner.nextLine();
        Q = Q.trim();
        Q = Q + ")"; // Menambahkan ')' sebagai penanda akhir ekspresi

        Postfix16 post = new Postfix16(Q.length()); // Menginisialisasi objek Postfix16 dengan panjang ekspresi infix
        p = post.konversi(Q);
        System.out.println("Postfix: " + p);
    }
}
```

## Verifikasi Hasil Percobaan 


## Pertanyaan 3
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return 
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi? 
2. Jelaskan alur kerja method konversi! 
3. Pada method konversi, apa fungsi dari potongan kode berikut? 
```java
 c = Q.charAt(i);
```

## Latihan Praktikum

Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikut 
pada class Gudang: 

• Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah
 
• Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode 
barangnya atau nama barangnya
