public class javaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.setSinopsis("Sejarah teknologi sains dan filosofi di abad ke18 menyediakan kisah yang menarik dan membuka pengetahuan baru.");
        b1.displayMessage();
        System.out.println("=====================================");

        Perpus b2 = new Perpus();
        b2.setJudul("Information and Communication Technology,dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[]{"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso","M as’Amah"});
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setSinopsis("ASPIKOM 2015, dengan dewi kartika sari sebagai penulis telah merilis buku baru yang membahas teknologi informasi dan komunikasi.");
        b2.setHalaman(178);

        b2.displayMessage();
        System.out.println("=====================================");
        
        Perpus b3 = new Perpus();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.setSinopsis("Dunia shopie, merupakan salah satu karya dari bidang filsafat oleh jostein garden.");
        b3.displayMessage();
        System.out.println("=====================================");

        Perpus b4 = new Perpus();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.setSinopsis("Reza alexander antonius wattimena kali ini mengeluarkan buku berjudul filsafat kata");
        b4.displayMessage();
        System.out.println("=====================================");
        
        Perpus b5 = new Perpus();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.setSinopsis("Sejarah merupakan hal penting yang tidak boleh dilupakan oleh bangsa kita. Siswanto dalam buku ini menjelaskan dinamika sejarah dalam pendidikan islam");
        b5.displayMessage();
        System.out.println("=====================================");

        Perpus b6 = new Perpus();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.setSinopsis("Pernahkah terpikir bagaimana hadis dikumpulkan? buku kali ini akan membahas tentang penulisan dan penghimpunan hadis dengan kajian historis");
        b6.displayMessage();
        System.out.println("=====================================");
        
        Perpus b7 = new Perpus();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.setSinopsis("Rasulullah SAW. mengajarkan kepada kita untuk berkata yang baik atau lebih baik diam. Dalam buku ini dijelaskan lebih lanjut adab kebiasaan Rasulullah SAW.");
        b7.displayMessage();
        System.out.println("=====================================");

        Perpus b8 = new Perpus();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.setSinopsis("Qowi Alta Az Zahra kembali menerbitkan buku yaitu berjudul Ya Allah, Aku Jatuh Cinta. Buku ini akan membahas persoalan agama.");
        b8.displayMessage();
        System.out.println("=====================================");
        
        Perpus b9 = new Perpus();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.setSinopsis("Buka pikiran dan hatimu dengan karya terbaru oleh Sandy Oogway. Buku ini akan mencerahkan psikologimu.");
        b9.displayMessage();
        System.out.println("=====================================");

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.setSinopsis("Zainul Anwar kini merilis buku terbaru. Buku ini diharapkan dapat membantu dalam kegiatan pembelajaran dan praktikum tes psikologi");
        b10.displayMessage();
        System.out.println("=====================================");
        
        Perpus b11 = new Perpus();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.setSinopsis("Benedict Anderson, dengan penerbit Anjing Galak Penerbitan 2010 dalam buku ini membahas nasionalisme di Indonesia kini maupun di masa depan.");
        b11.displayMessage();
        System.out.println("=====================================");
        
        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.setSinopsis("Praoedya Ananta Toer, dalam buku berjumlah 316 halaman ini menjelaskan catatan dari pak buru, sebuah pembahasan politik yang menarik.");
        b12.displayMessage();
        System.out.println("=====================================");
        
        Perpus b13 = new Perpus();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis("Laut bercerita, Leila S. Chudori membawamu dalam berbagai suasana hati yang mungkin belum pernah kamu rasakan sebelumnya.");
        b13.displayMessage();
        System.out.println("=====================================");
        
        Perpus b14 = new Perpus();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis("Buku dengan 257 halaman ini merupakan karya dari Eka Kurniawan dengan Gramedia Pustaka Utama sebagai penerbit.");
        b14.displayMessage();
        System.out.println("=====================================");

        //Simpan File 
        Perpus b15 = new Perpus();
        b15.setJudul("Dilan 1990");
        b15.setPenulis("Pidi Baiq");
        b15.simpanFile("C:/Folder Baru/pemrograman dasar/src.txt");
        System.out.println("=====================================");

        //Baca File 
        b15.bacaFile("C:/Folder Baru/pemrograman dasar/src.txt");
        System.out.println("Judulnya adalah : " + b15.getPenulis());
        System.out.println("Penulisnya adalah " + b15.getPenulis());
        System.out.println("=====================================");

        //Tingkat Kesamaan
        System.out.println("Tingkat kesamaan " + b1.getJudul() + " dengan " + b9.getJudul() + " adalah " + b1.cekKesamaan(b9) + "%");
        System.out.println("Tingkat kesamaan " + b2.getJudul() + " dengan " + b10.getJudul() + " adalah " + b2.cekKesamaan(b10) + "%");
        System.out.println("=====================================");

        //Royalti
        b7.setPenjualan(100);
        System.out.println("Royalti buku " + b7.getJudul() + " adalah " + b7.hitungRoyalti(90000)); 
        //royalti 2 parameter
        b8.setPenjualan(250);
        System.out.println("Royalti buku " + b8.getJudul() + " adalah " + b8.hitungRoyalti(90000, 15));


    
    }
}
