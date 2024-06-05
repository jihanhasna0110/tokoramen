/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen2;
import java.util.Scanner;
/**
 *
 * @author Jihan
 */
//mempertemukan objek pembeli dengan objek makanan
//satu pembeli dapat membeli banyak makanan sekaligus

public class cPesanan {
    private cPelanggan pelanggan;
    private cMakanan makanan[];
    private int jpn, mpn, total;
    private int kp;
    private Scanner sc = new Scanner (System.in);
    //construktur
    cPesanan(){
        mpn=6;
        makanan = new cMakanan[mpn];
        jpn = 0; total=0; kp=0;

        
    }
    //setter
    public void datapelanggan(cPelanggan np){
        pelanggan=np;

        
    }
    public void tambahmakanan(cMakanan nm){
                
        if(jpn>=mpn){
            System.out.println("Kapasitas Penuh!!");
        }
        else{
            makanan[jpn]=nm;
            System.out.println("");
            System.out.println("Penambahan pesanan sukses...");
            jpn++;
        }
    }
    public void hapusmakanan(){
        if(jpn<0){
            System.out.println("Makanan Kosong!!"); 
        }
        else{
            System.out.print("Makanan dihapus = ");
            String hapusnm = sc.next();
            boolean ada = false;
            for (int i = 0; i < mpn+1; i++) {
                if(hapusnm.equalsIgnoreCase(makanan[i].getnamamakanan())){
                  ada=true;
                  makanan[i]=null;
                  
                  // geser elemen array
                  int p=i;
                    for (int j = p; j < jpn+1; j++) {
                        if(j==jpn-1){
                            makanan[j]=null;
                        }
                        else{
                            makanan[j]=makanan[j+1];
                        }
                    }
                    jpn--;
                    System.out.println("");
                    System.out.println("Penghapusan Berhasilll!!");
                    break;
                }
            }
            if(ada==false){
            System.out.println("Makanan tidak ada!!");
            jpn++;
        }
        }
    }
    public void lihatpesanan(){
        System.out.println(" Data Pesanan");
        System.out.println(pelanggan.ToString());
        for (int i = 0; i < jpn; i++) {
            System.out.println((i+1)+"."+makanan[i].isiDatamakanan());
        }
        System.out.println("");
    }



    
    
}
