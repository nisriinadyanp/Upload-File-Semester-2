package PolimorfismPraktikum;

import java.time.LocalDate;


public class SalariedEmployee extends Employee{
    private double monthlySalary; //gaji/minggu
    
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setMonthlySalary(salary);
    }

    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double salary) {
        super(name, noKTP, tanggalLahir);
        setMonthlySalary(salary);
    }
    
    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    public double earnings() {
        return getMonthlySalary();
    }
    
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nMonthly salary: " + (int)getMonthlySalary());
    }
    
}
