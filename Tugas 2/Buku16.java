public class Buku16 {
    String judul, pengarang;
    int halaman, stok, harga;

    // Method untuk menampilkan informasi buku
    void tampilInfromasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println();
    }

    // Method untuk mengupdate stok setelah penjualan
     void terjual(int jml) {
        if (stok > 0) {
        } else {
            System.out.println("Stok habis, tidak dapat menjual buku.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    // Method untuk mengganti harga buku
     void gantiharga(int hrg) {
        if (hrg > 0) {
            harga = hrg;
            System.out.println("Harga buku diperbarui menjadi " + hrg);
        } else {
            System.out.println("Harga baru harus lebih dari 0.");
        }
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    double hitungDiskon(int totalHarga) {
        double diskon = 0;

        if (totalHarga > 150000) {
            diskon = 0.12;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            diskon = 0.05;
        }

        return diskon;
    }

    double hitungHargaBayar(int jml) {
        int totalHarga = hitungHargaTotal(jml);
        double diskon = hitungDiskon(totalHarga);

        double hargaBayar = totalHarga - (diskon * totalHarga);
        return hargaBayar;
    }

      // Constructor tanpa parameter
      public Buku16() {
    }

    // Constructor dengan parameter
    public Buku16(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }


}