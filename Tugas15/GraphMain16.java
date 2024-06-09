package Tugas15;

import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Graph16 gedung =  new Graph16(6);
    gedung.addEdge(0, 1, 50);
    gedung.addEdge(0, 2, 100);
    gedung.addEdge(1, 3, 70);
    gedung.addEdge(2, 3, 40);
    gedung.addEdge(3, 4, 60);
    gedung.addEdge(4, 5, 80);
    gedung.degree(0);
    gedung.printGraph();

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
    /*  Untuk Graph Matriks */
    GraphMatriks16 gdg = new GraphMatriks16(4);
    gdg.makeEdge(0, 1, 50);
    gdg.makeEdge(1, 0, 60);
    gdg.makeEdge(1, 2, 70);              
    gdg.makeEdge(2, 1, 80);
    gdg.makeEdge(2, 3, 40);
    gdg.makeEdge(3, 0, 90);

    System.out.println("Graf sebelum penghapusan edge : ");
    gdg.printGraph();

    System.out.println("\nDegree dari setiap node: ");
    gdg.printDegrees();

    System.out.println("Hasil setelah penghapusan edge");
    gdg.removeEdge(2, 1);
    gdg.printGraph();
    
    System.out.println("\nDegree dari setiap node: ");
    gdg.printDegrees();
    }
}