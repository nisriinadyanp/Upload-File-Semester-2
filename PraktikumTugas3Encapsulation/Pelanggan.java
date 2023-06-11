import java.util.Scanner;

public class Pelanggan {
    private int saldo;
    private int pin;
    private String nomorpelanggan;
    private String nama;
    
    Scanner input = new Scanner(System.in);
    
    public Pelanggan() {

    }
    
    public Pelanggan (String n, String np, int pn, int s) {
        saldo = s;
        nomorpelanggan = np;
        nama = n;
        pin = pn;
    }

    public void pembelian (int totalbelanja) {
        saldo = saldo - totalbelanja;
        int cashback = 0;
        if ((nomorpelanggan.substring(0, 2)).equals("38")) {
            if (totalbelanja > 1000000) {
                cashback = ((totalbelanja * 5)/100);
                saldo = saldo + cashback;
            }
        } else if ((nomorpelanggan.substring(0, 2)).equals("56")) {
            if (totalbelanja > 1000000) {
                cashback = ((totalbelanja * 7)/100);
                saldo = saldo + cashback;
            } else {
                cashback = ((totalbelanja * 2)/100);
                saldo = saldo + cashback;
            }
        } else if ((nomorpelanggan.substring(0, 2)).equals("74")) {
            if (totalbelanja > 1000000) {
                cashback = ((totalbelanja *10)/100);
                saldo = saldo + cashback;
            } else {
                cashback = ((totalbelanja * 5)/100);
                saldo = saldo + cashback;
            }
        }
        
        if (saldo < 10000) {
            System.out.println("Pembelian gagal");
            saldo = saldo + totalbelanja - cashback;
        } else {
            System.out.println("Pembelian berhasil");
        }
        
        if (saldo > 0) {
            System.out.println("Jumlah Saldo : Rp" + saldo);
        } else {
            System.out.println("Jumlah Saldo : Rp0");
        }
    }
    
    public void topup(int topup) {
        saldo = saldo + topup;
        System.out.println("Top Up berhasil! Jumlah saldo saat ini : Rp" + saldo);
    }
    
    public boolean autentifikasi() {
        boolean coba = false;
        int jmlhpercobaan = 0;
        while (!coba) {
            System.out.println("Masukkan nomor pelanggan dan pin");
            String np = input.next();
            int pn = input.nextInt();
            if ((nomorpelanggan.equals(np)) && (pin == pn)) {
                System.out.println("Autentifikasi berhasil");
                break;
            } else {
                jmlhpercobaan++;
            }
            
            if (jmlhpercobaan == 3) {
                System.out.println("Akun diblokir, tidak bisa digunakan lagi ");
                coba = true;
                break;
            }
        }
        return coba;
    }

    public String getNama() {
        return nama;
    }

}

