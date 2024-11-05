/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;
import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // mendeklarasi array untuk menyimpan data barang
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        
        // Input jumlah item yang dibeli
        System.out.print("Masukkan Item Barang : ");
        int jumlahItem = input.nextInt();
        
        // Array untuk menyimpan data pembelian
        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        String[] namaBeli = new String[jumlahItem];
        int[] hargaBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];
        
        // Input data pembelian
        for (int i = 0; i < jumlahItem; i++) {
            boolean kodeValid = false;
            
            do {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan Kode\t\t: ");
                String inputKode = input.next();
                
                // Memvalidasi kode barang agar bisa dihitung harganya
                for (int j = 0; j < kodeBarang.length; j++) {
                    if (inputKode.equals(kodeBarang[j])) {
                        kodeBeli[i] = inputKode;
                        namaBeli[i] = namaBarang[j];
                        hargaBeli[i] = hargaBarang[j];
                        kodeValid = true;
                        break;
                    }
                }
                
                if (!kodeValid) {
                    System.out.println("Kode barang tidak valid! Kode yang tersedia: a001, a002, a003");
                }
            } while (!kodeValid);
            
            System.out.print("Masukkan jumlah Beli\t: ");
            jumlahBeli[i] = input.nextInt();
            
            // Menghitung jumlah bayar
            jumlahBayar[i] = hargaBeli[i] * jumlahBeli[i];
        }
        
        // Output
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + "\t" + 
                             kodeBeli[i] + "\t    " + 
                             namaBeli[i] + "\t" + 
                             hargaBeli[i] + "\t    " + 
                             jumlahBeli[i] + "\t\t" + 
                             jumlahBayar[i]);
            totalBayar += jumlahBayar[i];
        }
        
        System.out.println("===============================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
        
    }
}