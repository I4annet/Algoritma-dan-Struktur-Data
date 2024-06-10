## Jobsheet 14 : Tree
## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## NIM : 2341720126 

## Percobaan 1 : Implementasi Binary Search Tree menggunakan Linked List

### Membuat Class Node
```java
package Tugas14;

public class Node16 {
    int data;
    Node16 left;
    Node16 right;

    public Node16(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
```
### Membuat Class BinaryTree
```java
package Tugas14;

public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node16(data);
        } else {
            Node16 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {  
                        current.left = new Node16(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                        if (current.right == null ) { 
                            current.right = new Node16(data);
                            break;
                        } else {
                            current = current.right;
                        }
                } else {
                    break;      
                        
                    }
                }
            }
        }

    public boolean find(int data) {
        Node16 current = root;
        while (current != null) {
         if (current.data == data) {
            return true;
        } else if (data < current.data) {
            current = current.left;
        } else {
            current = current.right;
        }
    }   
    return false;
    }

    void traversePreOrder(Node16 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    void traverseInOrder(Node16 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.printf(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    Node16 getSuccessor(Node16 del) {
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
       
        else {
            Node16 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
        }
```      
### Membuat Class BinaryTreeMain
```java
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
    }
}
```
## Verfikasi Hasil Percobaan
```java
PreOrder Traversal : 6 4 3 5 8 7 9 10 15 
InOrder Traversal : 3 4 5 6 7 8 9 10 15
PostOrder Traversal : 3 5 4 7 15 10 9 8 6
Find Node : true
Delete Node 8

PreOrder Traversal : 6 4 3 5 9 7 10 15
PS D:\GitHub\Algoritma-dan-Struktur-Data>
``` 
## Pertanyaan 1
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding 
binary tree biasa? 
2. Untuk apakah di class Node, kegunaan dari atribut left dan right? 
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? 
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? 
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? 
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut? 
```java
if(data<current.data){ 
if(current.left!=null){ 
current = current.left; 
}else{ 
current.left = new Node(data); 
break; 
} 
}
```

## Percobaan 2 : Implementasi binary tree dengan array

### Membuat Class BinaryTreeArray
```java
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
}
```
### Membuat Class BinaryTreeArrayMain
```java
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
```
## Verifikasi Hasil Percobaan
```java
Inorder Traversal : 
3 4 5 6 7 8 9 

PS D:\GitHub\Algoritma-dan-Struktur-Data> 
```
## Pertanyaan 2
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? 
2. Apakah kegunaan dari method populateData()? 
3. Apakah kegunaan dari method traverseInOrder()? 
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing? 
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

## Tugas Praktikum 
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara 
rekursif. 
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang 
paling besar yang ada di dalam tree. 
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf. 
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada 
di dalam tree. 
5. Modifikasi class BinaryTreeArray, dan tambahkan :  
• method add(int data) untuk memasukan data ke dalam tree  
• method traversePreOrder() dan traversePostOrder() 

### Menambahkan method dari soal nomor 1, 2, 3 dan 4 ke Class BinaryTree16
```java
   // 1. Method untuk menambahkan node secara rekursif
     public void addRecursive(int data) {
        root = addRecursiveHelper(root, data);
    }
 
    private Node16 addRecursiveHelper(Node16 current, int data) {
        if (current == null) {
            return new Node16(data);
        }

        if (data < current.data) {
            current.left = addRecursiveHelper(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursiveHelper(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    // 2. Method untuk menampilka nilai paling kecil dan paling besar
    public int findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        Node16 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        Node16 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // 3. Method untuk menampilkan data yang ada di leaf
    public void printLeafNode() {
        printLeafNodeHelper(root);
    }

    private void printLeafNodeHelper(Node16 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodeHelper(node.left);
            printLeafNodeHelper(node.right);
        }
    }

    // 4. Method untk menampilkan jumlah leaf yang ada di dalam tree
    public int countLeafNodes() {
        return countLeafNodesHelper(root);
    }

    private int countLeafNodesHelper(Node16 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeafNodesHelper(node.left) + countLeafNodesHelper(node.right);
        }
    }
```
### Menambahkan method dari soal nomor 1, 2, 3 dan 4 ke Class BinaryTreeMain16
```java
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
```

### Menambahkan method dari soal nomor 5 ke Class BinaryTreeArray16
```java
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
```

###  Menambahkan method dari soal nomor 5 ke Class BinaryTreeArrayMain16
```java
 // Tambahkan data baru
    System.out.println("Menambahkan data 2 ke dalam tree.");
    bta.add(2);
    System.out.println("Inorder Traversal setelah penambahan: ");
    bta.traverseInOrder(0);
    System.out.println("\n");

    // Traverse Pre-Order
    System.out.println("Preorder Traversal: ");
    bta.traversePreOrder(0);
    System.out.println("\n");

    // Traverse Post-Order
    System.out.println("PostOrder Traversal : ");
    bta.traversePostOrder(0);
    System.out.println("\n");
```

### Ouput BinaryTreeMain16 dan BinaryTreeArrayMain16
```java
// BinaryTreeMain16
PreOrder Traversal : 6 4 3 5 8 7 9 10 15 
InOrder Traversal : 3 4 5 6 7 8 9 10 15
PostOrder Traversal : 3 5 4 7 15 10 9 8 6
Find Node : true
Delete Node 8

PreOrder Traversal : 6 4 3 5 9 7 10 15
Menambahkan node 2 menggunakan rekursif
InOrder Traversal after adding 2: 2 3 4 5 6 7 9 10 15
Nilai paling kecil di tree: 2
Nilai paling besar di tree: 15
Leaf nodes: 2 5 7 15
Jumlah leaf nodes: 4
PS D:\GitHub\Algoritma-dan-Struktur-Data>

// BinaryTreeArrayMain16
Inorder Traversal : 
3 4 5 6 7 8 9 

Menambahkan data 2 ke dalam tree.
Inorder Traversal setelah penambahan:
2 3 4 5 6 7 8 9

Preorder Traversal:
6 4 3 2 5 8 7 9

PostOrder Traversal :
2 3 5 4 7 9 8 6

PS D:\GitHub\Algoritma-dan-Struktur-Data>
```