/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kurohana
 */
public class Mahasiswa {
    private String nim, nama, alamat, mataKuliah;
    private double nilaiAkhir;
    
    public Mahasiswa(String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNIM(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getMatKul(){
        return mataKuliah;
    }
    public double getNilaiAkhir(){
        return nilaiAkhir;
    }
}
