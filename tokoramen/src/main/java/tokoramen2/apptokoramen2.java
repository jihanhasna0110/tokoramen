/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen2;

/**
 *
 * @author Jihan
 */
// proses bisnis: Ana membeli ramen dan esteh
//pendekatan nota/kwitansi --> transaksi pembelian
//class : pelanggan, menu, pembelian(nota)
import java.util.Scanner;

public class apptokoramen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        cPelanggan plg = new cPelanggan();
        cMakanan makanan[] = new cMakanan[6];

        //List MENU
        makanan[0] = new cMakanan("BeefRamen", 44000);
        makanan[1] = new cMakanan("ChickenRamen", 42000);
        makanan[2] = new cMakanan("KatsuRamen", 40000);
        makanan[3] = new cMakanan("RamenGimmary", 38000);
        makanan[4] = new cMakanan("RamenCheese", 38000);
        makanan[5] = new cMakanan("RamenSpicy", 38000);

        System.out.println("");
        System.out.println("=========SELAMAT DATANG DI=========");
        System.out.println("=====SISTEM ONLINE TOKO RAMEN2=====");
        System.out.println("====BY : BETARI,ANA,JIHAN,PRAJA====");
        do {
            System.out.println("Silahkan Pilih opsi mu : ");
            System.out.println(" 1. Pelanggan");
            System.out.println(" 2. Makanan");
            System.out.println(" 3. Transaksi");
            System.out.println(" 4. Selesai");
            System.out.print("Opsi : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("");
                    System.out.println("======================================");
                    System.out.println("ANYYEONG KONSUMER RAMEN MEOKGOGALLAE^^");
                    System.out.println("======================================");
                    System.out.println("Isi data dulu yuk !....");
                    System.out.print("Nama : ");
                    String np = sc.next();
                    System.out.print("Alamat : ");
                    String ap = sc.next();
                    System.out.print("No.Telp : ");
                    int ntp = sc.nextInt();
                    System.out.print("Email : ");
                    String ep = sc.next();
                    System.out.println("");
                    plg = new cPelanggan(np, ap, ntp, ep);
                    System.out.println(plg.ToString());
                    System.out.println("");

                    break;

                case 2:
                    System.out.println("");
                    System.out.println("============");
                    System.out.println(" DAFTAR MENU");
                    System.out.println("============");
                    for (int i = 0; i < makanan.length; i++) {
                        System.out.println(makanan[i].isiDatamakanan());

                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("=====PESANAN MAKANAN=====");
                    System.out.println("=========================");
                    cPesanan pesan = new cPesanan();
                    pesan.datapelanggan(plg);
                    System.out.println("");
                    int pilih2 = 0;
                    do {
                        System.out.println("");
                        System.out.println("Pilih Opsi dibawah ini :..... ");
                        System.out.println(" 1. Tambah Pesanan");
                        System.out.println(" 2. Hapus Pesanan");
                        System.out.println(" 3. Lihat Pesanan");
                        System.out.println(" 4. Kembali");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("");
                                System.out.println("==============");
                                System.out.println("Tambah Pesanan");
                                System.out.println("==============");
                                System.out.println("");
                                System.out.println("Daftar Menu : ");
                                System.out.println("");
                                for (int i = 0; i < makanan.length; i++) {
                                    System.out.println(makanan[i].isiDatamakanan());
                                }
                                System.out.println("");
                                System.out.print("Nama makanan = ");
                                String nm = sc.next();
                                boolean ada = false;
                                for (int i = 0; i < makanan.length; i++) {
                                    if (nm.equalsIgnoreCase(makanan[i].getnamamakanan())) {
                                        ada = true;
                                        pesan.tambahmakanan(makanan[i]);
                                        break;
                                    }

                                }
                                if (ada == false) {
                                    System.out.println("Nama Makanan tidak ada !.....");
                                }

                                break;
                            case 2:
                                System.out.println("");
                                pesan.hapusmakanan();
                                break;
                            case 3:
                                System.out.println("");
                                pesan.lihatpesanan();
                                break;
                            case 4:
                                System.out.println("");
                                System.out.println("==KEMBALI==");
                                System.out.println("");
                                break;
                        }
                    } while (pilih2 != 4);

                    break;
                case 4:
                    System.out.println("================================================");
                    System.out.println(" Khamsahamnidaa konsumer Ramen Meokgogallae.... ");
                    System.out.println("================================================");
            }

        } while (pilih != 4);
    }
}
