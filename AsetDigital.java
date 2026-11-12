/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public abstract class AsetDigital {
    //atribut
    protected String id;
    protected String namaFile;
    protected double ukuranMB;
    
    //constructor
    public AsetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }
    
    //method abstract
    public abstract void tampilkanPreview();
    
    //method konkrit
    public void getInfo() {
        System.out.println("ID          : " + id);
        System.out.println("Nama File   : " + namaFile);
        System.out.println("Ukuran MB   : " + ukuranMB);
    }
}
