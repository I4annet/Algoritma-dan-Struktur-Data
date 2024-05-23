# JOBSHEET 11 : LINKED LIST

## Percobaan 1
### 1. Membuat Class Node

```java
package Tugas11;

public class Node {
    int data;
    Node next;

    Node(int nilai, Node berikunya) {
        data = nilai;
        next = berikunya;
    }
}
```

### 2. Membuat Class SingleLinkedlist
```java
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
    } else if (index == 0) {
        addFirst(input);
    } else {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index terlalu banyak");
            return;
        }   
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput;
        }
    }
}
}
```
### 3. Membuat Class SLLMain
```java
package Tugas11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedlist singLL = new SingleLinkedlist();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
```

## Verifikasi Hasil Percobaan 1
```java
Linked List kosong
Isi Linked List: 890
Isi Linked List: 890    760
Isi Linked List: 700    890     760
Isi Linked List: 700    999     890     760
Isi Linked List: 700    999     890     833     760
PS D:\GitHub\Algoritma-dan-Struktur-Data>
```

## Pertanyaan 1
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

<i> Jawaban : </i>  
Karena terdapat adanya singLL.print() namun tidak ada method yang ingin di print dan juga singLL.print() berkeadaan IsEmpty(). Maka output yang keluar adalah
"Linked List Kosong"

2. Jelaskan kegunaan variable temp secara umum pada setiap method!

<i> Jawaban : </i> 

Untuk menyimpan referensi ke node saat melakukan operasi ke linked list.

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut !
```java
if (temp.next.next == null) 
tail = temp.next;
```

<i> Jawaban : </i>

Digunakan untuk memastikan jika node yang ditambahkan sebagai node terakhir dalam linked list, dan memperbarui referensi dari tail jika diperlukan



## Percobaan 2
```java
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
```

## Verifikasi Hasil Percobaan 2
```java
Linked List kosong
Isi Linked List: 890
Isi Linked List: 890    760
Isi Linked List: 700    890     760
Isi Linked List: 700    999     890     760
Isi Linked List: 700    999     890     833     760
Data pada indeks ke-1=999
Data 3 berada pada indeks ke-4
Isi Linked List: 700    890     833     760
Isi Linked List: 890    833     760
Isi Linked List: 833    760
Isi Linked List: 833
```

## Pertanyaan 2
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

<i> Jawaban : </i>

Digunakan untuk menghentikan penghapusan data jika data yang ingin dihapus sudah ditemukan.

2. Jelaskan kegunaan kode dibawah pada method remove
```java
    else if (temp.next.data == key) {
        temp.next = temp.next.next;
```
<i> Jawaban : </i>

Digunakan untuk menghapus node yang tidak akan terhubung ke linked list.


## Tugas
![alt text](./Gambar%20Soal/Gambar%20soal%20Latihan.png)
1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.

### Class : Node
```java
package Tugas11.Latihan;

public class Node {
    int nim;
    String nama;
    Node next;

    Node(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }
}
```



### Class : SIngleLinkedlistMhs
```java
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
```

### Class : SLLMhsMain
```java
package Tugas11.Latihan;

import Tugas11.SingleLinkedlist;

public class SLLMhsMain {
    public static void main(String[] args) {
        SIngleLinkedlistMhs list = new SIngleLinkedlistMhs();
        list.addFirst(111, "Anton");
        list.addLast(112, "Prita");
        list.insertAfter(112, 113, "Yusuf");
        list.insertAt(3, 114, "Doni");
        list.insertAt(4, 115, "Sari");

        list.print();
    }
}

```



2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang 
ditunjukkan pada soal nomor 1! Ketentuan 

a. Implementasi antrian menggunakan Queue berbasis Linked List! 

b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!

### Class : Node
```java
package Tugas11.Latihan2;

public class Node {
    int NIM;
    String nama;
    Node next;

    public Node(int NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
        this.next = null;
    }
}

```

### Class : SLL (Single Linked List)
```java
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
```

### Class : Main
```java
package Tugas11.Latihan2;

public class Main {
    public static void main(String[] args) {
    SLL queue = new SLL();

        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        System.out.println("Isi antrian: ");
        queue.printQueue();
        
        System.out.println("\nMenghapus elemen dari antrian: ");
        while (!queue.IsEmpty()) {
            Node removedNode = queue.dequeue();
            System.out.println("Dihapus - NIM: " + removedNode.NIM + ", Nama: " + removedNode.nama);
        }
        System.out.println("\nisi antrian setelah penghapusan: ");
        queue.printQueue();
    }
}
```
