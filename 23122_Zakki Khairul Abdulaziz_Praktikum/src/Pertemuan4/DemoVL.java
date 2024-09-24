/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

public class DemoVL {
    public static void main(String[] args) {
        Luas PP = new Luas(5,7);
        Luas Persegi = new Luas(4);
        Volume Balok = new Volume(5,7,6);
        Volume Kubus = new Volume(4);
        
        System.out.println("Luas Permukaan Balok: "+PP.balok());
        System.out.println("Luas Permukaan Kubus: "+Persegi.kubus());
        System.out.println("Volume Balok: "+Balok.balok());
        System.out.println("Volume Kubus: "+Kubus.kubus());
    }
    
}
