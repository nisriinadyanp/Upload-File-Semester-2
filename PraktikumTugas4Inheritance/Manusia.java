public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private double tunjangan = 0;
    private double pendapatan = 0;
    private double total = 0;

    public Manusia() {

    }

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin (boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setnik (String nik) {
        this.nik = nik;
    }

    public void setmenikah (boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public String getnik() {
        return nik;
    }

    public boolean getmenikah() {
        return menikah;
    }
    
    public double getTunjangan(double tambahan) {
        if (menikah == true) {
            if (jenisKelamin == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        total = tunjangan + tambahan;
        return total;
    }

    public double getPendapatan() {
        pendapatan = pendapatan + total;
        return pendapatan;
    }

    public String toString() {
        return 
        "nama          : " + this.nama         +  "\n" +
        "nik           : " + this.nik          +  "\n" +
        "jenisKelamin  : " + (jenisKelamin == true ? "Laki-laki" : "Perempuan") + "\n" +
        "pendapatan    : " + getPendapatan() + "\n";
        
        
    }
}
