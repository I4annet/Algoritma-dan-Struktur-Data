package Tugas11.Latihan;

public class SIngleLinkedlistMhs {
    Node head, tail;

boolean isEmpty() {
    return head == null;
}

void print() {
    if (!isEmpty()) {
        Node tmp = head;
        System.out.print("Isi Linked list: ");
        while (tmp != null) {
            System.out.println(tmp.nim + "\t");
            tmp = tmp.next;
        }
        System.out.println();
    } else {
        System.out.println("Linked list dalam keadaan kosong");
    }
}

void addFirst(int input) {
    Node ndInput = new Node(input, null, head);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

void addLast(int input) {
    Node ndInput = new Node(input, null, head);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }
}

 void insertAfter(int key, int input) {
    Node ndInput = new Node(input, null, head);
    Node temp = head;
    while (temp != null) {
        if (temp.nim == key) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            return;
        }
        temp = temp.next;
    }
    System.out.println("Tidak ada di list");
 }

 void insertAt(int index, int input) {
    Node ndInput = new Node(input, null, head);
    if (index < 0) {
        System.out.println("Di perbaiki");
    } if (index == 0) {
        addFirst(input);
    } else {
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index terlalu banyak");
            return;
        }
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }
 }
 
 int getData(int index) {
    Node tmp = head;
    for (int i = 0; i < index; i++) {
        tmp = tmp.next;
    }
    return tmp.nim;
 }

}

