/**
 * mainhotel
 */
public class mainhotel {

    public static void main(String[] args) {
        hotel hotel1 = new hotel("Hotel A", "City A", 100000, (byte) 4);
        hotel hotel2 = new hotel("Hotel B", "City B", 200000, (byte) 5);
        hotel hotel3 = new hotel("Hotel C", "City C", 300000, (byte) 3);
        hotel hotel4 = new hotel("Hotel D", "City D", 150000, (byte) 2);
        hotel hotel5 = new hotel("Hotel E", "City E", 250000, (byte) 1);

        hotel[] hotels = { hotel1, hotel2, hotel3, hotel4, hotel5 };

        System.out.println("**Sebelum Sorting**");
        for (hotel hotel : hotels) {
            System.out.println(hotel);
        }

        // Sorting by Price (Ascending) - Bubble Sort
        System.out.println("\n**Sorting by Harga (Bubble Sort - Ascending)**");
        hotelservice.bubbleSortHargaAsc(hotels);
        for (hotel hotel : hotels) {
            System.out.println(hotel);
        }
        System.out.println("\n**Sorting by Harga (Selection Sort - Ascending)**");
        hotelservice.selectionSortHargaAsc(hotels);
        for (hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}
