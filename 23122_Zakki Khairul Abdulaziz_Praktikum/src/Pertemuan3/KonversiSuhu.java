/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

public class KonversiSuhu {
    public void celciusToFahrenheit(double C) {
        double F = (C*9/5)+32;
        System.out.println("Konversi suhu "+C+"C = "+F+"F");
    }
    
    public void celciusToReamur(double C) {
        double R = C*4/5;
        System.out.println("Konversi suhu "+C+"C = "+R+"R");
    }
}
