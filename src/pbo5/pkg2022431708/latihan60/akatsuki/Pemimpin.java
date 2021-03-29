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
public class Pemimpin extends Akatsuki {
    
    protected String peminpin;
    
    public Pemimpin(String nama, String kianAkatsuki, String pasangan){
        super(nama, kianAkatsuki, pasangan);
        this.nama = nama;
        this.kianAkatsuki = kianAkatsuki;
        this.pasangan = pasangan;
    }
    
    public void setPemimpin(String pemimpin){
        this.peminpin = pemimpin;
    }
    
    public String getPemimpin(){
        return peminpin;
    }
    
}
