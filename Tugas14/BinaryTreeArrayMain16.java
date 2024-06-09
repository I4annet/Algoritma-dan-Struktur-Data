package Tugas14;

public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
    BinaryTreeArray16 bta = new BinaryTreeArray16();
    int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
    int idxLast = 6;
    bta.populateData(data, idxLast);
    System.out.println("\nInorder Traversal : ");
    bta.traverseInOrder(0);
    System.out.println("\n");
    }
}
