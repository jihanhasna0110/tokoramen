/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen3;

/**
 *
 * @author Jihan
 */
public class cPelanggan {
     private String nama;
    private String alamat;
    private int notelp;
    private String email;
    cPelanggan(){
        nama = "";
        alamat = "";
        notelp = 0;
        email = "";
        System.out.println("Object Pelanggan dibuat..");
    }
    
    //constructur
    cPelanggan(String np, String ap, int ntp, String ep){
        nama = np;
        alamat = ap;
        notelp = ntp;
        email = ep;
        System.out.println("==========================");
        System.out.println("==DATA  "+nama+" DIBUAT....==");
        System.out.println("==========================");
    }
    
    //setter
    public void setnama(String np){
        nama=np;
    }
    public void setalamat(String ap){
        alamat=ap;
    }
    public void setnotelp(int ntp){
        notelp=ntp;
    }
    public void setemail(String ep){
        email=ep;
    }
    
    //getter
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public int getnotelp(){
        return notelp;
    }
    public String getemail(){
        return email;
    }
    
    //query
    public String ToString(){
        return " Nama : "+ nama+"\n Alamat : "+ alamat + "\n No.Telp : " + notelp + "\n email : " + email;
    } 
}
