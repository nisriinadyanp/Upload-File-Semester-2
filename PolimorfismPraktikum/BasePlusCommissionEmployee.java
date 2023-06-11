package PolimorfismPraktikum;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;//gaji pokok tiap bulan
    
    public BasePlusCommissionEmployee(String name, String noKTP,  double sales, double rate, double salary) {
        super(name, noKTP, sales, rate);
        setBaseSalary(salary);
    }

    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate, double salary) {
        super(name, noKTP, tanggalLahir, sales, rate);
        setBaseSalary(salary);
    }
    
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    
    public String toString() {
        return String.format("Base-Salaried : " + super.toString() + "\nbase salary : " + (int)getBaseSalary());
    }

}
