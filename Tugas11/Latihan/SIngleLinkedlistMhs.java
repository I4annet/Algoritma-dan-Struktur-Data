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
            System.out.println("NIM : " + tmp.nim + ", Nama : " + tmp.nama);
            tmp = tmp.next;
        }
        System.out.println();
    } else {
        System.out.println("Linked list dalam keadaan kosong");
    }
}

void addFirst(int nim, String nama) {
    Node ndInput = new Node(nim, nama);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

void addLast(int nim, String nama) {
    Node ndInput = new Node(nim, nama);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }
}

 void insertAfter(int key, int nim, String nama) {
    Node ndInput = new Node(nim, nama);
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

 void insertAt(int index, int nim, String nama) {
    Node ndInput = new Node(nim, nama);
    if (index < 0) {
        System.out.println("Di perbaiki");
    } if (index == 0) {
        addFirst(nim, nama);
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
 int indexOf(int key) {
    Node tmp = head;
    int index = 0;
    while (tmp != null && tmp.nim != key) {
        tmp = tmp.next;
        index++;
    }
    if (tmp != null) {
        return index;
    } else {
        return -1;
    }
 }
 void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        return;
    }
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
    }
 }
 void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        return;
    }
    if (head == tail) {
        head = tail = null;
        return;
    }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
            return;
        }
    
    if (head.nim == key) {
        removeFirst();
        return;
    }
        Node temp = head;
        while (temp != null) {
            if (temp.next.nim == key) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
            }
        }
    
    public void removeAt(int index) {
    if (index < 0) {
        System.out.println("Indeks tidak valid");
        return;
    }

    if (index == 0) {
        removeFirst();
        return;
    } 

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Indeks terlalu besar");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    
    }
}


