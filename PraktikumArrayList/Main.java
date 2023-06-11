package PraktikumArrayList;

public class Main {
    public static void main(String[] args) {
  
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

        // Lakukan modifikasi data tambah mahasiswa ...
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Nisriina Dyan", "Sistem Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Qhistina Dyah", "Teknik Informatika", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Didik Hariyanto", "Teknik Komputer", true));

    
        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();
    
        // Method cariMahasiswa (jika data ada)
        DataMahasiswa.cariMahasiswa("Nisriina Dyan");

        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Qhistina Dyan");
    
        // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswaYangMana(1);
    
        // Method tampilMahasiswa (setelah diupdate)
        DataMahasiswa.updateMahasiswa(1, "Denar Slamet", "Teknologi Informasi", true);
        DataMahasiswa.tampilMahasiswaYangMana(1);
      }
}
