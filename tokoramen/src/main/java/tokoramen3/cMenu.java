/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoramen3;

/**
 *
 * @author Jihan
 */
public class cMenu {

    private String nama;
    private int harga;
    

    //method
    //1.Constructor---->Istimewa
    cMenu() {
        nama = "";
        harga = 0;

        System.out.println("Object menu dibuat..");

    }

    cMenu(String nm, int hm) {
        nama = nm;
        harga = hm;

        System.out.println("object " + nama + " dibuat");
    }

    //2. Setter---->Mengisi Data
    public void setnama(String nm) {
        nama = nm;
    }

    public void setharga(int hm) {
        harga = hm;
    }

    //3. Getter---->Mengambil/melihat Data
    public String getnama() {
        return nama;
    }

    public int getharga() {
        return harga;
    }

    //4.toString
    public String isiData() {
        return " " + nama + "        [" + harga + " ]";
    }

}
