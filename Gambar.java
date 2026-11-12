/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public class Gambar extends AsetDigital{
    //atribut
    private String resolusi;
    
    //constructor
    public Gambar(String id, String namaFile, double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB);
        this.resolusi = resolusi;
    }
    
    //Override method abstract
    @Override
    public void tampilkanPreview() {
        System.out.println("Resolusi    : " + resolusi);
    }
}
