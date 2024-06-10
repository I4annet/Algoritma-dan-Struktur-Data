package Tugas15;

public class GraphMatriks16 {
    int vertex;
    int[][] matriks;

    public GraphMatriks16(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = 0;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m),");
            }
            System.out.println();
        }
    }

    public int outDegree(int node) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int inDegree(int node) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            int inDeg = inDegree(i);
            int outDeg = outDegree(i);
            System.out.println("Gedung " + (char) ('A' + i) + " - In-degree: " + inDeg + ", Out-degree: " + outDeg);
        }
    }

   
}