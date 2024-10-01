/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

public class NilaiMahasiswa {
    Scanner input = new Scanner(System.in);
    private String npm,nama,keterangan;
    private double nilaiKehadiran,nilaiTugas,nilaiUTS,nilaiUAS,nilaiAkhir;
    private char grade;
    
    void npm(){
        System.out.print("NPM: ");
        npm = input.nextLine();
    }
    void nama(){
        System.out.print("Nama Mahasiswa: ");
        nama = input.nextLine();
    }
    void nilaiKehadiran(){
        System.out.print("Nilai Kehadiran: ");
        nilaiKehadiran = input.nextDouble();
    }
    void nilaiTugas(){
        System.out.print("Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
    }
    void nilaiUTS(){
        System.out.print("Nilai UTS: ");
        nilaiUTS = input.nextDouble();
    }
    void nilaiUAS(){
        System.out.print("Nilai UAS: ");
        nilaiUAS = input.nextDouble();
    }
    void nilaiAkhir(){
        nilaiAkhir = (nilaiKehadiran * 0.1)+(nilaiTugas * 0.2)+(nilaiUTS * 0.3)+(nilaiUAS * 0.4);
    }
    void grade(){
        if (nilaiAkhir>=76){
            grade = 'A';
        }else if(nilaiAkhir>=66){
            grade = 'B';
        }else if(nilaiAkhir>=56){
            grade = 'C';
        }else if(nilaiAkhir>=46){
            grade = 'D';
        }else{
            grade = 'E';
        }
    }
    
    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa();
        mhs.npm();
        mhs.nama();
        mhs.nilaiKehadiran();
        mhs.nilaiTugas();
        mhs.nilaiUTS();
        mhs.nilaiUAS();
        System.out.println("\nNPM: "+mhs.npm);
        System.out.println("Nama Mahasiswa: "+mhs.nama);
        System.out.println("Nilai Akhir: "+mhs.nilaiKehadiran);
        System.out.println("Grade: "+mhs.grade);
        System.out.println("Keterangan: "+mhs.nilaiUTS);
    }
    
}
