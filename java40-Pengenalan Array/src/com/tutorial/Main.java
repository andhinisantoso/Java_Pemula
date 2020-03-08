package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Array 
        // tipedata[] nama = { x1, x2,..., xn }
        
        // assignment
        System.out.println("=== Assignment Array ===");
        int[] arrayInteger = {1, 2, 3, 4};
        
        for(int i = 0; i < 4; i++){
            System.out.println(arrayInteger[i]);
        }
        
        // deklarasi
        // tipedata[] nama = new Int[jumlah_array];
        System.out.println("=== Deklarasi Array ===");
        float[] arrayFloat = new float[5];
        
        arrayFloat[3] = 11.6f;
        
        for(int j = 0; j < 5; j++){
            System.out.println(arrayFloat[j]);
        }
        
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
        
    }
}
