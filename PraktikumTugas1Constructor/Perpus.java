import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Perpus {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private String sinopsis;
    private int halaman;
    private int harga, royalti, persenroyalti;
    private int penjualan;
    private double sama;
    private String[] penulisbanyak;

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public Perpus () {

    }

    public Perpus (String ktgr, String pnls, String jdl, String bhs, String pnbt, String eds, String snps, int hlmn) {
        kategori = ktgr;
        penulis = pnls;
        judul = jdl;
        bahasa = bhs;
        penerbitan = pnbt;
        edisi = eds;
        sinopsis = snps;
        halaman = hlmn;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    public void setSinopsis(String s) {
        sinopsis = s;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int hitungKata () {
        int jumlahkata = 1;
        for (int i = 0; i<sinopsis.length(); i++) {
            if ((sinopsis.substring(i, (i+1))).equals(" ")) {
                jumlahkata++;
            }
        }
        return jumlahkata;
    }

    public double cekKesamaan (Perpus A) {
        int hitungsama = 0;
        double persentase = 0;
        if (kategori == A.kategori) {
            hitungsama++;
        }
        if (penulis == A.penulis) {
            hitungsama++;
        }
        if (judul == A.judul) {
            hitungsama++;
        }
        if (bahasa == A.bahasa) {
            hitungsama++;
        }
        if (penerbitan == A.penerbitan) {
            hitungsama++;
        }
        if (edisi == A.edisi) {
            hitungsama++;
        }
        if (halaman == A.halaman) {
            hitungsama++;
        }
        if (sinopsis == A.sinopsis) {
            hitungsama++;
        }
        persentase = (hitungsama/8) * 100;
        sama = persentase;
        return persentase;
    }

    public Perpus copy () {
        Perpus kopi = new Perpus();
        kopi.setKategori(this.kategori);
        kopi.setPenulis(this.penulis);
        kopi.setJudul(this.judul);
        kopi.setBahasa(this.bahasa);
        kopi.setPenerbitan(this.penerbitan);
        kopi.setEdisi(this.edisi);
        kopi.setSinopsis(this.sinopsis);
        kopi.setHalaman(this.halaman);
        if (this.penulisbanyak != null) {
            kopi.setPenulisbanyak(Arrays.copyOf(this.penulisbanyak, this.penulisbanyak.length));
        }
        return kopi;
    }

    public void bacaFile(String pathFile) {
        try {
            BufferedReader reader = new BufferedReader (new FileReader(pathFile));
            String kalimat = reader.readLine();
            String[] potong = kalimat.split("; ");
            this.setJudul(potong[0]);
            this.setPenulis(potong[1]);
            System.out.println("Isi txt : " + kalimat);
        } catch (IOException data) {
            System.out.println("File not found" + data.getMessage());
        }
    }

    public void simpanFile (String namaFile) {
        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter(namaFile)); 
            writer.write(judul + "; " + penulis);
            System.out.println("File berhasil tersimpan");
            writer.close();
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
        
    }

    public int hitungRoyalti(int harga) {
        this.harga = harga;
        royalti = (penjualan * harga * 10);
        return royalti;
    }

    public int hitungRoyalti(int harga, int persen) {
        this.harga = harga;
        this.persenroyalti = persen;
        royalti = (penjualan * harga * persenroyalti);
        return royalti;
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",
                    ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Jumlah kata sinopsis : " + hitungKata());
    }
}
