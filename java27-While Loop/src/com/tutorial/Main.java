package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
     
        // while looping
        
        int a = 0;
        boolean kondisi = true;
        System.out.println("Awal program");
        
        while (kondisi) {
            System.out.println("while loop ke-" + a);
            a++;
            
            if ( a==10 ){
                kondisi = false;
            }
        }
        
        System.out.println("Awal program");
        
    }
}
