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
