/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan56.umurbarangantik;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilkan nama dan umur barang antik
 */
public class PBOIF210119077Latihan56UmurBarangAntik {

    
    public static void main(String[] args) {
        Radio objRadio = new Radio(234);
        objRadio.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : "+objRadio.getName());
        objRadio.tampilUmur();
    }
    
}
