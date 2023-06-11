package PolimorfismPraktikum;

public class MainKue {

    public static void main(String[] args) {
        Kue[] kue = new Kue[20];
        kue[0] = new KuePesanan("Risol Mayo", 2500, 200);
        kue[1] = new KuePesanan("Risol Sayur", 2000, 200);
        kue[2] = new KuePesanan("Lemper Isi Ayam ", 3000, 250);
        kue[3] = new KuePesanan("Lemper Isi Sapi", 3500, 250);
        kue[4] = new KuePesanan("Pastel", 2500, 200);
        kue[5] = new KuePesanan("Barongkok", 5000, 350);
        kue[6] = new KuePesanan("Molen", 500, 180);
        kue[7] = new KuePesanan("Apem", 1500, 350);
        kue[8] = new KuePesanan("Klepon", 4000, 400);
        kue[9] = new KuePesanan("Kue Lumpur", 1000, 300);
        kue[10] = new KueJadi("Bika Ambon", 1000, 30);
        kue[11] = new KueJadi("Carabikang", 2500, 25);
        kue[12] = new KueJadi("Bolu Kukus", 5000, 20);
        kue[13] = new KueJadi("Dodol", 10000, 15);
        kue[14] = new KueJadi("Kue Lapis", 5000, 15);
        kue[15] = new KueJadi("Wingko", 1500, 15);
        kue[16] = new KueJadi("Brem", 10000, 20);
        kue[17] = new KueJadi("Bakpia", 12000, 15);
        kue[18] = new KueJadi("Madumongso", 10000, 15);
        kue[19] = new KueJadi("Kue Cucur", 1000, 20);


        String kueTermahal = "";
        int totalHarga = 0;
        int totalHargaKuePesanan = 0;
        int totalBeratKuePesanan = 0;
        int totalHargaKueJadi = 0;
        int totalJumlahKueJadi = 0;
        int hargaTerbesar = 0;
        for(int i = 0; i<20; i++) {
            System.out.println(kue[i]);
            String jenisKue = "";
            if (kue[i] instanceof KuePesanan) {
                KuePesanan kuep = (KuePesanan)kue[i];
                jenisKue = "Kue Pesanan";
                totalHarga = totalHarga + (int)kue[i].getHarga();
                totalHargaKuePesanan = totalHargaKuePesanan + (int)kue[i].getHarga();
                totalBeratKuePesanan = totalBeratKuePesanan + (int)kuep.getBerat();
                if (kuep.hitungHarga() > hargaTerbesar) {
                    hargaTerbesar = (int)kuep.hitungHarga();
                    kueTermahal = kuep.getNama();
                }
            } else if (kue[i] instanceof KueJadi) {
                KueJadi kuej = (KueJadi)kue[i];
                jenisKue = "Kue Jadi";
                totalHarga = totalHarga + (int)kue[i].getHarga();
                totalHargaKueJadi = totalHargaKueJadi + (int)kue[i].getHarga();
                totalJumlahKueJadi = totalJumlahKueJadi + (int)kuej.getJumlah();
                if (kuej.hitungHarga() > hargaTerbesar) {
                    hargaTerbesar = (int)kuej.hitungHarga();
                    kueTermahal = kuej.getNama();
                }
            }
            System.out.println("Jenis kue : " + jenisKue + "\n");
        }

        System.out.println("Total Harga dari semua jenis kue : Rp" + totalHarga);

        System.out.println("Total Harga dari Kue Pesanan : Rp" + totalHargaKuePesanan);
        System.out.println("Total Berat dari Kue Pesanan : " + totalBeratKuePesanan + " gram");

        System.out.println("Total Harga dari Kue Jadi : Rp" + totalHargaKueJadi);
        System.out.println("Total Jumlah dari Kue Jadi : " + totalJumlahKueJadi + " buah\n");

        System.out.println("Kue dengan harga terbesar : " + kueTermahal);
        System.out.println("dengan total Harga : Rp" + hargaTerbesar + "\n");

        

    }
}
