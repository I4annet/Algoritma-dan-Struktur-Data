package MergerSortTest;

/**
 * MergerSortMain16
 */
public class MergerSortMain16 {

    public static void main(String[] args) {
        
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("sorting dengan merge sort");
        MergeSorting16 mSort = new MergeSorting16();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.sort(data, 0, data.length -1);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}