package PraktikumAbstract;

public abstract class Vehicle {

  private String nama;
  private int tahun;
  private double rpm;

  public Vehicle(String nama, int tahun, double rpm) {
    this.nama = nama;
    this.tahun = tahun;
    this.rpm = rpm;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public void setTahun(int tahun) {
      this.tahun = tahun;
  }

  public void setRpm(double rpm) {
      this.rpm = rpm;
  }

  public String getNama() {
      return nama;
  }

  public int getTahun() {
      return tahun;
  }

  public double getRpm() {
      return rpm;
  }

  public abstract void keterangan();
}
