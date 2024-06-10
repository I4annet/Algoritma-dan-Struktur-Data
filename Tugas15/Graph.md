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
```java
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

PS D:\GitHub\Algoritma-dan-Struktur-Data> 
```

## Pertanyaan 1 
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan 
variabel tersebut!
<i> Jawaban </i>

3. Jelaskan alur kerja dari method removeEdge! 
<i> Jawaban </i>

4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add 
jenis lain saat digunakan pada method addEdge pada class Graph?
<i> Jawaban </i>

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara 
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). 
```java
public boolean isConnected(int asal, int tujuan) throws Exception {
            for (int i = 0; i < list[asal].size(); i++) {
                if (list[asal].get(i) == tujuan) {
                    return true;
                }
            }
            return false;
        }
```
```java 
System.out.print("Masukkan gedung asal : ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = sc.nextInt();

        if (gedung.isConnected(asal, tujuan)) {
            System.out.println("Gedung " + (char)('A' + asal) + " dan " +  (char)('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char)('A' + asal) + " dan" +  (char)('A' + tujuan) + "tidak bertetangga");
        }
```
```java
Masukkan gedung asal : 2
Masukkan gedung tujuan : 3
Gedung C dan D bertetangga
PS D:\GitHub\Algoritma-dan-Struktur-Data>
Masukkan gedung asal : 2
Masukkan gedung tujuan : 5
Gedung C dan F tidak bertetangga
```
## Percobaan 2 : Implementasi Graph menggunakan Matriks
### Membuat Class baru untuk Matriks (GraphMatriks)
```java
package Tugas15;

public class GraphMatriks16 {
    int vertex;
    int[][] matriks;

    public GraphMatriks16(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = 0;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m),");
            }
            System.out.println();
        }
    }
}
```
### Penambahan Kode untuk memanggil Class GraphMatriks di Class GraphMain
```java
GraphMatriks16 gdg = new GraphMatriks16(4);
    gdg.makeEdge(0, 1, 50);
    gdg.makeEdge(1, 0, 60);
    gdg.makeEdge(1, 2, 70);              
    gdg.makeEdge(2, 1, 80);
    gdg.makeEdge(2, 3, 40);
    gdg.makeEdge(3, 0, 90);
    gdg.printGraph();
    System.out.println("Hasil setelah penghapusan edge");
    gdg.removeEdge(2, 1);
    gdg.printGraph();
```

## Verifikasi Hasil Percobaan
```java
Gedung A: Gedung A (0 m),Gedung B (50 m),Gedung C (0 m),Gedung D (0 m),
Gedung B: Gedung A (60 m),Gedung B (0 m),Gedung C (70 m),Gedung D (0 m),
Gedung C: Gedung A (0 m),Gedung B (80 m),Gedung C (0 m),Gedung D (40 m),
Gedung D: Gedung A (90 m),Gedung B (0 m),Gedung C (0 m),Gedung D (0 m),
Hasil setelah penghapusan edge
Gedung A: Gedung A (0 m),Gedung B (50 m),Gedung C (0 m),Gedung D (0 m),
Gedung B: Gedung A (60 m),Gedung B (0 m),Gedung C (70 m),Gedung D (0 m),
Gedung C: Gedung A (0 m),Gedung B (0 m),Gedung C (0 m),Gedung D (40 m),
Gedung D: Gedung A (90 m),Gedung B (0 m),Gedung C (0 m),Gedung D (0 m),
PS D:\GitHub\Algoritma-dan-Struktur-Data>
```
## Pertanyaan 2
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Apa jenis graph yang digunakan pada Percobaan 2?

<i> Jawaban </i>

3. Apa maksud dari dua baris kode berikut? 
```java
gdg.makeEdge(1, 2, 70);              
gdg.makeEdge(2, 1, 80);
```
<i> Jawaban </i>

