package Tugas13.Praktikum1;

public class Node {
    int nomor;
    String nama;
    Node next;
    Node prev;

    public Node(String nama, int nomor) {
        this.nama = nama;
        this.next = null;
        this.prev = null;
        this.nomor = nomor;
        
    }
}   
