package Tugas11;

public class SingleLinkedlist {
    Node head, tail;

boolean isEmpty() {
    return head == null;
}
void print() {
    if (!isEmpty()) {
        Node tmp = head;
        System.out.print("Isi Linked List: ");
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println();
    } else {
        System.out.println("Linked List kosong");
    }
}
void addFirst(int input) {
    Node ndInput = new Node(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        ndInput.next = head;
        head = ndInput;
    }
}

void addLast(int input) {
    Node ndInput = new Node(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }
}

void insertAfter(int key, int input) {
    Node ndInput = new Node(input, null);
    Node temp = head;
    while (temp != null) {
        if (temp.data == key) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            return;
        }
        temp = temp.next;
    } 
    System.out.println("tidak ada di list");
}

void insertAt(int index, int input) {
    Node ndInput = new Node(input, null);
    if (index < 0) {
        System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
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
    for (int i = 0; i < index ; i++) {
        tmp = tmp.next;
    }
    return tmp.data;
}

int indexOf(int key) {
    Node tmp = head;
    int index = 0;
    while (tmp != null && tmp.data != key) {
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
    if (head.data == key) {
        removeFirst();
        return;
    }
        Node temp = head;
        while (temp != null) {
            if (temp.next.data == key) {
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
