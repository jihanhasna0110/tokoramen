/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoramen;

/**
 *
 * @author Jihan
 */
public class cKasir {

    //data
    private String nama;
    private String alamat;
    private int notelp;
    private cPesanan pesanan; // -------> Relasi Asosiasi Has A

    //method
    //1.Constructor---->Istimewa
    cKasir() {
        nama = "";
        alamat = "";
        notelp = 0;

        System.out.println("Constructor default..");

    }

    cKasir(String nm, String am, int nt) {
        nama = nm;
        alamat = am;
        notelp = nt;
        System.out.println("object " + nama + " dibuat");
    }

    //2. Setter---->Mengisi Data
    public void setnama(String nm) {
        nama = nm;
    }

    public void setalamat(String am) {
        alamat = am;
    }

    public void setnotelp(int nt) {
        notelp = nt;
    }

    //3. Getter---->Mengambil/melihat Data
    public String getnama() {
        return nama;
    }

    public String getalamat() {
        return alamat;
    }

    public int getnotelp() {
        return notelp;
    }

    //4.toString
    public String isiPembeli() {
        return "nama :" + nama + "\nalamat :" + alamat + " \nnotelp :" + notelp;
    }

    public void hapusdata() {
        nama = null;
        alamat = null;
        notelp = 0;
        System.out.println("DATA BERHASIL DI HAPUS");

    }
    
    // hasil dari relasi has a
    public void totalpesanan() {
        System.out.println(pesanan.gettotalpesanan());
    }
}
