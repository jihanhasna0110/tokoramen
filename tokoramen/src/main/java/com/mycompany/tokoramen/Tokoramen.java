
/*
-------------PROGRAM APPLIKASI TOKO RAMEN MEOKGOGALLAE-------------
Nama Kelompok:
1. Betari Safira Rachmanda  (22082010140) 
2. Anadya Tafdhila  (22082010142) 
3. Jihan Hasna Iftinan (22082010148) 
4. Maheswara Prajapatisuta S. (22082010166)

 */

 /* 1. temukan narasi proses : Ana membeli ramen dan esteh di toko ramen
    2. Identifikasi Class : Ana, membeli, ramen dan esteh, di toko ramen
    3. lengkapi isi masing-masing class : pembeli, kasir, Menu, Admin.
    4. Coding di main/class utama
 */
package com.mycompany.tokoramen;

import java.util.Scanner;

public class Tokoramen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cMenu menu = null;
        cPembeli pembeli1 = null;
        cPembeli pembeli2 = null;
        cPesanan pesanan = null;
        cAdmin admin1 = new cAdmin();
        int opsi1 = 0, opsi2 = 0, opsi3 = 0, opsi4 = 0, opsi5 = 0, opsi6 = 0;

        System.out.println("=============================================================");
        System.out.println("== SELAMAT DATANG DI SISTEM ONLINE TOKO RAMEN MEOKGOGALLAE ==");
        System.out.println("===============BY : Betari, Ana, Jihan, Praja================");

        do {

            System.out.println("Silahkan pilih opsi dibawah ini :............................");
            System.out.println(" 1. Daftar Menu");
            System.out.println(" 2. Membeli");
            System.out.println(" 3. Admin");
            System.out.println(" 4. Kasir");
            System.out.println(" 5. Selesai");
            System.out.print("Opsi : ");
            opsi1 = sc.nextInt();

            switch (opsi1) {
                case 1:
                    do {
                        System.out.println("Pilih Opsi Daftar Menu:");
                        System.out.println(" 1. Daftar Makanan");
                        System.out.println(" 2. Daftar Minuman");
                        System.out.println(" 3. Kembali ke halaman utama");
                        System.out.print("Opsi : ");
                        opsi2 = sc.nextInt();
                        switch (opsi2) {
                            case 1:
                                System.out.println(" Beef ramen     [44.000]");
                                System.out.println(" Chicken ramen  [42.000]");
                                System.out.println(" katsu ramen    [50.000]");
                                break;
                            case 2:
                                System.out.println(" Esteh          [15.000]");
                                System.out.println(" Es jeruk       [15.000]");
                                System.out.println(" Lemon Tea      [15.000]");
                                break;
                            case 3:

                                System.out.println("Kembali Ke halaman Utama");
                                break;
                        }
                    } while (opsi2 != 3);
                    System.out.println("");

                    break;

                case 2:
                    System.out.println(" HAI KONSUMER RAMEN MEOKGOGALLAE KENALAN YUK!!!");
                    System.out.print("Nama :");
                    String nm = sc.nextLine();
                    nm = sc.nextLine();
                    System.out.print("Notelp :");
                    int nt = sc.nextInt();
                    System.out.print("Alamat :");
                    String am = sc.nextLine();
                    am = sc.nextLine();
                    
                    System.out.println("");
                    pembeli1 = new cPembeli(nm, am, nt);
                    System.out.println("");
                    
                    System.out.println("================================================");
                    System.out.println("-----UDAH KENALAN NIH. YUK PILIH PESANAN MU!----");
                    System.out.println("================================================");
                    System.out.println("----------------DAFTAR MAKANAN-----------------");
                    System.out.println(" Beef ramen     [44.000]");
                    System.out.println(" Chicken ramen  [42.000]");
                    System.out.println(" katsu ramen    [50.000]");
                    System.out.println("----------------DAFTAR MINUMAN-----------------");
                    System.out.println(" Esteh          [15.000]");
                    System.out.println(" Es jeruk       [15.000]");
                    System.out.println(" Lemon Tea      [15.000]");
                    System.out.print("Pesanan Makanan : ");
                    String pmk = sc.nextLine();
                    System.out.print("Harga Makanan : ");
                    int hmk = sc.nextInt();
                    System.out.print("Pesanan Minuman : ");
                    String pmn = sc.nextLine();
                    pmn = sc.nextLine();
                    System.out.print("Harga Minuman : ");
                    int hmn = sc.nextInt();
                    int tp = hmk + hmn;
                    
                    System.out.println("");
                    pesanan = new cPesanan(pmk, hmk, pmn, hmn, tp);
                    System.out.println("");
                    
                    System.out.println("----------------------------------------------------");
                    System.out.println("TERIMAKASIH TELAH MEMESAN, BERIKUT TOTAL PESANAN MU^^ :");
                    System.out.println("----------------------------------------------------");
                    System.out.println(pembeli1.isiPembeli());
                    System.out.println("");
                    System.out.println(pesanan.isiPesananmk());
                    System.out.println(pesanan.isiPesananmn());
                    System.out.println("--------------------------------+");
                    System.out.println(pesanan.isitotal());
                    System.out.println("");
                    System.out.println("---ENJOY YOUR FOOD, THANKS TO COMING--- ");
                    System.out.println("--------FROM : RAMEN MEOKGOGALLAE-------");
                    System.out.println("");

                    break;

                case 3:
                    System.out.println("=======================================");
                    System.out.println("SELAMAT DATANG ADMIN RAMEN MEOKGOGALLAE");
                    System.out.println("=======================================");
                    do {
                        System.out.println("PILIH OPSI MU :....................");
                        System.out.println("1. Menambah Menu");
                        System.out.println("2. Kembali ke menu utama");
                        System.out.print("Opsi : ");
                        opsi3 = sc.nextInt();
                        switch (opsi3) {
                            case 1:
                                do {
                                    System.out.println("PILIH OPSI MU :....................");
                                    System.out.println("1. Menambah Makanan dan Minuman");
                                    System.out.println("2. Lihat Menu");
                                    System.out.println("3. Kembali");
                                    System.out.print("Opsi : ");
                                    opsi4 = sc.nextInt();
                                    System.out.println("");

                                    switch (opsi4) {
                                        case 1:
                                            System.out.print("Nama Makanan: ");
                                            String nmmk = sc.nextLine();
                                            nmmk = sc.nextLine();
                                            System.out.print("Harga Makanan: ");
                                            int hgmk = sc.nextInt();
                                            System.out.println("");
                                            System.out.print("Nama Minuman: ");
                                            String nmmn = sc.nextLine();
                                            nmmn = sc.nextLine();
                                            System.out.print("Harga Minuman: ");
                                            int hgmn = sc.nextInt();
                                            menu = new cMenu(nmmk, hgmk, nmmn, hgmn);
                                            System.out.println("");
                                            System.out.println(menu.isiDatamakanan());
                                            System.out.println(menu.isiDataminuman());
                                            System.out.println("----MENU BERHASIL DITAMBAH----");
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("MENU TERBARU :");
                                            System.out.println("----------------DAFTAR MAKANAN-----------------");
                                            System.out.println(" Beef ramen     [44.000]");
                                            System.out.println(" Chicken ramen  [42.000]");
                                            System.out.println(" katsu ramen    [50.000]");
                                            System.out.println(menu.isiDatamakanan());
                                            System.out.println("----------------DAFTAR MINUMAN-----------------");
                                            System.out.println(" Esteh          [15.000]");
                                            System.out.println(" Es jeruk       [15.000]");
                                            System.out.println(" Lemon Tea      [15.000]");
                                            System.out.println(menu.isiDataminuman());
                                            System.out.println("");

                                            break;
                                        case 3:
                                            System.out.println("Kembali Ke halaman sebelumnya");
                                            System.out.println("");
                                            break;

                                    }
                                } while (opsi4 != 3);

                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("Kembali ke halaman utama");
                                System.out.println("");

                                break;
                        }
                    } while (opsi3 != 2);

                    break;

                case 4:
                    System.out.println("==================================");
                    System.out.println("---SELAMAT DATANG DI MENU KASIR---");
                    System.out.println("==================================");
                    do {
                        System.out.println("PILIH OPSI DIBAWAH INI : .....");
                        System.out.println(" 1. Tambah Data Pelanggan");
                        System.out.println(" 2. Lihat Data Pelanggan");
                        System.out.println(" 3. Ubah Data Pelanggan");
                        System.out.println(" 4. Hapus Data Pelanggan");
                        System.out.println(" 5. Pembayaran Pelanggan");
                        System.out.println(" 6. Kembali");
                        System.out.print(" OPSI : ");
                        opsi5 = sc.nextInt();
                        switch (opsi5) {
                            case 1:
                                System.out.println(" -------MENAMBAH DATA PELANGGAN------ ");
                                System.out.print(" Nama : ");
                                nm = sc.nextLine();
                                nm = sc.nextLine();
                                System.out.print(" NoTelp : ");
                                nt = sc.nextInt();
                                System.out.print(" Alamat : ");
                                am = sc.nextLine();
                                am = sc.nextLine();
                                pembeli2 = new cPembeli(nm, am, nt);
                                System.out.println("");
                                System.out.println(" ==DATA PELANGGAN BERHASIL DITAMBAHKAN==");
                                System.out.println("");

                                break;
                            case 2:
                                System.out.println("-----MELIHAT DATA PELANGGAN-----");
                                System.out.println("");
                                System.out.println(pembeli2.isiPembeli());
                                System.out.println("");

                                break;
                            case 3:
                                System.out.println("------MENGUBAH DATA PELANGGAN------");
                                do {
                                    System.out.println("PILIH OPSI : ");
                                    System.out.println(" 1. Mengubah Alamat");
                                    System.out.println(" 2. Mengubah NoTelp");
                                    System.out.println(" 3. Kembali");
                                    System.out.print("Opsi : ");
                                    opsi6 = sc.nextInt();
                                    switch (opsi6) {
                                        case 1:
                                            System.out.println("");
                                            System.out.print(" Alamat : ");
                                            String am2 = sc.nextLine();
                                            am2 = sc.nextLine();
                                            pembeli2.setalamat(am2);
                                            System.out.println("");
                                            System.out.println("-----DATA ALAMAT BERHASIL DIUBAH-----");
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print(" No.Telp : ");
                                            int nt2 = sc.nextInt();
                                            pembeli2.setnotelp(nt2);
                                            System.out.println("");
                                            System.out.println("-----DATA NO.TELP BERHASIL DIUBAH-----");
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("");
                                            System.out.println("KEMBALI KE HALAMAN SEBELUMNYA");
                                            System.out.println("");
                                            break;

                                    }

                                } while (opsi6 != 3);

                                break;

                            case 4:

                                System.out.println("");
                                System.out.println("==========Hapus data==========");
                                System.out.println("");
                                cKasir kasir = new cKasir();
                                kasir.hapusdata();
                                System.out.println("");

                                break;
                            case 5:
                                System.out.println("");
                                System.out.println("=======PEMBAYARAN PELANGGAN=======");
                                System.out.println("");
                                System.out.println(pembeli1.isiPembeli());
                                System.out.println("");
                                System.out.println(pesanan.isiPesananmk());
                                System.out.println(pesanan.isiPesananmn());
                                System.out.println("--------------------------------+");
                                System.out.println(pesanan.isitotal());
                                System.out.println("");

                                System.out.print("UANG PELANGGAN : ");
                                int uangpelanggan = sc.nextInt();
                                tp = pesanan.gettotalpesanan();
                                int kembalian = uangpelanggan - tp;
                                System.out.println("Kembalian : " + kembalian);
                                System.out.println("");
                                System.out.println("---FINISH TO PAY--- ");
                                System.out.println("");
                                break;

                            case 6:
                                System.out.println("Kembali ke halaman utama");
                                System.out.println("");

                                break;
                        }

                    } while (opsi5 != 6);
                    break;

                case 5:

                    System.out.println("Terimakasih telah menggunakan sistem online toko Ramen Meokgogallae");
                    break;
            }

        } while (opsi1  != 5);

    }
}
