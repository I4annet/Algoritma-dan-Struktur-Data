package Tugas15;

public class DoubleLinkedList16 {
    Node16 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    } 
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node16(null, item, jarak, null);
        } else {
            Node16 newNode = new Node16(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void remove(int index) {
        Node16 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
            } else {
                head = current.next;
                
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            break;
        }
        current = current.next;
        size--;
    }
}
     public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node16 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    } 

        public int size() {
            return size;
        }
    
        public void clear() {
            head = null;
            size = 0;
        }
    
        public void removeFirst() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if( size == 1) {
                removeLast();
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
    
        public void removeLast() throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus");
            } else if (head.next == null) {
                    head = null;
                    size--;
                    return;
            } 
            Node16 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
             current.next = null;
             size--;   
            }
            
            public int getLast() throws Exception {
                if (isEmpty()) {
                    throw new Exception("Linked List Kosong");
                }
                Node16 tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                return tmp.data;
            }
    
            public int get(int index) throws Exception {
                if (isEmpty() || index >= size) {
                    throw new Exception("Nilai indeks di luar batas");
                }
                Node16 tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.data;
                
            }
    }
    
