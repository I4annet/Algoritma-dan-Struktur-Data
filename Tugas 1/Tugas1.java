import java.util.Scanner;

/**
 * Tugas 1
 */
public class Tugas1 {

  public static void main(String[] args) {
    // Array untuk menyimpan kode plat dan nama kota
    String[][] data = {
      {"A", "Banten"},
      {"B", "Jakarta"},
      {"D", "Bandung"},
      {"E", "Cirebon"},
      {"F", "Bogor"},
      {"G", "Pekalongan"},
      {"H", "Semarang"},
      {"L", "Surabaya"},
      {"M", "Malang"},
      {"T", "Tegal"}
    };

    // Scanner untuk membaca input dari pengguna
    Scanner scanner = new Scanner(System.in);

    // Meminta input kode plat
    System.out.print("Masukkan kode plat: ");
    String kodePlat = scanner.nextLine().toUpperCase();

    // Mencari nama kota yang sesuai dengan kode plat
    String namaKota = "";
    for (String[] datum : data) {
      if (datum[0].equals(kodePlat)) {
        namaKota = datum[1];
        break;
      }
    }

    // Menampilkan hasil
    if (namaKota.isEmpty()) {
      System.out.println("Kode plat tidak ditemukan!");
    } else {
      System.out.println("Kota: " + namaKota);
    }
  }
}