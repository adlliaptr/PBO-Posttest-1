/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;
import java.util.ArrayList;

/**
 *
 * @author Asus-GK
 */
public class Posttest1 {
    public static void main(String[] args) {
        Restoran pembeli1 = new
Restoran("'Nasi Goreng'","'Adel'",25000);
        Restoran pembeli2 = new
Restoran("'Seblak'","'Cesa'",15000);
        Restoran pembeli3 = new
Restoran("'Lalapan Ayam'","'Lisya'",30000);
        Restoran pembeli4 = new
Restoran("'Nasi Padang'","'Kafilah'",18000);
        Restoran pembeli5 = new
Restoran("'Ayam Krispy'","'Juventia'",10000);
        
        ArrayList<Restoran> buyers = new ArrayList<>();
        buyers.add(pembeli1);
        buyers.add(pembeli2);
        buyers.add(pembeli3);
        buyers.add(pembeli4);
        buyers.add(pembeli5);
        
        for (Restoran dataPembeli: buyers) {
            String makanan = dataPembeli.menuMakanan;
            String nama = dataPembeli.namaPembeli;
            int harga = dataPembeli.hargaMakanan;
            System.out.println("Menu :"+makanan+"|"+"Nama Pembeli :"+nama+"|"+"Harga Makanan"+harga);
        }
    }
}
