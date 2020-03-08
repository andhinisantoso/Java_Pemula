package com.tutorial;


public class Main {
    public static void main(String[] args) {
        
        // fungsi atau method
        int x, y;
        
        x = 5;
        y = hitung(x); 
        System.out.println("x = " + x + ", y = " + y);
        
        x = 15;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        
        x = 40;
        y = hitung(x); 
        System.out.println("x = " + x + ", y = " + y);
        
    }
        static int hitung(int input){
            int hasil;
            hasil = (input + 2) * input;
            return hasil;
        }
}

