import java.text.DecimalFormat;
import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data mahasiswa
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        // Input data mahasiswa
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            // Buat objek mahasiswa baru
            Mahasiswa mhs = new Mahasiswa(nama, nim, jenisKelamin, ipk);

            // Simpan objek mahasiswa ke dalam array
            mahasiswa[i] = mhs;

            // Consume the newline character after reading IPK
            scanner.nextLine();
        }

        // Tampilkan data mahasiswa
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].getNama());
            System.out.println("NIM: " + mahasiswa[i].getNim());
            System.out.println("Jenis Kelamin: " + mahasiswa[i].getJenisKelamin());
            System.out.println("Nilai IPK: " + mahasiswa[i].getIpk());
        }

        // Hitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mhs : mahasiswa) {
            totalIpk += mhs.getIpk();
        }
        double rataIpk = totalIpk / mahasiswa.length;

        // Format rata-rata IPK dengan dua angka desimal
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedRataIpk = decimalFormat.format(rataIpk);

        System.out.println("\nRata-rata IPK: " + formattedRataIpk);

        // Temukan mahasiswa dengan IPK terbesar
        Mahasiswa mahasiswaTerbaik = findMahasiswaTerbaik(mahasiswa);
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mahasiswaTerbaik.getNama());
        System.out.println("NIM: " + mahasiswaTerbaik.getNim());
        System.out.println("Jenis Kelamin: " + mahasiswaTerbaik.getJenisKelamin());
        System.out.println("Nilai IPK: " + mahasiswaTerbaik.getIpk());
    }

    private static Mahasiswa findMahasiswaTerbaik(Mahasiswa[] mahasiswa) {
        Mahasiswa terbaik = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].getIpk() > terbaik.getIpk()) {
                terbaik = mahasiswa[i];
            }
        }
        return terbaik;
    }
}

class Mahasiswa {

    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }
}