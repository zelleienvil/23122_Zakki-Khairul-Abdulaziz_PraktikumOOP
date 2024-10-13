/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author kurohana
 */
public class No_1a {
    // method untuk mengecek bilangan prima
    public static boolean isPrima(int n) {
        // bilangan prima harus lebih dari 1
        if (n <= 1) {
            return false;
        }
        // bilangan prima hanya boleh dibagi 1 dan bilangan itu sendiri
        for (int j = 2; j * j <= n; ++j) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // menampilkan bilangan prima
        System.out.print("Bilangan prima dari 0 - 20: ");
        for(int i = 0; i <= 20; ++i){
            // mengecek bilangan prima dan ditampilkan
            if(isPrima(i)){
                System.out.print(i + " ");
            }
        }
        // menampilkan bilangan bukan prima
        System.out.print("\nBilangan bukan prima dari 0 - 20: ");
        for(int i = 0; i <= 20; ++i){
            // mengecek bilangan bukan prima dan ditampilkan
            if(!isPrima(i)){
                System.out.print(i + " ");
            }
        }
    }
    
}
