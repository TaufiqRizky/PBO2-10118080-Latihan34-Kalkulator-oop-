/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan34.kalkulator.oop;

import java.util.Scanner;

/**
 *
 * @author Trizky
 */
public class PBO210118080Latihan34KalkulatorOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        
        System.out.print("Masukan Angka ke-1 :");
        Scanner a = new Scanner(System.in);
        kal.value1=a.nextDouble();
        
        System.out.print("Masukan Angka ke-2 :");
        Scanner b = new Scanner(System.in);
        kal.value2=b.nextDouble();
        
    

        System.out.println("");
        System.out.println("Hasil Pertambahan\t: "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan\t: "+kal.kurangBilangan());
        System.out.println("Hasil Perkalian\t\t: "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian\t\t: "+kal.bagiBilangan());
        System.out.println("Hasil Sisa\t\t: "+kal.sisaBilangan());
    }
    
}
