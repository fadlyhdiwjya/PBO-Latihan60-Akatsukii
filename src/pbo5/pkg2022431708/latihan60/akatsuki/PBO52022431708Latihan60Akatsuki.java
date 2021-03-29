/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan60.akatsuki;

/**
 *
 * @author HP
 */
public class PBO52022431708Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
        /**
     * @param args the command line arguments
     */
       /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan gaji Karyawan
 *
 */
    public static void main(String[] args) {

        // TODO code application logic here
        Pemimpin p = new Pemimpin("pain", "Wowo", "Kiwo");
        p.tampilAnggota();
        p.setPemimpin("Pemimpin");
        System.out.println("Di akatsuki sebagai "+p.getPemimpin());
        
        Anggota a = new Anggota("wawa","kina","widi");
        a.setAnggota("Anggota");
        a.tampilAnggota();
        System.out.println("Di akatsuki sebagai "+a.getAnggota());

    }

}
