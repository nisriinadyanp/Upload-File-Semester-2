package PolimorfismPraktikum;

import java.time.LocalDate;

public class GajiBerdasarBykBrgDiproduksi extends Employee {
    private int barangDiproduksiPerMinggu;
    private int upahPerBarang;

    public GajiBerdasarBykBrgDiproduksi() {

    }

    public GajiBerdasarBykBrgDiproduksi(String name, String noKTP, LocalDate tanggallahir, int barangDiproduksiPerMinggu, int upahPerBarang) {
        super(name, noKTP, tanggallahir);
        this.barangDiproduksiPerMinggu = barangDiproduksiPerMinggu;
        this.upahPerBarang = upahPerBarang;
    }

    public void setBarangDiproduksiPerMinggu(int barangDiproduksiPerMinggu) {
        this.barangDiproduksiPerMinggu = barangDiproduksiPerMinggu;
    }

    public void setUpahPerBarang(int upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public int getBarangDiproduksiPerMinggu() {
        return barangDiproduksiPerMinggu;
    }

    public int getUpahPerBarang() {
        return upahPerBarang;
    }

    public String toString(){
        return "Penggajian Berdasarkan Banyak Barang Diproduksi\nNama : " + super.toString() +"\nBarang yang diproduksi per minggu : " + getBarangDiproduksiPerMinggu() + "\nUpah per barang : " + getUpahPerBarang();
    }

    public double earnings() {
        return barangDiproduksiPerMinggu * 4 * upahPerBarang;
    }
}
