/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tokoramen3;
// proses bisnis: Ana membeli ramen dan esteh
//pendekatan nota/kwitansi --> transaksi pembelian
//class : pelanggan, menu, pembelian(nota)

//relasi baru : Ana membeli ramen dan boba
//class baru --> minuman
//karena class makanan &minuman mirip/sama datanya
// maka kita buat kelas baru --> umum--> bernama class  menu
import java.util.Scanner;
  
public class apptokoramen {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih1 = 0, pilih2 = 0, pilih3 = 0, pilih4 = 0;
        cPelanggan plg = new cPelanggan();
        
        cMakanan makanan[] = new cMakanan[6];
        //List MAKANAN
        makanan[0] = new cMakanan("BeefRamen", 44000);
        makanan[1] = new cMakanan("ChickenRamen", 42000);
        makanan[2] = new cMakanan("KatsuRamen", 40000);
        makanan[3] = new cMakanan("RamenGimmary", 38000);
        makanan[4] = new cMakanan("RamenCheese", 38000);
        makanan[5] = new cMakanan("RamenSpicy", 38000);
        
        cMinuman minuman[] = new cMinuman[6];
        //LIST MINUMAN
        minuman[0] = new cMinuman("Boba", 15000);
        minuman[1] = new cMinuman("BananaMilk", 12000);
        minuman[2] = new cMinuman("MatchaLatte", 20000);
        minuman[3] = new cMinuman("LemonTea", 7000);
        minuman[4] = new cMinuman("IceTea", 5000);
        minuman[5] = new cMinuman("TehPucuk", 5000);
        
        System.out.println("");
        System.out.println("=========SELAMAT DATANG DI=========");
        System.out.println("=====SISTEM ONLINE TOKO RAMEN3=====");
        System.out.println("====BY : BETARI,ANA,JIHAN,PRAJA====");
        do {
            System.out.println("Silahkan Pilih opsi mu : ");
            System.out.println(" 1. Pelanggan");
            System.out.println(" 2. Makanan");
            System.out.println(" 3. Minuman");
            System.out.println(" 4. Transaksi");
            System.out.println(" 5. Selesai");
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
                    System.out.println("================");
                    System.out.println(" DAFTAR MAKANAN ");
                    System.out.println("================");
                    for (int i = 0; i < makanan.length; i++) {
                        System.out.println(makanan[i].isiData());
                    }
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.println("");
                    System.out.println("================");
                    System.out.println(" DAFTAR MINUMAN ");
                    System.out.println("================");
                    for (int i = 0; i < minuman.length; i++) {
                        System.out.println(minuman[i].isiData());
                    }
                    System.out.println("");
                    break;
                
                case 4:
                    System.out.println("================================");
                    System.out.println("=========Menu Transaksi=========");
                    System.out.println("================================");
                    cPesanan pesan = new cPesanan();
                    pesan.datapelanggan(plg);
                    System.out.println("");
                    do {
                        System.out.println("");
                        System.out.println("Pilih Opsi dibawah ini :..... ");
                        System.out.println(" 1. Tambah Pesanan");
                        System.out.println(" 2. Hapus Pesanan");
                        System.out.println(" 3. Lihat Pesanan");
                        System.out.println(" 4. Selesai");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("");
                                System.out.println("==============");
                                System.out.println("Tambah Pesanan");
                                System.out.println("==============");
                                System.out.println("");
                                do {
                                    System.out.println("    Pilih Opsi dibawah ini :....");
                                    System.out.println("    1. Tambah Makanan");
                                    System.out.println("    2. Tambah Minuman");
                                    System.out.println("    3. Kembal ");
                                    System.out.print("    Pilih = ");
                                    pilih3 = sc.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("DAFTAR MAKANAN : ");
                                            for (int i = 0; i < makanan.length; i++) {
                                                System.out.println(makanan[i].isiData());
                                            }
                                            System.out.print("Masukkan Nama Makanan = ");
                                            String nm = sc.next();
                                            boolean ada = false;
                                            for (int i = 0; i < makanan.length; i++) {
                                                if (nm.equalsIgnoreCase(makanan[i].getnama())) {
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
                                            System.out.println("DAFTAR MINUMAN : ");
                                            for (int i = 0; i < minuman.length; i++) {
                                                System.out.println(minuman[i].isiData());
                                            }
                                            System.out.print("Masukkan Nama Minuman = ");
                                            String nm2 = sc.next();
                                            boolean ada2 = false;
                                            for (int i = 0; i < minuman.length; i++) {
                                                if (nm2.equalsIgnoreCase(minuman[i].getnama())) {
                                                    ada = true;
                                                    pesan.tambahminuman(minuman[i]);
                                                    break;
                                                }
                                            }
                                            if (ada2 == false) {
                                                System.out.println("Nama Minuman tidak ada !.....");
                                            }
                                            break;
                                        
                                        case 3:
                                            System.out.println("Terima Kasih..");
                                            break;
                                    }
                                } while (pilih3 != 3);
                                
                                break;
                            case 2:
                                System.out.println("");
                                do {
                                    System.out.println("Pilih Menu yang akan dihapus: ");
                                    System.out.println("1. Makanan");
                                    System.out.println("2. Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Opsi : ");
                                    pilih4 = sc.nextInt();
                                    switch (pilih4) {
                                        case 1:
                                        {
                                            pesan.lihatpesanan();
                                            cMakanan nm = null;
                                            pesan.hapusmakanan(nm);
                                        }
                                            break;

                                        case 2:
                                        {
                                            pesan.lihatpesanan();
                                            cMinuman nm = null;
                                            pesan.hapusminuman(nm);
                                        }
                                            break;

                                    }
                                } while (pilih4 != 3);
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
                case 5:
                    System.out.println("================================================");
                    System.out.println(" Khamsahamnidaa konsumer Ramen Meokgogallae.... ");
                    System.out.println("================================================");
            }
            
        } while (pilih != 5);
    }
    
}
