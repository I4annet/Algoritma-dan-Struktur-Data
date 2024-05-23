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
