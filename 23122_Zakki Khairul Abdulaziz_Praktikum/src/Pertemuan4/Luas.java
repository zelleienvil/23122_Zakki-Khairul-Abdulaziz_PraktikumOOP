/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

public class Luas {
    int p,l;
    
    public Luas(int p, int l) {
        this.p = p;
        this.l = l;
    }
    
    public Luas(int p) {
        this.p = p;
    }
    
    public int balok(){
        return p*l;
    }
    
    public int kubus(){
        return p*p;
    }
}
