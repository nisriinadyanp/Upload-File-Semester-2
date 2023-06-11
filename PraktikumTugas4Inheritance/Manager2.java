public class Manager2 extends Pekerja{
    private String departemen;
    
    public Manager2() {

    }
    
    public Manager2(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public String getdepartemen() {
        return departemen;
    }
    
    public String toString() {
        return super.toString() + "departemen : " + departemen;
    }
    
}

