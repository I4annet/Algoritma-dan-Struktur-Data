import java.util.Scanner;

public class Fungsi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int[][] stokBunga = new int[4][4];
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        // Memasukkan data stok bunga
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print("Masukkan stok " + namaBunga[j] + " di " + namaCabang[i] + ": ");
                stokBunga[i][j] = scanner.nextInt();
            }
        }

        // Menghitung total stok
        int[] totalStokBunga = new int[namaBunga.length];
        for (int i = 0; i < totalStokBunga.length; i++) {
            for (int j = 0; j < stokBunga.length; j++) {
                totalStokBunga[i] += stokBunga[j][i];
            }
        }

        // Menampilkan tabel stok bunga
        System.out.println();
        System.out.println("## Stok Bunga RoyalGarden (" + new java.util.Date() + ")");
        System.out.println();
        System.out.println("| Cabang | Aglonema | Keladi | Alocasia | Mawar |");
        System.out.println("|---|---|---|---|---|");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.print("| " + namaCabang[i] + " |");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print(" " + stokBunga[i][j] + " |");
            }
            System.out.println();
        }

        // Menampilkan total stok
        System.out.println();
        System.out.println("**Total Stok:**");
        for (int i = 0; i < totalStokBunga.length; i++) {
            System.out.println("* " + namaBunga[i] + ": " + totalStokBunga[i]);
        }

        // Mencari cabang dengan stok bunga terbanyak
        int[] maxStokCabang = new int[namaBunga.length];
        for (int i = 0; i < maxStokCabang.length; i++) {
            maxStokCabang[i] = stokBunga[0][i];
        }
        for (int i = 1; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                if (stokBunga[i][j] > maxStokCabang[j]) {
                    maxStokCabang[j] = stokBunga[i][j];
                }
            }
        }

        // Menampilkan cabang dengan stok bunga terbanyak
        System.out.println();
        System.out.println("**Cabang dengan Stok Bunga Terbanyak:**");
        for (int i = 0; i < maxStokCabang.length; i++) {
            for (int j = 0; j < stokBunga.length; j++) {
                if (stokBunga[j][i] == maxStokCabang[i]) {
                    System.out.println("* " + namaBunga[i] + ": " + namaCabang[j]);
                }
            }
        }

        // Menghitung pendapatan setiap cabang
        System.out.println();
        System.out.println("**Pendapatan Setiap Cabang:**");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatanCabang += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("* " + namaCabang[i] + ": " + pendapatanCabang);
        }
    }
}