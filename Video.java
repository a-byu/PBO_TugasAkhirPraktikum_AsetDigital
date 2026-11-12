/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public class Video extends AsetDigital{
    //atribut
    private double durasi;
    
    //constructor
    public Video(String id, String namaFile, double ukuranMB, double durasi) {
        super(id, namaFile, ukuranMB);
        this.durasi = durasi;
    }
    
    //Override method abstract
    @Override
    public void tampilkanPreview() {
        System.out.println("Durasi      : " + durasi);
    }
}
