/**
 * Write a description of class Tugas1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class Tugas1
{
    public static void main(String[] args) 
    {
        float a = 10, b = 5, penjumlahan, pengurangan, perkalian, pembagian;
        
        penjumlahan = a + b;
        pengurangan = a - b;
        perkalian = a * b;
        pembagian = a/b ;
        
        System.out.println("Isi variable a adalah "+a);
        System.out.println("Isi variable b adalah "+b);
        System.out.println("Hasil penjumlahan variable a dan b = "+penjumlahan);
        System.out.println("Hasil pengurangan variable a dan b = "+pengurangan);
        System.out.println("Hasil perkalian variable a dan b = "+perkalian);
        System.out.println("Hasil pembagian variable a dan b = "+pembagian);
    }
}
