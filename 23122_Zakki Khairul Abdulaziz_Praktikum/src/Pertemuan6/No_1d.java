/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author kurohana
 */
public class No_1d {
    public static void main(String[] args) {
        System.out.println("Lagu Anak Ayam: \n");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        for(int i = 4; i > 0; i--){
            System.out.println("Anak ayam turunlah " + i);
            if(i == 1){
                System.out.println("Mati satu tinggallah induknya");
            }else{
                System.out.println("Mati satu tinggallah " + (i-1));
            }
            if(i == 3){
                for(int j = 1; j <= 2; j++){
                    System.out.println("Tek kotek, kotek kotek");
                    System.out.println("Anak ayam turunlah berkotek");
                }
            }
        }
    }
    
}
