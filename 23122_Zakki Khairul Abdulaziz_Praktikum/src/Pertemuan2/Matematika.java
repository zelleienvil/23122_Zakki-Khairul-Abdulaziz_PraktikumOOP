/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

public class Matematika implements InterfaceMat {
    @Override
    public void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil "+a+"+"+b+" = " +hasil);
    }
    
    @Override
    public void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil "+a+"-"+b+" = " +hasil);
    }
    
    @Override
    public void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil "+a+"*"+b+" = " +hasil);
    }
    
    @Override
    public void pembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("Hasil "+a+"/"+b+" = " +hasil);
    }
}
