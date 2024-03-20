import java.util.Scanner;

/**
 * Faktorial
 */
public class Faktorial {
    
    public int nilai;
    int faktorialBF(int n) {
        int fakto = 1;
        for(int i = 1; i <= n; i++) {
            fakto = fakto * i; // Menggantikan dari fakto = fakto * 1
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml]; // Ganti ke iJml
        for(int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // Simpan nilai yang dimasukkan ke dalam objek
        }
    
        System.out.println("HASIL-BRUTE FORCE");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " 
            + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " 
            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
