package Tugas13.Praktikum2;

public class Film {
        int id;
        String judul;
        double rating;
        Film next;
        Film prev;
    
        public Film(int id, String judul, double rating) {
            this.id = id;
            this.judul = judul;
            this.rating = rating;
        }

        public String toString() {
            return "ID: " + id + "\nJudul: " + judul + "\nIMDB: " + rating + "\n";
        }
    }

