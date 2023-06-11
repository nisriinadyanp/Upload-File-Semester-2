package PraktikumAbstract;

public class Car extends Vehicle {
  Owner owner;

  Car(Owner o, String name, int year, double rpm) {
    super(name, year, rpm);
    this.owner = o;
  }

  public void keterangan() {
    System.out.println("Car name\t: " + super.getNama());
    System.out.println("Car owner\t: " + this.owner.getName());
    System.out.println("Output year\t: " + super.getTahun());
    System.out.println("RPM\t\t: " + super.getRpm());
  }
}
