import java.util.Scanner;

public class MainUTS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = {34, 1, 20, 48, 41, 18, 47, 25, 24, 47, 23, 21, 26, 22, 28, 39, 14 };
        MethodUTS method = new MethodUTS();
        int pilihPengurutan;

        
        System.out.println("=========================");
        System.out.println("Nilai sebelum Pengurutan:");
        method.tampilArray(nilai);

        do {
        System.out.println("=========================");
        System.out.println("PILIH MENU               ");
        System.out.println("1. Pengurutan            ");
        System.out.println("2. Pencarian             ");
        System.out.println("3. Keluar                ");
        System.out.println("=========================");
        System.out.print("Pilih : ");
        pilihPengurutan = sc.nextInt();

        switch (pilihPengurutan) {
        case 1:
        System.out.println("=========================");
        System.out.println("1. Ascending             ");
        System.out.println("2. Descending            ");
        System.out.println("=========================");
        System.out.print("Pilih: ");
        int pilihanPengurutan = sc.nextInt();

       switch (pilihanPengurutan) {
        case 1:
        method.InsertionSortAscending(nilai);
        System.out.println("Hasil Pengurutan ascending");
        method.tampilArray(nilai);
        break;
        
        case 2:
        method.InsertionSortDescending(nilai);
        System.out.println("Hasil Pengurutan descending");
        method.tampilArray(nilai);
        break;

        default:
        System.out.println("Pilihan tidak valid");
        break;
       }
       break;

       case 2:
       System.out.print("Cari Nilai : ");
       int cariNilai = sc.nextInt();
        
       int index = method.binarySearch(nilai, cariNilai);

       if (index != -1) {
        System.out.println("Nilai " + cariNilai + " ditemukan pada indeks  " + index);
       } else {
        System.out.println("Nilai " + cariNilai + " tidak ditemukan");
       }
       break;

       case 3:
       System.out.println("Program berhenti");
       break;

       default:
        System.out.println("Pilihan tidak valid");
        break;
     }
    
     } while (pilihPengurutan != 3);
    }
}