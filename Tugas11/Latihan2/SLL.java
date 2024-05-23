package Tugas11.Latihan2;

public class SLL {
    Node head;
    Node tail;

    public SLL() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int NIM, String nama) {
        Node newNode =  new Node(NIM, nama);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public Node dequeue() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void printQueue() {
        Node current = head;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nam: " + current.nama);
            current = current.next;
        }
    }
}
