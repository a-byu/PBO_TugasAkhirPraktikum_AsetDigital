/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        //membuat objek dalam arraylist
        ArrayList<AsetDigital> asetList = new ArrayList<>();
        asetList.add(new Gambar("G001", "Sunset di Kawah Ijen", 23, "1080p"));
        asetList.add(new Video("V001", "Promosi Pariwisata Kawah Ijen", 586, 900));
        asetList.add(new Dokumen("D001", "Perizinan Pariwisata Kawah Ijen", 15, 32));
        asetList.add(new VideoPromosi("V002", "Perkenalkan, Kawah Ijen!", 72, 180));
        
        //menampilkan objek
        System.out.println("====== DAFTAR ASET DIGITAL ======");
        for (AsetDigital a : asetList) {
            a.getInfo();
            a.tampilkanPreview();
            
            //mengecek objek apakah dapat dipromosikan
            if (a instanceof DapatDipromosikan) {
                DapatDipromosikan dp = (DapatDipromosikan) a;
                dp.promosikan();
                dp.infoPromosi();
            }
            System.out.println("---------------------");
        }
        
        System.out.println("====== KELOMPOK VIDEO PROMOSI ======");
        ArrayList<DapatDipromosikan> promosiList = new ArrayList<>();
        promosiList.add(new VideoPromosi("V003", "Dokumentasi Keindahan Kawah Ijen", 89, 360));
        
        for (DapatDipromosikan d : promosiList) {
            d.promosikan();
            d.infoPromosi();
        }
    }
}
