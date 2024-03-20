public class Segitiga {

    public int alas;
    public int tinggi;

    // Konstruktor dengan parameter int a (alas) dan int t (tinggi)
    public Segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga (asumsi siku-siku)
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        // Membuat array Segitiga sgArray dengan 4 elemen
        Segitiga[] sgArray = new Segitiga[4];

        // Mengisi atribut masing-masing elemen sgArray
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        // Menggunakan looping untuk mencetak luas dan keliling segitiga
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
            System.out.println();
        }
    }
}
