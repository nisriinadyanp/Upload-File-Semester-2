public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM () {

    }

    public MahasiswaFILKOM (String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getnim() {
        return nim;
    }

    public double getipk() {
        return ipk;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setipk(double ipk) {
        this.ipk = ipk;
    }


    public String getStatus() {
        String prodi = " ";

        switch ((nim.substring(6,7))) {
            case "2" : 
                prodi = "Teknik Informatika";
                break;
            case "3" :
                prodi = "Teknik Komputer";
                break;
            case "4" :
                prodi = "Sistem Informasi";
                break;
            case "6" :
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7" :
                prodi = "Teknologi Informasi";
                break;
        }

        return prodi + " 20" + nim.substring(0, 2);
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (ipk <= 4 && ipk >= 3.5) {
            beasiswa = 75;
        } else if (ipk < 3.5 && ipk >= 3.0) {
            beasiswa = 50;
        }
        super.getTunjangan(beasiswa);
        return beasiswa;
    }

    @Override
    public String toString() {
        getBeasiswa();
        //xxxxxxxxxxxxxxx:
        return super.toString() + 
        "nim           : " + nim + "\n" +
        "ipk           : " + ipk + "\n" +
        "status        : " + getStatus() + "\n" ;
    }
}
