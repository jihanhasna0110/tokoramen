/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoramen;

/**
 *
 * @author Jihan
 */
public class cAdmin {



        //data
        private String nama;
        private String alamat;
        private int notelp;


        //method
        //1.Constructor---->Istimewa
        cAdmin() {
            nama = "";
            alamat = "";
            notelp = 0;

            System.out.println("Constructor default..");

        }

        cAdmin(String nm, String am, int nt) {
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

    }

