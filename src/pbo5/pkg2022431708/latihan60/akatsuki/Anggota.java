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
public class Anggota extends Akatsuki {
    
    protected String anggota;
    
    
    public Anggota(String nama, String kianAkatsuki, String pasangan){
        super(nama, kianAkatsuki, pasangan);
        this.nama = nama;
        this.kianAkatsuki = kianAkatsuki;
        this.pasangan = pasangan;
    }
    
    public String getAnggota(){
        return anggota;
    }
    
    public void setAnggota(String anggota){
        this.anggota = anggota;
    }
    
}
