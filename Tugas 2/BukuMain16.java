/**
 * BukuMain16
 */
public class BukuMain16 {

    public static void main(String[] args) {
        Buku16 bk1 = new Buku16();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInfromasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilInfromasi();

        Buku16 bk2 = new Buku16("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInfromasi();

        Buku16 bukuMahasiswa = new Buku16("judulMahasiswa", "pengarangMahasiswa", 150, 10, 50000);
        bukuMahasiswa.tampilInfromasi();
        bukuMahasiswa.terjual(3);
        bukuMahasiswa.gantiharga(48000);
        bukuMahasiswa.tampilInfromasi();
    }
}