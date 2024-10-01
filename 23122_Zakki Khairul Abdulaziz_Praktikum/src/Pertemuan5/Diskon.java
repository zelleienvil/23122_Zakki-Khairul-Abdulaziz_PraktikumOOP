/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Total pembelian = Rp.");
    int totalPembelian = input.nextInt();
    int diskon;
    if(totalPembelian >= 50000){
      diskon = totalPembelian * 20 / 100;  
    }else{
        diskon = totalPembelian * 5 / 100;
    }
    
    System.out.println("Besarnya potongan Rp."+diskon);
    System.out.println("Jumlah yang harus dibayarkan Rp."+(totalPembelian-diskon));
    }
    
}
