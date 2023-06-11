package PolimorfismPraktikum;

import java.time.LocalDate;

public class MainUjiNoLima {
    public static void main(String[] args) {
        //Uang dalam rupiah
        GajiBerdasarBykBrgDiproduksi employee1 = new GajiBerdasarBykBrgDiproduksi("Kansha", "78910", LocalDate.of(2005, 2, 11), 100, 30000);
        GajiBerdasarBykBrgDiproduksi employee2 = new GajiBerdasarBykBrgDiproduksi("Safira", "54309", LocalDate.of(2004, 9, 2), 200, 20000);
        GajiBerdasarBykBrgDiproduksi employee3 = new GajiBerdasarBykBrgDiproduksi("Pupuj", "43098", LocalDate.of(2003, 5, 4), 300, 20000);
        GajiBerdasarBykBrgDiproduksi employee4 = new GajiBerdasarBykBrgDiproduksi("Maysa", "67543", LocalDate.of(2004, 6, 22), 250, 25000);
        GajiBerdasarBykBrgDiproduksi employee5 = new GajiBerdasarBykBrgDiproduksi("Nisriina", "43152", LocalDate.of(2005, 5, 11), 350, 20000);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;  
        employees[3] = employee4;
        employees[4] = employee5;

        for(Employee currentEmployee : employees) {
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
