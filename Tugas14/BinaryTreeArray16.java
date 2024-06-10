package Tugas14;

public class BinaryTreeArray16 {
    int[] data;
    int idxLast;

    public BinaryTreeArray16() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    // Method untuk menambahkan data ke dalam tree
    void add(int data) {
        if (idxLast == this.data.length - 1) {
            System.out.println("Tree is full");
            return;
        }
        this.data[++idxLast] = data;
    }

    // Method untuk traversePreOrder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    // Method untuk traversePostOrder
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
