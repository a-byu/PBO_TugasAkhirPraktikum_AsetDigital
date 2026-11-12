/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasakhirpraktikummanajemenasetdigital;

/**
 *
 * @author wajdie
 */
public interface DapatDipromosikan {
    //method abstract
    void promosikan();
    
    //method default
    default void infoPromosi() {
        System.out.println("Video ini sedang dipromosikan.");
    }
}
