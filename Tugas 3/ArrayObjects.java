import java.util.Scanner;

public class ArrayObjects {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input untuk panjang array
        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();

        // Membuat array objek sesuai dengan panjang yang diinputkan
        ArrayObjects[] ppArray = new ArrayObjects[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            ppArray[i] = new ArrayObjects();
            System.out.println("Persegi panjang ke-" + i);
            
            // Meminta input panjang
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            
            // Meminta input lebar
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        
        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
