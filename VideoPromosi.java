/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public class VideoPromosi extends Video implements DapatDipromosikan{
    //constructor
    public VideoPromosi(String id, String namaFile, double ukuranMB, double durasi) {
        super(id, namaFile, ukuranMB, durasi);
    }
    
    //Override method
    @Override
    public void promosikan() {
        System.out.println("Video bertajuk '" + namaFile + "' dapat dipromosikan.");
    }
}
