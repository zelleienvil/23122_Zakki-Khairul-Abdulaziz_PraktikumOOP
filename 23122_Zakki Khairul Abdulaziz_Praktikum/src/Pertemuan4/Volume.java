/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

public class Volume extends Luas {
    int t;
    
    public Volume(int p, int l,int t){
        super(p,l);
        this.t = t;
    }
    
    public Volume(int p){
        super(p);
    }
    
    @Override
    public int balok(){
        return p*l*t;
    }
    
    @Override
    public int kubus(){
        return p*p*p;
    }
}
