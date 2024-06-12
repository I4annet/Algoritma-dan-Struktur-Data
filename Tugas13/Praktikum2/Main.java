package Tugas13.Praktikum2;

public class Main {
        public static void main(String[] args) {
            FilmList filmList = new FilmList();
            
            // Adding films
            filmList.addFilm(18227, "Spider-Man: No Way Home", 8.6);
            filmList.addFilm(1564, "Skyfall", 7.8);
            filmList.addFilm(1578, "The Dark Knight Rises", 8.4);
            filmList.addFilm(1920, "Death on the Nile", 6.7);
            filmList.addFilm(1586, "Uncharted", 6.7);
            
            System.out.println("Data Film Layar Lebar:");
            filmList.printFilms();
            
            System.out.println("\nPencarian Data:");
            Film searchedFilm = filmList.searchFilmById(1578);
            if (searchedFilm != null) {
                System.out.println("Data Film yang dicari:");
                System.out.println(searchedFilm);
            } else {
                System.out.println("Film tidak ditemukan.");
            }
    
            System.out.println("Pengurutan Film Berdasarkan Rating Descending:");
            filmList.sortFilmsByRatingDesc();
            filmList.printFilms();
        }
    }

