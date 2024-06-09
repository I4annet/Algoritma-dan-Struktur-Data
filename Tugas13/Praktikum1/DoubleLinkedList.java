package Tugas13.Praktikum1;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(String nama, int nomor) {
        Node newNode = new Node(nama, nomor);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove() {
      if (head == null) {
        System.out.println("Antrian kosong.");
        return;
      }
      Node temp = head;
      head = head.next;
      if (head != null) {
        head.prev = null;
      } else {
        tail = null;
      }
      size--;
      System.out.println(temp.nama +  " telah selesai divaksinasi");
    }

    public void print() {
        Node current = head;
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin: ");
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("| No.     | Nama  |");
        while (current != null) {
            System.out.printf(" | %-6d | %-5s |\n", current.nomor,  current.nama );
            current = current.next;
        }
        System.out.println("Sisa antrian: " + size);
    }
}
