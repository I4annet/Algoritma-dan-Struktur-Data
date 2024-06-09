package Tugas13.Praktikum1;

import java.util.Scanner;

public class VaksinasiQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList queue = new DoubleLinkedList();
        int pilih;

        do {
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("  PENGANTRI VAKSIN EXTRAVAGANZA    ");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Cetak Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin: ");
                    System.out.println("----------------------------------");
                    System.out.println("Nomor Antrian:");
                    int antrian = sc.nextInt();
                    sc.nextLine();
                    System.out.println("-Nama Penerima: ");
                    String nama = sc.nextLine();
                    queue.add(nama, antrian);
                    break;
                case 2:
                    queue.remove();
                    queue.print();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        } while (pilih != 4);

        sc.close();
    }
}
