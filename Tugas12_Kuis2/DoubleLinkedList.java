package Tugas12_Kuis2;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addTeam(Team team) { // Menambahkan Tim
        Node newNode = new Node(team);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            while (current != null && current.team.getPoints() >= team.getPoints()) {
                current = current.next;
            }
            if (current == null) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else if (current == head) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void removeTeam(String name) {
        Node current = head;
        while (current != null) {
            if (current.team.getName().equals(name)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void updateTeamPoints(String name, String result) { // Untuk mengupdate nilai / poin setiap tim
        Node current = head;
        while (current != null) {
            if (current.team.getName().equals(name)) {
                switch (result.toLowerCase()) {
                    case "win":
                        current.team.addWin();  // Jika timnya win, maka poin bertambah 3
                        break;
                    case "draw":
                        current.team.addDraw(); // Jika timnya seri, maka poin bertambah 1
                        break;
                    case "loss":
                        current.team.addLoss(); // Jika timnya kalah, tidak mendapatkan poin
                        break;
                }
                // Hapus dan tambah kembali untuk mengatur ulang posisi
                removeTeam(name);
                addTeam(current.team);
                break;
            }
            current = current.next;
        }
    }

    public void printStandings() { // Menampilkan posisi klasemen semua tim
        Node current = head;
        int rank = 1; // urutan peringkat akan dimulai dari 1 sampai jumlah tim yang ikut pertandingan 
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|                       PROLIGA VOLI INDONESIA                                  |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| Posisi | Nama Tim                            | Menang | Seri | Kalah | Poin |");
        System.out.println("---------------------------------------------------------------------------------");
        while (current != null) {
            System.out.printf("| %-6d | %-35s | %-5d | %-6d | %-4d | %-5d | %n",    
            rank, current.team.getName(), current.team.getWins(), current.team.getDraws(), current.team.getLooses(),
            current.team.getPoints());
            current = current.next;
            rank++;
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
}
