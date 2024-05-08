package tugas10.Praktikum2;

public class Queue {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            System.out.println("Queue Overflow");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if(!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
            + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println( data[i].norek + " " + data[i].nama + " "
                + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i +1) % max;
                count++;
            }
            
            System.out.println("Jumlah elemen = " + size);
        }
    }
   
    public void Enqueue(Nasabah dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                     rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public Nasabah Dequeue() {
        Nasabah dt = new Nasabah(null, null, null, max, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang : " + data[rear].norek + " " +
            data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo + " ");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
