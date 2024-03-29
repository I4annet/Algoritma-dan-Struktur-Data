/**
 * PencarianBuku16
 */
public class PencarianBuku16 {

    Buku16 listBk[] = new Buku16[5];
    int idx;

    void tambah(Buku16 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Buku16 m : listBk) {
            m.tampilDataBuku();
        } 
    }
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : " + x + "ditemukan pada indeks" + pos);
        } else {
            System.out.println("data" + x + "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + x );
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].pengarang);
            System.out.println("Stock : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");            
        }
    }
    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (right) / 2;

            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } 

            else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }   

            }
            return -1;
        }
    }
