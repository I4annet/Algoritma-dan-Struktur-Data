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

    

}
        
