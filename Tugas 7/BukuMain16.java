import java.util.Scanner;

/**
 * BukuMain16
 */
public class BukuMain16 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    PencarianBuku16 data = new PencarianBuku16();
    int jumBuku = 5;

    System.out.println("--------------------------------------------------------");
    System.out.println("Masukkan data Buku secara urut dari kodebuku terkecil : ");


    for (int i = 0; i < jumBuku; i++) {
        System.out.println("----------------------------------------------------");
        System.out.print("Kode Buku \t: ");
        int kodeBuku = s.nextInt();
        System.out.print("Judul Buku \t : ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun Terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.print("Stock \t: ");
        int stock = s.nextInt();
        
        Buku16 m = new Buku16(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }    
    System.out.println("----------------------------------");
    System.out.println("    Data keseluruhan Mahasiswa :  ");
    System.out.println("----------------------------------");
    System.out.println("    Data keseluruhan Buku :       ");
    data.tampil();

    System.out.println("__________________________________");
        System.out.println("______________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    System.out.println("=============================");
    System.out.println("Menggunakan sequential Search");
    posisi = data.FindSeqSearch(cari);
    data.Tampilposisi(cari, posisi);
    data.TampilData(cari, posisi);
        }
    }
