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
public class Insert {
    public static void main(String[] args) {
    Fasilitas perintah = new fasilitas();
    Barang atk = new Barang();
    atk.setKode_barang("B002");
    atk.setNama_barang("Buku Gambar");
    atk.setJumlah(12);
    atk.setHarga(3000);
    perintah.Insert(atk);
    }
    
}


