/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programdao;

/**
 *
 * @author ACER
 */
public class Update {
    public static void main(String[] args) {
    fasilitas perintah = new fasilitas();
    Barang atk = new Barang();
    atk.setKode_barang("B002");
    atk.setNama_barang("Kamus");
    atk.setJumlah(20);
    atk.setHarga(30000);
    perintah.update(atk);
    }
    
}


