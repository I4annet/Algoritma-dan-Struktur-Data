/**
 * hotel
 */
public class hotel {
        private String nama;
        private String kota;
        private int harga;
        private byte bintang;
    
        public hotel(String n, String k, int h, byte b) {
            nama = n;
            kota = k;
            harga = h;
            bintang = b;
        }
    
        public int getHarga() {
            return harga;
        }
    
        public byte getBintang() {
            return bintang;
        }
        public byte getRatingBintang() {
            return bintang;
        }
        @Override
        public String toString() {
            return "Hotel: " + nama + ", Kota: " + kota + ", Harga: " + harga + ", Bintang: " + bintang;
        }
    }