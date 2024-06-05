## Jobsheet Double Linked List
## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## NIM : 2341720126 

## Percobaan 1 : Implementasi Graph menggunakan Linked List

### A. Membuat Class Node16.java
```java
package Tugas15;

public class Node16 {
    
    Node16 prev;
    Node16 next;
    int jarak;
    int data;

    public Node16( Node16 prev, int data, int jarak, Node16 next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
            this.jarak = jarak;
           
        }
    }
```
### B. Membuat Class DoubleLinkedList16.java
```java
package Tugas15;

public class DoubleLinkedList16 {
    Node16 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    } 
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node16(null, item, jarak, null);
        } else {
            Node16 newNode = new Node16(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void remove(int index) {
        Node16 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
            } else {
                head = current.next;
                
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            break;
        }
        current = current.next;
    }
}
     public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node16 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    } 

        public int size() {
            return size;
        }
    
        public void clear() {
            head = null;
            size = 0;
        }
    
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
    
        public void removeLast() throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus");
            } else if (head.next == null) {
                    head = null;
                    size--;
                    return;
            } 
            Node16 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
             current.next = null;
             size--;   
            }
            
            public int getLast() throws Exception {
                if (isEmpty()) {
                    throw new Exception("Linked List Kosong");
                }
                Node16 tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                return tmp.data;
            }
    
            public int get(int index) throws Exception {
                if (isEmpty() || index >= size) {
                    throw new Exception("Nilai indeks di luar batas");
                }
                Node16 tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.data;
                
            }
    }
```    
### C. Membuat Class Graph16.java
```java
package Tugas15;

public class Graph16 {
        int vertex;
        DoubleLinkedList16 list[];

        public Graph16(int v) {
            vertex = v;
            list = new DoubleLinkedList16[v];
            for (int i = 0; i < v; i++) {
                list[i] = new DoubleLinkedList16();
            }
        }

        public void addEdge(int asal, int tujuan, int jarak) {
            list[asal].addFirst(tujuan, jarak);
            list[tujuan].addFirst(asal, jarak);    /* Untuk Undirected Graph */
        }

        public void degree(int asal) throws Exception {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                //InDegree
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
                //OutDegree
                for (k = 0; k < list[asal].size(); k++) { 
                    list[asal].get(k);
                }
                totalOut = k;
            }

            System.out.println("InDegree dari Gedung " + (char) ( 'A' + asal) + ": " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ( 'A' + asal) + ": " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ( 'A' + asal) + ": " + (totalIn + totalOut));

            System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());  /* Digunakan Untuk Undirected Graph */
        }

        public void removeEdge(int asal, int tujuan) throws Exception {
            for (int i = 0; i < vertex; i++) {
                if (i == tujuan) {
                    list[asal].remove(tujuan);
                }
            }
        }

        public void removeAllEdges() {
            for (int i = 0; i < vertex; i++) {
                list[i].clear();
            }
            System.out.println("Graf berhasil dikosongkan");
        }

        public void printGraph() throws Exception {
            for (int i = 0; i < vertex; i++) {
                if (list[i].size() > 0) {
                    System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
}
```
### D. Membuat Class GraphMain16.java
```java
package Tugas15;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
    Graph16 gedung =  new Graph16(6);
    gedung.addEdge(0, 1, 50);
    gedung.addEdge(0, 2, 100);
    gedung.addEdge(1, 3, 70);
    gedung.addEdge(2, 3, 40);
    gedung.addEdge(3, 4, 60);
    gedung.addEdge(4, 5, 80);
    gedung.degree(0);
    gedung.printGraph();
```

## Verifikasi Hasil Percobaan 
 ### A. Menggunakan directed weighted graph                                                
```java                                                                                                             
InDegree dari Gedung A: 0   
OutDegree dari Gedung A: 2
Degree dari Gedung A: 2
Gedung A terhubung dengan
C (100 m), B (50 m),
Gedung B terhubung dengan
D (70 m),
Gedung C terhubung dengan
D (40 m),
Gedung D terhubung dengan
E (60 m),
Gedung E terhubung dengan
F (80 m),
```
 ### B. Menggunakan Undirected weighted graph 

## Pertanyaan 1 
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan 
variabel tersebut! 
3. Jelaskan alur kerja dari method removeEdge! 
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add 
jenis lain saat digunakan pada method addEdge pada class Graph? 
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara 
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). 


## Percobaan 2 : Implementasi Graph menggunakan Matriks


## Verifikasi Hasil Percobaan

## Pertanyaan 2
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Apa jenis graph yang digunakan pada Percobaan 2? 
3. Apa maksud dari dua baris kode berikut? 
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk 
inDegree dan outDegree!