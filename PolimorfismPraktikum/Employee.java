package PolimorfismPraktikum;

import java.time.LocalDate;

public abstract class Employee {
    private String name; 
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee () {

    }

    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    
    public Employee(String name, String noKTP, LocalDate tgllhr){
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tgllhr;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNoKTP(){
        return noKTP;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String toString(){
        return String.format(" "+ getName() + "\nNo. KTP : " + getNoKTP());
    }
    
    public abstract double earnings();//pendapatan
    
}
