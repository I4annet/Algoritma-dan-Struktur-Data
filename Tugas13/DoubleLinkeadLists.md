## Jobsheet Double Linked List
## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## NIM : 2341720126 



### Membuat Class Node
```java
package Tugas13;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node (Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
```

### Membuat Class DoubleLinkedLists
```java
package Tugas13;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
        }
    
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node current = head;
            int i = 0;
            while (i < index && current.next != null) {
                current = current.next;
                i++;
            }
            if (i == index) {
                Node newNode = new Node(current.prev, item, current);
                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                current.prev = newNode;
                if (index == 0) {
                    head = newNode;
                }
                size++;
            } else {
               addLast(item);
            }
        }

    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List kosong");
        }
    }

```

### Membuat Class DoubleLinkedListsMain
```java
package Tugas13;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}
```
## Verifikasi Hasil Percobaan
```java
Linked List kosong
Size : 0
====================================
7       3       4
berhasil diisi
Size : 3
=====================================
7       40      3       4
berhasil diisi
Size : 4
=====================================
Linked List kosong
Size : 0
```

## Pertanyaan 1 
1. Jelaskan perbedaan antara single linked list dengan double linked lists! 
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut? 
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan 
size seperti pada gambar berikut ini? 
```java
  public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
```
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null? 

Node newNode = new Node(null, item, head);
5. Perhatikan pada method addFirst().  Apakah arti statement head.prev = newNode ? 
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null? 
Node newNode = new Node(current, item, null);  
7. Pada method add(), terdapat potongan kode program sebagai berikut:
```java
if (current.prev == null) {
    Node newNode
}
```
jelaskan maksud dari bagian kode itu.

## Percobaan 2
### Menambah method removeFirst() pada class DoubleLinkedLists
```java
  public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if( size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
```
### Menambah method removeLast() pada class DoubleLinkedLists
```java
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
                head = null;
                size--;
                return;
        } 
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
         current.next = null;
         size--;   
        }
```
### Menambah method remove(int index) pada class DoubleLinkedLists
```java
        public void remove(int index) throws Exception {
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai indeks diluar batas");
            } else if (index == 0) {
                removeFirst();
            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    current.prev.next = null;
                } else if (current.prev == null) {
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        }
```
### Menambahkan method remove(int index), removeLast(), removeFirst() pada class DoubleLinkedListsMain
```java
  dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("======================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
```
## Verifikasi Hasil Percobaan
```java
50      40      10      20
berhasil diisi
Size : 4
======================================
40      10      20
berhasil diisi
Size : 3
=======================================
40      10
berhasil diisi
Size : 2
========================================
40
berhasil diisi
Size : 1
```
## Pertanyaan 2
1. Apakah maksud statement berikut pada method removeFirst()? 
head = head.next; 
head.prev = null; 
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? 
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
```java
    Node tmp = head.next;

    head.next = tmp.next;
    tmp.next.prev = head;
```
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
```java
    current.prev.next = current.next;
    current.next.prev = current.prev;
``` 
## Percobaan 3
### Menambahkan method getLast() pada Class DoubleLinkedLists
```java
        public int getLast() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List Kosong");
            }
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
```
### Menambahkan method get(int index) pada Class DoubleLinkedLists
```java
        public int get(int index) throws Exception {
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai indeks di luar batas");
            }
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
```
### Menambahkan method getFirst() pada Class DoubleLinkedLists 
```java
        public int getFirst() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List kosong");
            }
            return head.data;
        }
```
### Menambahkan method getFirst(), get(int index), getLast() pada Class DoubleLinkedListsMain
```java
    dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
```
## Verifikasi Hasil Percobaan
```java
Linked List kosong
Size : 0
====================================
7       3       4
berhasil diisi
Size : 3
=====================================
7       40      3       4
berhasil diisi
Size : 4
=====================================
Data awal pada Linked Lists adalah: 7
Data akhir pada Linked Lists adalah: 4
Data indeks ke-1 pada Linked Lists adalah: 40
```
## Pertanyaan 3
1. Jelaskan method size() pada class DoubleLinkedLists! 
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke- 
1! 
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!  
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! 

## Tugas Praktikum
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada) 

2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini. 