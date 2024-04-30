package tugas10.Latihan;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear - 1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
     public void Enqueue(Pembeli pb) {
        if (IsFull()) {
             System.out.println("Pembeli sudah penuh");
         } else {
             if (IsEmpty()) {
                 front = rear = 0;
             } else {
                 if (rear == max -1) {
                     rear = -1;
                 } else {
                     rear++;
                    
                 }
             }
             antrian[++rear] = pb;
             size++;

         }
    }
    public Pembeli Dequeue() {
        Pembeli pb = new Pembeli(null, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            pb = antrian[front++];
            if (front == max) {
                front = 0;
            }
            size--;
            return pb;
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Daftar pembeli masih kosong");
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println( antrian[rear].nama + " " + antrian[rear].noHp + " ");
                i = (i + 1) % max;
                count++;
            }
            System.out.println("Elemen terdepan: " + size );
    }
}
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan : " + antrian[front].nama + " " + antrian[front].noHp + " ");
        } else {
            System.out.println("Pembeli masih kosong");
        }

    }
    public void peekRear() {
        if (IsFull()) {
            System.out.println("Antrian terbelakang: " + antrian[rear].nama + " " 
            + antrian[rear].noHp + " ");
        } else {
            System.out.println("Pembeli masih kosong");            
        }
    }
    public void peekPosition(String nama) {
        boolean found = false;
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (antrian[i].equals(nama)) {
            found = true;
            pos = i;
            break;
        }
        if (found) {
            System.out.println("Pembeli dengan nama " + nama + " berada pada posisi antrian ke-" + (pos + 1));
        } else {
            System.out.println("Pembeli dengan nama" + nama + "tidak ditemukan");
        }
    }
}
}