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
