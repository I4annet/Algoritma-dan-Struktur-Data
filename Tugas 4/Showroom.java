/**
 * Showroom
 */
public class Showroom {

    static class Car {
        String merk;
        String tipe;
        int tahun;
        int topAcceleration;
        int topPower;

        public Car(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
            this.merk = merk;
            this.tipe = tipe;
            this.tahun = tahun;
            this.topAcceleration = topAcceleration;
            this.topPower = topPower;
        }
    }
    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new Car("BMW", "M2 Coupe", 2016, 6816, 728),
            new Car("Ford", "Fiesta ST", 2014, 3921, 575),
            new Car("Nissan", "370Z", 2009, 4360, 657),
            new Car("Subaru", "BRZ", 2014, 4058, 609),
            new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Car("Toyota", "AE86", 1986, 3700, 553),
            new Car("Toyota", "86/GT86", 2014, 4180, 609),
            new Car("Volkswagen", "Golf GTI", 2014, 4180, 631),
        };
    }
}