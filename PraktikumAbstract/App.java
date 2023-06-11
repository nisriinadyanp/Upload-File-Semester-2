package PraktikumAbstract;

public class App {
  public static void main(String[] args) {
    Car mobil1 = new Car(new Owner("Arsyad"), "Toyota GR Yaris", 2022, 6500);
    mobil1.keterangan();
    System.out.println("");
    Car mobil2 = new Car(new Owner("Ardhan"), "Jeep Wrangler", 1972, 6000);
    mobil2.keterangan();
    System.out.println("");
    Car mobil3 = new Car(new Owner("Budhi"), "Mazda RX 87", 1967, 10500);
    mobil3.keterangan();
    System.out.println("");
    Car mobil4 = new Car(new Owner("Galuh"), "Mercedes Benz 220", 1958, 5500);
    mobil4.keterangan();
  }
}
