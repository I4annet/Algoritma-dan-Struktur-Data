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
