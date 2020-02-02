package com.tutorial;

/**
 *
 * @author Andhika
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Operasi Aritmatika
        
        int var1 = 5;
        int var2 = 3;
        
        int hasil;

        //1. Penjumlahan
        
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
        
        //2. Pengurangan
        
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1, var2, hasil);
        
        //3. Perkalian
        
        hasil = var1 * var2;
        System.out.printf("%d * %d = %d \n", var1, var2, hasil);
        
        //4. Pembagian
        
        hasil = var1 / var2;
        System.out.printf("%d / %d = %d \n", var1, var2, hasil);
        
        //5. Modulus
        
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d \n", var1, var2, hasil);
        
    }
}
