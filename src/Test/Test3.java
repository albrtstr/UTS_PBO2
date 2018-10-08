/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Transaksi;

/**
 *
 * @author basisa02
 */
public class Test3 {

    public static void main(String[] args) {
        // keluarannya
        // barang : buku
        // exception : Nama Barang lebih dari 25 karakter
        try {
            Transaksi trans1 = new Transaksi();
            trans1.setNamaBarang("buku");
            System.out.println("barang : " + trans1.getNamaBarang());
            Transaksi trans2 = new Transaksi();
            trans1.setNamaBarang("buku tulis kotak-kotak cap burung gelatik");
            System.out.println("barang : " + trans1.getNamaBarang());

        } catch (Exception ex) {
            System.out.println("exception : " + ex.getMessage());
        }

    }
}
