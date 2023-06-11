package PolimorfismPraktikum;

import java.time.LocalDate;

public class MainUjiNoEmpat {
    public static void main(String[] args) {
        //Uang dalam rupiah
        SalariedEmployee salariedEmployee = new SalariedEmployee("Nisriina", "12345", LocalDate.of(2005, 5, 6), 5000000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Dyan", "78910", LocalDate.of(2003, 8, 19), 100000, 350);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Pramesthi", "24681", LocalDate.of(2001, 5, 7), 2500000, 0.05);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Lisa", "13579", LocalDate.of(2002, 10, 6), 10000000, 0.05, 6000000);

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;  
        employees[3] = basePlusCommissionEmployee;

        for (Employee currentEmployee : employees) {
            System.out.println("\n" + currentEmployee);
            int bulansekarang = (LocalDate.now()).getMonthValue();
            int bulanlahir = (currentEmployee.getTanggalLahir()).getMonthValue();
            int bonus = 0;
                if (bulansekarang == bulanlahir) {
                    bonus = 100000;
                }
            System.out.println("Pendapatan : " + (int)(currentEmployee.earnings() + bonus));
        }
    }
}
