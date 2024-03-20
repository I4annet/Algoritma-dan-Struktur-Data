import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan (v) = " + kecepatan + " Km/h");
    }

    static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s) = " + jarak + " Kilometer");
    }

    static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu (t) = " + waktu + " jam");
    }
}