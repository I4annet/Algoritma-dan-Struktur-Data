import java.util.Scanner;

public class Pangkat {

    public int nilai, pangkat;

    int pangkatBF(int a, int n) {
        int hasil = 1; // Inisialisasi ke 1, bukan 0
        for (int i = 0; i < n; i++) {
            hasil *= a; //Kalikan 'hasil' dengan 'a' sebanyak 'n' kali
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a; 
        } else {
            if (n % 2 == 1) // BILANGAN GANJIL
            {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else { // BILANGAN GENAP
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}

class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt(); // Simpan nilai yang dimasukkan ke dalam objek
            System.out.println("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc.nextInt(); // Simpan nilai yang dimasukkan ke dalam objek
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
