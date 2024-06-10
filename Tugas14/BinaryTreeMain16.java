package Tugas14;

public class BinaryTreeMain16 {
    public static void main(String[] args) {
    BinaryTree16 bt =  new BinaryTree16();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    bt.add(10);
    bt.add(15);

    System.out.print("PreOrder Traversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println();

    System.out.print("InOrder Traversal : ");
    bt.traverseInOrder(bt.root);
    System.out.println();

    System.out.print("PostOrder Traversal : ");
    bt.traversePostOrder(bt.root);
    System.out.println();

    System.out.println("Find Node : " + bt.find(5));
    System.out.println("Delete Node 8 ");
    bt.delete(8);
    
    System.out.println();
    System.out.print("PreOrder Traversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println();

    // Menambahkan node menggunakan method addRecursive
    System.out.println("Menambahkan node 2 menggunakan rekursif");
    bt.addRecursive(2);
    System.out.print("InOrder Traversal after adding 2: ");
    bt.traverseInOrder(bt.root);
    System.out.println();

    // Menampilkan nilai paling kecil dan paling besar 
    System.out.println("Nilai paling kecil di tree: " + bt.findMin());
    System.out.println("Nilai paling besar di tree: " + bt.findMax());

    // Menampilkan leaf nodes
    System.out.print("Leaf nodes: ");
    bt.printLeafNode();
    System.out.println();
    
    // Menampilkan jumlah leaf nodes
    System.out.println("Jumlah leaf nodes: " + bt.countLeafNodes());
    }
}
