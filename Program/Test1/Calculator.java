
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.Scanner;

public class Calculator
{
    public static void main (String [] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Input A : ");
        float A = input.nextInt();
        System.out.print("Input B : ");
        float B = input.nextInt();
        
        do{
            System.out.print("Menu : \n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
            int InputUser = input.nextInt();
            
            switch (InputUser) {
                case(1) : 
                    float penjumlahan = A + B;
                    System.out.println("Hasil penjumlahan variable A dan B = "+penjumlahan);
                    break;
                case(2) : 
                    float pengurangan = A - B;
                    System.out.println("Hasil pengurangan variable A dan B = "+pengurangan);
                    break;
                case(3) : 
                    float perkalian = A * B;
                    System.out.println("Hasil perkalian variable A dan B = "+perkalian);
                    break;
                case(4) : 
                    float pembagian = A/B;
                    System.out.println("Hasil pembagian variable a dan b = "+pembagian);
                    break;
                default : System.out.println("Input yang anda masukan invalid ");
            }
            
            System.out.println("Apakah anda ingin mengulang program ?(ketik 1)");
            x = input.nextInt();
    
        }while (x == 1);  
    }
}
