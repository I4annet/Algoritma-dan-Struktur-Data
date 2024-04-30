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

        System.out.println("Highest Top Acceleration: " + maxTopAcceleration(cars, 0, cars.length-1));
        System.out.println("Lowest Top Acceleration: " + minTopAcceleration(cars, 0, cars.length-1));
        
        double totalTopPower = 0;

        for(int i=0; i < cars.length; i++) {
            totalTopPower += cars[i].topPower;
        }

        double avgTopPower = totalTopPower / cars.length;

        System.out.println("Average Top Power: " + avgTopPower);
    }

    static int maxTopAcceleration(Car[] carArray, int low, int high) {
        if (low == high) {
            return carArray[low].topAcceleration;
        }
        int mid = (low + high) / 2;

        return Math.max(carArray[mid].topAcceleration,
                        Math.max(maxTopAcceleration(carArray, low, mid),
                                 maxTopAcceleration(carArray, mid + 1, high)));
    }

    static int minTopAcceleration(Car[] carArray, int low, int high) {
        if (low == high) {
            return carArray[low].topAcceleration;
        }
        int mid = (low + high) / 2;

        return Math.min(carArray[mid].topAcceleration,
                        Math.min(minTopAcceleration(carArray, low, mid),
                                 minTopAcceleration(carArray, mid + 1, high)));
    }
}
