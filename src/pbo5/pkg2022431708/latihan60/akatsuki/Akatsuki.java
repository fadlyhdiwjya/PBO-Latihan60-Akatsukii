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
public class Akatsuki {
    
    protected String nama,kianAkatsuki,pasangan;
    
    public Akatsuki(String nama, String kianAkatsuki, String pasangan){
        this.nama = nama;
        this.kianAkatsuki = kianAkatsuki;
        this.pasangan = pasangan;
    }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Kian : "+kianAkatsuki);
        System.out.println("pasangan : "+pasangan);
    }
    
}
