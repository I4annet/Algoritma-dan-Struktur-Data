import java.util.Scanner;

class Kerucut {
    private double radius;
    private double sisiMiring;

    public Kerucut(double radius, double sisiMiring) {
        this.radius = radius;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * radius * (radius + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * sisiMiring;
    }
}

class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggi;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggi) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggi);
    }

    public double hitungVolume() {
        return (1.0 / 3) * panjangSisiAlas * panjangSisiAlas * tinggi;
    }
}

class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double radiusKerucut = scanner.nextDouble();
        System.out.print("Masukkan sisi miring kerucut: ");
        double sisiMiringKerucut = scanner.nextDouble();

        Kerucut kerucut = new Kerucut(radiusKerucut, sisiMiringKerucut);

        // Input untuk Limas Segi Empat
        System.out.print("Masukkan panjang sisi alas limas segi empat: ");
        double panjangSisiAlasLimas = scanner.nextDouble();
        System.out.print("Masukkan tinggi limas segi empat: ");
        double tinggiLimas = scanner.nextDouble();

        LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlasLimas, tinggiLimas);

        // Input untuk Bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariJariBola = scanner.nextDouble();

        Bola bola = new Bola(jariJariBola);

        // Menampilkan hasil perhitungan
        System.out.println("Luas Permukaan dan Volume Kerucut:");
        System.out.println("Luas Permukaan: " + Math.round(kerucut.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(kerucut.hitungVolume()));

        System.out.println("\nLuas Permukaan dan Volume Limas Segi Empat:");
        System.out.println("Luas Permukaan: " + Math.round(limas.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(limas.hitungVolume()));

        System.out.println("\nLuas Permukaan dan Volume Bola:");
        System.out.println("Luas Permukaan: " + Math.round(bola.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(bola.hitungVolume()));

        scanner.close();
    }
}