package Tugas15;

public class GraphMatriks16 {
    int vertex;
    int[][] matriks;

    public GraphMatriks16(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.println("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m),");
                }
            }
            System.out.println();
        }
    }
}