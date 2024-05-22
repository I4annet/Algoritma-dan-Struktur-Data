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
