package PraktikumArrayList;

import java.util.ArrayList;

public class DataMahasiswa {
    private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static Mahasiswa mahasiswa1 = new Mahasiswa();
    
    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mhsw){
        mhs.add(mhsw);
        return mhs;
    }
    
    public static void tampilSemuaData(){
        for (int t = 0; t < mhs.size(); t++) {
            System.out.println("\n");
            System.out.println("=====  Tampilan Data Mahasiswa " + (t+1) + " Filkom UB ====");
            System.out.println("Nama Mahasiswa   : " + mhs.get(t).getNama());
            System.out.println("Jurusan          : " + mhs.get(t).getJurusan());
            System.out.println("Status           : " + (mhs.get(t).getStatus() == true ? "Menikah" : "Lajang" ));
        }
    }
    
    public static Mahasiswa cariMahasiswa (String nm){
        boolean ada = false;
        Mahasiswa mhsswa = null;
        for (int i = 0; i < mhs.size(); i++) {
            if ((mhs.get(i).getNama()).equals(nm)) {
                System.out.println("\n Data mahasiswa atas nama " + nm + " ditemukan");
                mhsswa = mhs.get(i);
                ada = true;
            }
        }

        if (ada == false) {
            System.out.println("\n Data mahasiswa atas nama " + nm + " tidak ditemukan");
        }

        return mhsswa;
    }

    public static void tampilMahasiswaYangMana(int mhsbrp) {
        tampilMahasiswa(mhs.get(mhsbrp-1));
    }
    
    public static void tampilMahasiswa(Mahasiswa mahasiswa){
        System.out.println("\n");
        System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
        System.out.println("Jurusan         : " + mahasiswa.getJurusan());
        System.out.println("Status          : " + (mahasiswa.getStatus() == true ? "Menikah" : "Lajang")); 

    }

    //Penjelasan Paramater
    //1. int mhsbrp     : menunjukkan mahasiswa mana yang datanya akan diupdate
    //2. String nama    : memasukkan nama baru
    //3. String jurusan : memasukkan jurusan baru
    //4. boolean status : memasukkan status baru
    public static void updateMahasiswa(int mhsbrp, String nama, String jurusan, boolean status){
        mhs.get(mhsbrp-1).setNama(nama);
        mhs.get(mhsbrp-1).setJurusan(jurusan);
        mhs.get(mhsbrp-1).setStatus(status);
    }
}

