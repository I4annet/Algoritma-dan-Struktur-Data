public class MethodUTS {
    
    void InsertionSortDescending(int[] listNilai) {
        int n = listNilai.length;
        for (int i = 0; i < n; i++) {
            int key = listNilai[i];
            int j = i;

            while (j > 0 && listNilai[j-1] < key) {
                listNilai[j] = listNilai[j-1];
                j--;
            }
            listNilai[j] = key;
            }
        }
    
    
    void InsertionSortAscending(int[] listNilai) {
        int n = listNilai.length;
        for (int i = 1; i < n; ++i) {
            int key = listNilai[i];
            int j = i - 1;

            while (j >= 0 && listNilai[j] > key) {
                listNilai[j + 1] = listNilai[j];
                j = j -1;
            }
            listNilai[j + 1] = key;
            }
    }

    void tambah(int[] listNilai) {
        for(int nilai: listNilai) {
            
        }
    }
    
    void tampilArray(int[] array) {
        for (int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    int binarySearch(int[] listNilai, int nilaiCari) {
       int kiri = 0;
       int kanan = listNilai.length - 1;

       while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri)/2;

            if (listNilai[tengah] == nilaiCari) {
                 return tengah; 
            }
            if (listNilai[tengah] < nilaiCari) {
                kanan = tengah - 1;
                // kiri = tengah + 1;
            } else {
                // kanan = tengah - 1;
                kiri = tengah + 1;
            }
       }

       return -1;
    }

    

}
