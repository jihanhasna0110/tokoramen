/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoramen;

/**
 *
 * @author Jihan
 */
public class cPesanan {
    //data

    private String pesanmk;
    private String pesanmn;
    private int hargapesanmk;
    private int hargapesanmn;
    private int totalpesanan;

    //method
    //1.Constructor---->Istimewa
    cPesanan(String pmk, int hmk, String pmn, int hmn, int tp) {
        pesanmk = pmk;
        pesanmn = pmn;
        hargapesanmk = hmk;
        hargapesanmn = hmn;
        totalpesanan = tp;
        System.out.println("DATA PESANAN TELAH DIBUAT ...");
    }

    //2. Setter---->Mengisi Data
    public void setpesanmk(String pmk) {
        pesanmk = pmk;
    }

    public void setpesanmn(String pmn) {
        pesanmn = pmn;
    }

    public void sethargapesanmk(int hmk) {
        hargapesanmk = hmk;
    }

    public void sethargapesanmn(int hmn) {
        hargapesanmn = hmn;
    }

    public void settotalpesanan(int tp) {
        totalpesanan = tp;
    }

    //3. Getter---->Mengambil/melihat Data
    public String getpesanmk() {
        return pesanmk;
    }

    public String getpesanmn() {
        return pesanmn;
    }

    public int gethargapesanmk() {
        return hargapesanmk;
    }

    public int gethargapesanmn() {
        return hargapesanmn;
    }

    public int gettotalpesanan() {
        return totalpesanan;
    }

    //4.toString
    public String isiPesananmk() {
        return "Nama makanan : " + pesanmk + "      Harga : " + hargapesanmk;
    }

    public String isiPesananmn() {
        return "Nama minuman : " + pesanmn + "      Harga : " + hargapesanmn;
    }

    public String isitotal() {
        return "Total Pesanan :                     " + totalpesanan;
    }
}
