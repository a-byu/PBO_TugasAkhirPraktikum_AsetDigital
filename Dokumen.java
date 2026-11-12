/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public class Dokumen extends AsetDigital{
    //atribut
    private int jumlahHalaman;
    
    //constructor
    public Dokumen(String id, String namaFile, double ukuranMB, int jumlahHalaman) {
        super(id, namaFile, ukuranMB);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    //Override method abstrcat
    @Override
    public void tampilkanPreview() {
        System.out.println("Jumlah Halaman  : " + jumlahHalaman);
    }
}
