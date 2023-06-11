import java.time.LocalDate;

public class MainTugas {
    public static void main(String[] args) {

        System.out.println("================================================================================================================");

        // 1. Manusia
        // a. Laki-laki telah menikah.
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);
        // b. Perempuan telah menikah.
        Manusia b = new Manusia("B", "122", false, true);
        System.out.println(b);
        // c. Belum menikah.
        Manusia c = new Manusia("C", "123", true, false);
        System.out.println(c);

        System.out.println("================================================================================================================");

        //2. MahasiswaFilkom (sesuai status Anda)
        //a. Ipk < 3
        MahasiswaFILKOM d = new MahasiswaFILKOM("225150400111010", 2.0, "Nisriina Dyan Pramesthi", "64740104", false, false);
        System.out.println(d);
        // b. Ipk 3 – 3.5
        MahasiswaFILKOM e = new MahasiswaFILKOM("225150400111010", 3.3, "Nisriina Dyan Pramesthi", "64740104", false, false);
        System.out.println(e);
        // c. Ipk 3.5 – 4
        MahasiswaFILKOM f = new MahasiswaFILKOM("225150400111010", 3.8, "Nisriina Dyan Pramesthi", "64740104", false, false);
        System.out.println(f);

        System.out.println("================================================================================================================");
        
        // 3. Pekerja
        // a. Lama bekerja 2 tahun, anak 2
        Pekerja g = new Pekerja(1000, 2021, 3, 2, 2, "Rani", "890", false, true);
        System.out.println(g);
        // b. Lama bekerja 9 tahun
        Pekerja h = new Pekerja(2000, 2014, 3, 2, 0, "Toto", "789", true, false);
        System.out.println(h);
        // c. Lama bekerja 20 tahun, anak 10
        Pekerja i = new Pekerja(7000, 2003, 3, 2, 10, "Soleh", "020", true, true);
        System.out.println(i);

        System.out.println("================================================================================================================");
        
        // 4. Manager, lama bekerja 15 tahun dengan gaji $7500
        Manager2 j = new Manager2("HRD", 1000,2008, 1, 2, 0, "Nila", "274", true, true);
        System.out.println(j);
        
    }
    
}
