package Tugas15;

import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Graph16 gedung =  new Graph16(6);
    // gedung.addEdge(0, 1, 50);
    // gedung.addEdge(0, 2, 100);
    // gedung.addEdge(1, 3, 70);
    // gedung.addEdge(2, 3, 40);                /* ( Praktikum 1 / Percobaan 1 )*/
    // gedung.addEdge(3, 4, 60);
    // gedung.addEdge(4, 5, 80);
    // gedung.degree(0);
    // gedung.printGraph();

    // gedung.removeEdge(1, 3);
    // gedung.printGraph();

        // System.out.print("Masukkan gedung asal : ");
        // int asal = sc.nextInt();
        // System.out.print("Masukkan gedung tujuan : ");
        // int tujuan = sc.nextInt();
                                                                    
        // if (gedung.isConnected(asal, tujuan)) {
        //     System.out.println("Gedung " + (char)('A' + asal) + " dan " +  (char)('A' + tujuan) + " bertetangga");
        // } else {
        //     System.out.println("Gedung " + (char)('A' + asal) + " dan" +  (char)('A' + tujuan) + "tidak bertetangga");
        // }
    


        // GraphMatriks16 gdg = new GraphMatriks16(4);
         // gdg.makeEdge(0, 1, 50);
    // gdg.makeEdge(1, 0, 60);
    // gdg.makeEdge(1, 2, 70);              
    // gdg.makeEdge(2, 1, 80);
    // gdg.makeEdge(2, 3, 40);
    // gdg.makeEdge(3, 0, 90);                 /*  Untuk Graph Matriks  ( Praktikum 2)*/

    // System.out.println("Graf sebelum penghapusan edge : ");
    // gdg.printGraph();

    // System.out.println("\nDegree dari setiap node: ");
    // gdg.printDegrees();

    // System.out.println("Hasil setelah penghapusan edge");
    // gdg.removeEdge(2, 1);
    // gdg.printGraph();
    
    // System.out.println("\nDegree dari setiap node: ");
    // gdg.printDegrees();
    
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");                  /* (Tugas Latihan Praktikum) */
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();

            switch (pilih) {
            case 1:
                System.out.print("Asal (0-3): ");
                int asal = sc.nextInt();
                System.out.print("Tujuan (0-3): ");
                int tujuan = sc.nextInt();
                System.out.print("Jarak: ");
                int jarak = sc.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;

            case 2 :
            System.out.print("Asal (0-3): ");
             asal = sc.nextInt();
            System.out.print("Tujuan (0-3): ");
             tujuan = sc.nextInt();
            System.out.print("Jarak: ");
             jarak = sc.nextInt();
            gedung.removeEdge(asal, tujuan);
            break;

            case 3 :
            System.out.print("Node (0-3): ");
            int node = sc.nextInt();
            gedung.degree(node);
            break;

            case 4:
            gedung.printGraph();
            break;

            case 5:
            System.out.print("Asal (0-3): ");
             asal = sc.nextInt();
            System.out.print("Tujuan (0-3): ");
             tujuan = sc.nextInt();
            System.out.println("Cek Edge: " + gedung.isConnected(asal, tujuan));
            break;

            case 6:
            System.out.print("Asal (0-3): ");
            asal = sc.nextInt();
           System.out.print("Tujuan (0-3): ");
            tujuan = sc.nextInt();
            System.out.print("Jarak: ");
            jarak = sc.nextInt();
            gedung.updateJarak(asal, tujuan, jarak);
            break;

            case 7:
            System.out.println("Hitung Edge: " + gedung.hitungEdge());
            break;

            case 8:
            System.out.println("Program telah berhenti.");
            sc.close();
            return;
                default:
                System.out.println("Coba lagi.");
            }
        }

   
    }
}