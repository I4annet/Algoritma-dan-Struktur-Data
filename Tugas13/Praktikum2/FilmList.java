package Tugas13.Praktikum2;

public class FilmList {
        private Film head;
        private Film tail;
    
        public void addFilm(int id, String judul, double rating) {
            Film newFilm = new Film(id, judul, rating);
            if (head == null) {
                head = tail = newFilm;
            } else {
                tail.next = newFilm;
                newFilm.prev = tail;
                tail = newFilm;
            }
        }
    
        public void removeFilm(int id) {
            Film current = head;
            while (current != null) {
                if (current.id == id) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        }
    
        public Film searchFilmById(int id) {
            Film current = head;
            while (current != null) {
                if (current.id == id) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }
    
        public void sortFilmsByRatingDesc() {
            if (head == null || head.next == null) {
                return;
            }
            for (Film i = head; i != null; i = i.next) {
                for (Film j = i.next; j != null; j = j.next) {
                    if (i.rating < j.rating) {
                        int tempId = i.id;
                        String tempJudul = i.judul;
                        double tempRating = i.rating;
    
                        i.id = j.id;
                        i.judul = j.judul;
                        i.rating = j.rating;
    
                        j.id = tempId;
                        j.judul = tempJudul;
                        j.rating = tempRating;
                    }
                }
            }
        }
    
        public void printFilms() {
            Film current = head;
            while (current != null) {
                System.out.println(current);
                current = current.next;
            }
        }
    }

