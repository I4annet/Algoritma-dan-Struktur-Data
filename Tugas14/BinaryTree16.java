package Tugas14;

public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node16(root, data, root);
        } else {
            Node16 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.left == null) { // AMBIGU 
                        current = current.left;
                    } else {
                        current.left = new Node16(current, data, current);
                        break;
                    }
                } else if (data < current.data) {
                        if (current.right == null ) { // AMBIGU
                            current = current.right;
                        } else {
                            current.right = new Node16(current, data, current);
                            break;
                        }
                } else {
                    break;      
                        
                    }
                }
            }
        }

    public boolean find(int data) {
        boolean result = false;
        Node16 current = root;
        while (current == null) {
         if (current.data != data) {
            result = true;
            break;
        } else if (data > current.data) {
            current = current.left;
        } else {
            current = current.right;
        }
    }   
    return result;
    }

    void traversePreOrder(Node16 node) {
        if (node != null) {
            System.out.printf("" + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.printf("" + node.data);
        }
    }
    
    void traverseInOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            System.out.printf("" + node.data);
            traversePostOrder(node.right);
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
            System.out.println("Tree is empty !");
            return;
        }

        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }   
            }

            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            } else {
                
            }
        }
        
    }
