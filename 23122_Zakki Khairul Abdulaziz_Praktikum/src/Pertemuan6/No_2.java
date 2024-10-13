/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;
import java.util.Scanner;

/**
 *
 * @author kurohana
 */
public class No_2 {
    public static void tabelPerkalian(int n){
        for(int i = 0; i <= n; i++){
            // membuat tampilan kosong untuk kolom pertama baris pertama dengan
            if(i == 0){
                System.out.print("   ");
                for (int j = 1; j <= n; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            } else {
                // menampilkan judul kolom dengan angka yang akan dikalikan
                System.out.print(i + "  ");
                // menampilkan hasil perkalian
                for (int j = 1; j <= n; j++){
                    System.out.print(j*i + " ");
                }
                System.out.println();
            }   
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean tabel = true;
        do{
            // membuat input ukuran tabel
            System.out.print("Berapa ukuran tabel yang anda inginkan (1-10): ");
            int n = input.nextInt();
            // meminta user untuk menginput ulang angka jika angka salah
            if(n > 10 || n <= 0){
                System.out.println("Anda memasukkan angka yang salah. Silahkan masukkan ulang angka!");
                tabel = false;
            }else{
                // menampilkan tabel 
                tabelPerkalian(n);
                tabel = true;
            }
        }while(tabel == false);
    }
}
