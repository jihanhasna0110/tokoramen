/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen2;

/**
 *
 * @author Jihan
 */
public class cMakanan {

    private String namamakanan;
    private int hargamakanan;

    //method
    //1.Constructor---->Istimewa
    cMakanan() {
        namamakanan = "";
        hargamakanan = 0;

        System.out.println("Constructor default..");

    }

    cMakanan(String nm, int hm) {
        namamakanan = nm;
        hargamakanan = hm;

        System.out.println("object " + namamakanan + " dibuat");
    }

    //2. Setter---->Mengisi Data
    public void setnamamakanan(String nm) {
        namamakanan = nm;
    }

    public void sethargamakanan(int hm) {
        hargamakanan = hm;
    }

    //3. Getter---->Mengambil/melihat Data
    public String getnamamakanan() {
        return namamakanan;
    }

    public int gethargamakanan() {
        return hargamakanan;
    }

    //4.toString
    public String isiDatamakanan() {
        return " " + namamakanan + "        [" + hargamakanan + " ]";
    }

}
