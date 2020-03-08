package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        int a = 0;
        boolean kondisi = true;
        
        // do while loop
        
        System.out.println("Awal program");
        
        do {
            
            a++;
            System.out.println("Do While ke-" + a);
            
            if ( a==10 ){
                kondisi = false;
            }
            
        } while (kondisi);
        
        System.out.println("Akhir program");
        
    }
}
