import java.util.Scanner;

public class tesSwalayanTiny {
    
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        boolean pilihan = false;
        String jawaban1, jawaban2;
        int jumlahtopup, jumlahpembelian;
        
        Pelanggan p1 = new Pelanggan("Alif", "38908908789", 9090, 3000000);
        while (!pilihan) {
            System.out.println("Hai "+ p1.getNama() + "!, Apa yang mau anda lakukan? TopUp atau Pembelian?");
            jawaban1 = input.next();
            if (jawaban1.equals("TopUp")) {
                if (p1.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan jumlah top up : ");
                jumlahtopup = input.nextInt();
                p1.topup(jumlahtopup);
            } else if (jawaban1.equals("Pembelian")) {
                if (p1.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan total pembelian : ");
                jumlahpembelian = input.nextInt();
                p1.pembelian(jumlahpembelian);
            }

            System.out.println("Perintah selesai dijalankan, apakah mau transaksi lagi?");
            jawaban2 = input.next();
            if (jawaban2.equals("Tidak")) {
                System.out.println("Terimakasih telah bertransaksi di Swalayan Tiny");
                break;
            }
        }

        System.out.println("====================================================================");
        
        Pelanggan p2 = new Pelanggan("Ba", "56908908650", 7554, 6000000);
        while (!pilihan) {
            System.out.println("Hai "+ p2.getNama() + "!, Apa yang mau anda lakukan? TopUp atau Pembelian?");
            jawaban1 = input.next();
            if (jawaban1.equals("TopUp")) {
                if (p2.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan jumlah top up : ");
                jumlahtopup = input.nextInt();
                p2.topup(jumlahtopup);
            } else if (jawaban1.equals("Pembelian")) {
                if (p2.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan total pembelian : ");
                jumlahpembelian = input.nextInt();
                p2.pembelian(jumlahpembelian);
            }

            System.out.println("Perintah selesai dijalankan, apakah mau transaksi lagi?");
            jawaban2 = input.next();
            if (jawaban2.equals("Tidak")) {
                System.out.println("Terimakasih telah bertransaksi di Swalayan Tiny");
                break;
            }
        }

        System.out.println("====================================================================");

        Pelanggan p3 = new Pelanggan("Ta", "74908908347", 2023, 9000000);
        while (!pilihan) {
            System.out.println("Hai "+ p3.getNama() + "!, Apa yang mau anda lakukan? TopUp atau Pembelian?");
            jawaban1 = input.next();
            if (jawaban1.equals("TopUp")) {
                if (p3.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan jumlah top up : ");
                jumlahtopup = input.nextInt();
                p3.topup(jumlahtopup);
            } else if (jawaban1.equals("Pembelian")) {
                if (p3.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan total pembelian : ");
                jumlahpembelian = input.nextInt();
                p3.pembelian(jumlahpembelian);
            }

            System.out.println("Perintah selesai dijalankan, apakah mau transaksi lagi?");
            jawaban2 = input.next();
            if (jawaban2.equals("Tidak")) {
                System.out.println("Terimakasih telah bertransaksi di Swalayan Tiny");
                break;
            }
        }

        System.out.println("====================================================================");

        Pelanggan p4 = new Pelanggan("Tsa", "38908908555", 9856, 2000);
        while (!pilihan) {
            System.out.println("Hai "+ p4.getNama() + "!, Apa yang mau anda lakukan? TopUp atau Pembelian?");
            jawaban1 = input.next();
            if (jawaban1.equals("TopUp")) {
                if (p4.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan jumlah top up : ");
                jumlahtopup = input.nextInt();
                p4.topup(jumlahtopup);
            } else if (jawaban1.equals("Pembelian")) {
                if (p4.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan total pembelian : ");
                jumlahpembelian = input.nextInt();
                p4.pembelian(jumlahpembelian);
            }

            System.out.println("Perintah selesai dijalankan, apakah mau transaksi lagi?");
            jawaban2 = input.next();
            if (jawaban2.equals("Tidak")) {
                System.out.println("Terimakasih telah bertransaksi di Swalayan Tiny");
                break;
            }
        }

        System.out.println("====================================================================");

        Pelanggan p5 = new Pelanggan("Jim", "74908908123", 5102, 100000);
        while (!pilihan) {
            System.out.println("Hai "+ p5.getNama() + "!, Apa yang mau anda lakukan? TopUp atau Pembelian?");
            jawaban1 = input.next();
            if (jawaban1.equals("TopUp")) {
                if (p5.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan jumlah top up : ");
                jumlahtopup = input.nextInt();
                p5.topup(jumlahtopup);
            } else if (jawaban1.equals("Pembelian")) {
                if (p5.autentifikasi() == true) {
                    break;
                }
                System.out.println("Masukkan total pembelian : ");
                jumlahpembelian = input.nextInt();
                p5.pembelian(jumlahpembelian);
            }

            System.out.println("Perintah selesai dijalankan, apakah mau transaksi lagi?");
            jawaban2 = input.next();
            if (jawaban2.equals("Tidak")) {
                System.out.println("Terimakasih telah bertransaksi di Swalayan Tiny");
                break;
            }
        }
    }
}
