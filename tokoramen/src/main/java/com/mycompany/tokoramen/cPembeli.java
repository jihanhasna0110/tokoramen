/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoramen;

/**
 *
 * @author Jihan
 */
public class cPembeli {

        //data
        private String nama;
        private String alamat;
        private int notelp;
        
        private String pesanmk;
        private String pesanmn;
        private int hargapesanmk;
        private int hargapesanmn;
        private int totalpesanan;

        //method
        //1.Constructor---->Istimewa
        cPembeli() {
            nama = "";
            alamat = "";
            notelp = 0;

            System.out.println("Constructor default..");

        }

        cPembeli(String nm, String am, int nt) {
            nama = nm;
            alamat = am;
            notelp = nt;
            System.out.println("DATA PEMBELI " + nama + " DIBUAT ...");
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
            return "Nama :" + nama + "\nAlamat :" + alamat + " \nNotelp :" + notelp;
        }

    }


