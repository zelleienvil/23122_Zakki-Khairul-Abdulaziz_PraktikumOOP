/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

public class KonversiSuhu2 extends KonversiSuhu {
    public void fahrenheitToReamur(double F) {
        double R = (F-32)*4/9;
        System.out.println("Konversi suhu "+F+"F = "+R+"R");
    }
}
