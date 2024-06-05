/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen3;
import java.util.Scanner;
public class cPesanan {
     private tokoramen3.cPelanggan pelanggan;
    private tokoramen3.cMakanan makanan[];
    private tokoramen3.cMinuman minuman[];
    private int jmkn,jmn, mpn, total;
    private int kp;
    private Scanner sc = new Scanner(System.in);
    //construktur
    cPesanan(){
        mpn=6;
        makanan = new tokoramen3.cMakanan[mpn];
        minuman = new tokoramen3.cMinuman[mpn];
        jmkn = 0; jmn=0; total=0; kp=0;
        System.out.println("Kode pesanan :" + kp +"telah dibuat....");
        
    }
    //setter
    public void datapelanggan(tokoramen3.cPelanggan np){
        pelanggan=np;
        System.out.println("Isi data pelanggan sukses...");
        
    }
    
    public void tambahmakanan(tokoramen3.cMakanan nm){
                
        if(jmkn>=mpn){
            System.out.println("Kapasitas Penuh!!");
        }
        else{
            makanan[jmkn]=nm;
            System.out.println("");
            System.out.println("Penambahan pesanan makanan sukses...");
            System.out.println("");
            jmkn++;
        }
    }
    public void tambahminuman(tokoramen3.cMinuman nm2){
                
        if(jmn>=mpn){
            System.out.println("Kapasitas Penuh!!");
        }
        else{
            minuman[jmn]=nm2;
            System.out.println("");
            System.out.println("Penambahan pesanan minuman sukses...");
            System.out.println("");
            jmn++;
        }
    }
    public void hapusmakanan(tokoramen3.cMakanan nm){
        if(jmkn<0){
            System.out.println("Makanan Kosong!!"); 
        }
        else{
            System.out.print("Makanan dihapus = ");
            String hapusnm = sc.next();
            boolean ada = false;
            for (int i = 0; i < mpn+1; i++) {
                if(hapusnm.equalsIgnoreCase(makanan[i].getnama())){
                  ada=true;
                  makanan[i]=null;
                  
                  // geser elemen array
                  int p=i;
                    for (int j = p; j < jmkn+1; j++) {
                        if(j==jmkn-1){
                            makanan[j]=null;
                        }
                        else{
                            makanan[j]=makanan[j+1];
                        }
                    }
                    jmkn--;
                    System.out.println("");
                    System.out.println("Penghapusan makanan Berhasilll!!");
                    break;
                }
            }
            if(ada==false){
            System.out.println("Makanan tidak ada!!");
            jmkn++;
        }
        }
    }
        public void hapusminuman(tokoramen3.cMinuman nm){
        if(jmn<0){
            System.out.println("Minuman Kosong!!"); 
        }
        else{
            System.out.print("Minuman dihapus = ");
            String hapusnm = sc.next();
            boolean ada = false;
            for (int i = 0; i < mpn+1; i++) {
                if(hapusnm.equalsIgnoreCase(makanan[i].getnama())){
                  ada=true;
                  minuman[i]=null;
                  
                  // geser elemen array
                  int p=i;
                    for (int j = p; j < jmn+1; j++) {
                        if(j==jmn-1){
                            minuman[j]=null;
                        }
                        else{
                            minuman[j]=minuman[j+1];
                        }
                    }
                    jmn--;
                    System.out.println("");
                    System.out.println("Penghapusan minuman Berhasilll!!");
                    break;
                }
            }
            if(ada==false){
            System.out.println("Minuman tidak ada!!");
            jmn++;
        }
        }
    }
    public void lihatpesanan(){
        System.out.println("Data Pesanan");
        System.out.println(pelanggan.ToString());
        System.out.println("Makanan : ");
        boolean ada = false;
        for (int i = 0; i < jmkn; i++) {
            if (jmkn<0){
                System.out.println("Tidak ada pesanan Makanan");
            }
            else{
             System.out.println((i+1)+"."+makanan[i].isiData());   
            }
        }
        System.out.println("");
        System.out.println("Minuman : ");
        for (int i = 0; i < jmn; i++) {
            if (jmn<0){
                System.out.println("Tidak ada pesanan Makanan");
            }
            else{
             System.out.println((i+1)+"."+minuman[i].isiData());   
            }
        }

    }
}
