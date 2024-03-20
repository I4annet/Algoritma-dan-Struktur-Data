/**
 * hotelservice
 */
public class hotelservice {

    public static void bubbleSortHargaAsc(hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            for (int j = 0; j < hotels.length - i - 1; j++) {
                if (hotels[j].getHarga() > hotels[j + 1].getHarga()) {
                    hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortRatingDesc(hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            for (int j = 0; j < hotels.length - i - 1; j++) {
                if (hotels[j].getRatingBintang() < hotels[j + 1].getRatingBintang()) {
                    hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortHargaAsc(hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].getHarga() < hotels[minIndex].getHarga()) {
                    minIndex = j;
                }
            }
            hotel temp = hotels[minIndex];
            hotels[minIndex] = hotels[i];
            hotels[i] = temp;
        }
    }

    public static void selectionSortRatingDesc(hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].getRatingBintang() > hotels[maxIndex].getRatingBintang()) {
                    maxIndex = j;
                }
            }
            hotel temp = hotels[maxIndex];
            hotels[maxIndex] = hotels[i];
            hotels[i] = temp;
        }
    }
}