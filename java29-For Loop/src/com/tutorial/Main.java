package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // for loop
        System.out.println("Awal program");
        
        System.out.println("Loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++ ){
            
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Loop kedua");
        for (int nilai = 0; nilai < 10; nilai++ ){
            
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Loop ketiga");
        for (int nilai = 10; nilai >= 5; nilai-- ){
            
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Awal program");
        int nilai = 0;
        for (; nilai <= 10; nilai++ ){
            
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Akhir program");
    }
}
