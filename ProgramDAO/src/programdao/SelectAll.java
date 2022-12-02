/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programdao;

import java.util.List;

/**
 *
 * @author ACER
 */
public class SelectAll {
    public static void main(String[] args) {
    fasilitas perintah = new fasilitas();
    List <Barang> list = perintah.SelectAll();
    for(Barang barang : list){
    System.out.println(barang.getKode_barang());
    System.out.println(barang.getNama_barang());
    System.out.println(barang.getJumlah());
    System.out.println(barang.getHarga());
    System.out.println("-------------------------");
 }
    }
    
}


