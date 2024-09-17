/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author kurohana
 */
public class Nilai {
    public String nama, nim;
    public double absen, tugas, uts, uas, akhir;
    
    public void Nilai(){
        absen *= 0.1;
        tugas *= 0.2;
        uts *= 0.3;
        uas *= 0.4;
        akhir = absen + tugas + uts + uas;
    }
    
    double NilaiAkhir(){
        return akhir = (absen *= 0.1) + (tugas *= 0.2) + (uts *= 0.3) + (uas *= 0.4);
    }
    
    public void cetakNilai(){
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Nilai Absen (10%)   : " + absen);
        System.out.println("Nilai Tugas (20%)   : " + tugas);
        System.out.println("Nilai UTS (30)      : " + uts);
        System.out.println("Nilai UAS (40)      : " + uas);
        System.out.println("Nilai Akhir         : " + akhir);
    }
}
