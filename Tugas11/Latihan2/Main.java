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
