/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoramen;

import java.util.Scanner;

/**
 *
 * @author Jihan
 */
public class cMenu {


        //data
        private String namamakanan;
        private int hargamakanan;
        private String namaminuman;
        private int hargaminuman;

        //method
        //1.Constructor---->Istimewa
        cMenu() {
            namamakanan = "";
            hargamakanan = 0;
            namaminuman = "";
            hargamakanan = 0;
            System.out.println("Constructor default..");

        }

        cMenu(String nmmk, int hgmk, String nmmn, int hgmn) {
            namamakanan = nmmk;
            hargamakanan = hgmk;
            namaminuman = nmmn;
            hargaminuman = hgmn;

            System.out.println("object " + namamakanan + " & " + namaminuman + " dibuat");
        }

    

        //2. Setter---->Mengisi Data
        public void setnamamakanan(String nk) {
            namamakanan = nk;
        }

        public void setnamaminuman(String nm) {
            namaminuman = nm;
        }

        public void sethargamakanan(int hk) {
            hargamakanan = hk;
        }

        public void sethargaminuman(int hm) {
            hargaminuman = hm;
        }

        //3. Getter---->Mengambil/melihat Data
        public String getnamamakanan() {
            return namamakanan;
        }

        public String getnamaminuman() {
            return namaminuman;
        }

        public int gethargamakanan() {
            return hargamakanan;
        }

        public int gethargaminuman() {
            return hargaminuman;
        }

        //4.toString
        public String isiDatamakanan() {
            return " "+namamakanan + " [" + hargamakanan + " ]";
        }

        public String isiDataminuman() {
            return " "+namaminuman + " [" + hargaminuman + " ]";
        }
    }

