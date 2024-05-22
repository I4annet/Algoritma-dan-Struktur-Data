# KUIS 2
## Nama : Ivansyah Eka Oktaviadi Santoso
## Kelas : 1B
## NIM : 2341720126
## Prodi : D-IV Teknik Informatika


## Class : Team
```java
package Tugas12_Kuis2;

public class Team {
    private String name;
    private int points;
    private int wins;
    private int draws;
    private int losses;

    public Team(String name) {
        this.name = name;
        this.points = 0; //  poin setiap tim adalah 0
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLooses() {
        return losses;
    }

    public void addWin() {
        this.points += 3; // menang mendapat 3 poin
        this.wins += 1; // jumlah menang bertambah
    }

    public void addDraw() {
        this.points += 1; // Seri mendapat 1 poin
        this.draws += 1; // jumlah seri bertambah
    }

    public void addLoss() {
        // Kalah tidak menambah poin
        this.losses += 1; // jumlah kalah bertambah
    }
}
```

## Class : Node
```java
package Tugas12_Kuis2;

public class Node {
    Team team;
    Node prev;
    Node next;

    public Node(Team team) {
        this.team = team;
        this.prev = null;
        this.next = null;
    }
}
```


## Class : DoubleLinkedList
```java
package Tugas12_Kuis2;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addTeam(Team team) {
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

    public void updateTeamPoints(String name, String result) {
        Node current = head;
        while (current != null) {
            if (current.team.getName().equals(name)) {
                switch (result.toLowerCase()) {
                    case "win":
                        current.team.addWin();
                        break;
                    case "draw":
                        current.team.addDraw();
                        break;
                    case "loss":
                        current.team.addLoss();
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

    public void printStandings() {
        Node current = head;
        int rank = 1;
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
```

## Class : Main
```java
package Tugas12_Kuis2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList standings = new DoubleLinkedList();

        // Menambahkan tim ke dalam klasemen
        standings.addTeam(new Team("Jakarta STIN BIN"));
        standings.addTeam(new Team("Jakarta Bhayangkara Presisi"));
        standings.addTeam(new Team("Jakarta Pertamina Pertamax"));
        standings.addTeam(new Team("Jakarta Garuda Jaya"));
        standings.addTeam(new Team("Kudus Sukun Badak"));
        standings.addTeam(new Team("Jakarta LavAni Allo Bank Electric"));
        standings.addTeam(new Team("Palembang Bank Sumsel Babel"));

        Scanner scanner = new Scanner(System.in);
        String teamName, result;
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan hasil pertandingan");
            System.out.println("2. Tampilkan klasemen");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama tim: ");
                    teamName = scanner.nextLine();
                    System.out.print("Masukkan hasil (win/draw/loss): ");
                    result = scanner.nextLine();
                    standings.updateTeamPoints(teamName, result);
                    break;
                case 2:
                    standings.printStandings();
                    break;
                case 3:
                    System.out.println("Program dihentikan.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
```