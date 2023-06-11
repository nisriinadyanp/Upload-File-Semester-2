import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    private double tambahan = 0;
    
    public Pekerja() {
        
    }

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        tambahan = tambahan + (jumlahAnak * 20) + gaji;
    }

    public double getBonus() {
        double bonus = 0;
        LocalDate hariIni = LocalDate.now();
        int selisih = hariIni.compareTo(tahunMasuk);
        if (selisih < 5) {
            bonus = (5 * gaji) / 100;
        } else if (selisih < 10) {
            bonus = (10 * gaji) / 100;
        } else {
            bonus = (15 * gaji) / 100;
        }
        tambahan = tambahan + bonus;
        return bonus;
    }

    public double getGaji() {
        return gaji;
    }
        
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
        
    public int getJumlahAnak() {
        return jumlahAnak;
    }
        
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
        
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
        
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String toString() {
        getBonus();
        super.getTunjangan(tambahan);
        return super.toString() +
        "tahun masuk : " + tahunMasuk + "\n" +
        "jumlah anak : " + jumlahAnak + "\n" +
        "gaji : " + getGaji() + "\n";
    }

}
