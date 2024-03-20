import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendapatkan nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Memvalidasi nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Menentukan nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Menentukan kualifikasi
        String kualifikasi;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            kualifikasi = "LULUS";
        } else {
            kualifikasi = "TIDAK LULUS";
        }

        // Menampilkan hasil
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}