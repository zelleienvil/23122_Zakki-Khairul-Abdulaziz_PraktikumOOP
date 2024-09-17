/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

public class Mahasiswa {
    String nama;
    
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    public void membaca(){
        System.out.println(nama + " sedang membaca.");
    }
    
    public void nyontek(){
        System.out.println(nama + " sedang menyontek.");
    }
    
    public void modifikasi(){
        System.out.println(nama + " sedang memodifikasi.");
    }
}
