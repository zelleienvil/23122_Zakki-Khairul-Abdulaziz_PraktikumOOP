/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class IMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan (kg): ");
        int bb = input.nextInt();
        System.out.print("Masukkan tinggi badan (m): ");
        double tb = input.nextDouble();
        
        double imt = bb /(tb*tb);
        String kriteria;
        if(imt>=40){
            kriteria = "Sangat Gemuk";
        }else if(imt>=30){
            kriteria = "Gemuk";
        }else if(imt>=25){
            kriteria = "Berat Badan Lebih";
        }else if(imt>=18.5){
            kriteria = "Berat Badan Ideal";
        }else{
            kriteria = "Berat Badan Kurang";
        }
        DecimalFormat df = new DecimalFormat("#.#");
        String imt1 = df.format(imt);
        System.out.println("IMT Anda: "+imt1);
        System.out.println("Kriteria: "+kriteria);
    }
    
}
