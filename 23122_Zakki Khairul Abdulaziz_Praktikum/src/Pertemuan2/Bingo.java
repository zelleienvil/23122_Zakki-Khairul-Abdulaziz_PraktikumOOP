/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

public class Bingo {
    String clap;

    public Bingo(String clap){
        this.clap = clap;
    }
    
    public void ulangBingo (){
        for (int i = 0; i <= 5; i++){
            System.out.println("There was a farmer who had a dog,\nAnd Bingo was his name-o.");
            for (int j = 0; j < 3; j++ ){
                if(i<=0){
                    System.out.println("B-I-N-G-O");
                }else if(i<=1){
                    System.out.println(clap+"-"+"I-N-G-O");
                }else if(i<=2){
                    System.out.println(clap+"-"+clap+"-"+"N-G-O");
                }else if(i<=3){
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+"G-O");
                }else if(i<=4){
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+clap+"-"+"O");
                }else{
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+clap+"-"+clap); 
                }
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}