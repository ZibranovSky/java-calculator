/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import java.util.Scanner;

/**
 *
 * @author Hibiki Chan
 */
import java.util.Scanner;

public class Javacalculator {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
              Scanner angka1, angka2, simbol;
        
        angka1 = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        
        String Angka1read = angka1.nextLine();
        
        int angka1Convert = Integer.parseInt(Angka1read);
        
        angka2 = new Scanner(System.in);
        System.out.println("Masukkan angka kedua : ");
        
        String Angka2read = angka2.nextLine();
        
        int angka2Convert = Integer.parseInt(Angka2read);
        
        simbol = new Scanner(System.in);
        System.out.println("simbol hitung");
        
        String simbolRead = simbol.nextLine();
        
        switch(simbolRead){
            case "+":
                int hasiljumlah = angka1Convert + angka2Convert;
                System.out.println("hasilnya adalah " + hasiljumlah);
                break;
            case "-":
                int hasilkurang = angka1Convert - angka2Convert;
                System.out.println("hasilnya adalah " + hasilkurang);
                break;
            case "/":
                int hasilbagi = angka1Convert / angka2Convert;
                System.out.println("hasilnya adalah " + hasilbagi);
                break;
            case "*":
                int hasilkali = angka1Convert * angka2Convert;
                System.out.println("hasilnya adalah " + hasilkali);
                break;
            default:
                System.out.println("Mohon masukkan simbol yang benar !!");
                break;
        }
    }
    
}