4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk 
inDegree dan outDegree!
### Menambahkan method OutDegree(int node16), inDegree(int node16), printDegrees() di Class GraphMatriks
```java
public int outDegree(int node) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int inDegree(int node) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            int inDeg = inDegree(i);
            int outDeg = outDegree(i);
            System.out.println("Gedung " + (char) ('A' + i) + " - In-degree: " + inDeg + ", Out-degree: " + outDeg);
        }
    }
```
### Menambahkan kode untuk memanggil method OutDegree(int node16), inDegree(int node16), printDegrees() di Class GraphMain
```java 
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
```
### Output 
```java
Graf sebelum penghapusan edge :
Gedung A: Gedung A (0 m),Gedung B (50 m),Gedung C (0 m),Gedung D (0 m),
Gedung B: Gedung A (60 m),Gedung B (0 m),Gedung C (70 m),Gedung D (0 m),
Gedung C: Gedung A (0 m),Gedung B (80 m),Gedung C (0 m),Gedung D (40 m),
Gedung D: Gedung A (90 m),Gedung B (0 m),Gedung C (0 m),Gedung D (0 m),

Degree dari setiap node:
Gedung A - In-degree: 2, Out-degree: 1
Gedung B - In-degree: 2, Out-degree: 2
Gedung C - In-degree: 1, Out-degree: 2
Gedung D - In-degree: 1, Out-degree: 1
Hasil setelah penghapusan edge
Gedung A: Gedung A (0 m),Gedung B (50 m),Gedung C (0 m),Gedung D (0 m),
Gedung B: Gedung A (60 m),Gedung B (0 m),Gedung C (70 m),Gedung D (0 m),
Gedung C: Gedung A (0 m),Gedung B (0 m),Gedung C (0 m),Gedung D (40 m),
Gedung D: Gedung A (90 m),Gedung B (0 m),Gedung C (0 m),Gedung D (0 m),

Degree dari setiap node:
Gedung A - In-degree: 2, Out-degree: 1
Gedung B - In-degree: 1, Out-degree: 2
Gedung C - In-degree: 1, Out-degree: 1
Gedung D - In-degree: 1, Out-degree: 1
PS D:\GitHub\Algoritma-dan-Struktur-Data>
```

## Latihan Praktikum
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat 
dinamis, setidaknya terdiri dari: 
a) Add Edge 
b) Remove Edge 
c) Degree 
d) Print Graph 
e) Cek Edge 
Pengguna dapat memilih menu program melalui input Scanner 
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak 
antara dua node asal dan tujuan! 
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!

```java
 public int hitungEdge() {
            int count = 0;
            for (int i = 0; i < vertex; i++) {          
              count += list[i].size();
                }
            
            return count;
        }
        public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
            for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(tujuan);
                list[asal].addFirst(tujuan, jarak);
                return;
            }
        }
    }
```

```java
    while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");                  /* (Tugas Latihan Praktikum) */
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();

            switch (pilih) {
            case 1:
                System.out.print("Asal (0-3): ");
                int asal = sc.nextInt();
                System.out.print("Tujuan (0-3): ");
                int tujuan = sc.nextInt();
                System.out.print("Jarak: ");
                int jarak = sc.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;

            case 2 :
            System.out.print("Asal (0-3): ");
             asal = sc.nextInt();
            System.out.print("Tujuan (0-3): ");
             tujuan = sc.nextInt();
            System.out.print("Jarak: ");
             jarak = sc.nextInt();
            gedung.removeEdge(asal, tujuan);
            break;

            case 3 :
            System.out.print("Node (0-3): ");
            int node = sc.nextInt();
            gedung.degree(node);
            break;

            case 4:
            gedung.printGraph();
            break;

            case 5:
            System.out.print("Asal (0-3): ");
             asal = sc.nextInt();
            System.out.print("Tujuan (0-3): ");
             tujuan = sc.nextInt();
            System.out.println("Cek Edge: " + gedung.isConnected(asal, tujuan));
            break;

            case 6:
            System.out.print("Asal (0-3): ");
            asal = sc.nextInt();
           System.out.print("Tujuan (0-3): ");
            tujuan = sc.nextInt();
            System.out.print("Jarak: ");
            jarak = sc.nextInt();
            gedung.updateJarak(asal, tujuan, jarak);
            break;

            case 7:
            System.out.println("Hitung Edge: " + gedung.hitungEdge());
            break;

            case 8:
            System.out.println("Program telah berhenti.");
            sc.close();
            return;
                default:
                System.out.println("Coba lagi.");
            }
        }
```