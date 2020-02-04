package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        
//        int input = userInput.nextInt();
//        System.out.println("input = " + input);
//        
//        int input2 = userInput.nextInt();
//        System.out.println("input2 = " + input2);
        
        // Menghitung luas persegi panjang
        // Luas = panjang * lebar;
        
        System.out.println("MENGHITUNG LUAS\n");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas = " + luas + "\n");
        
        System.out.println("MENGHITUNG VOLUME\n");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("Volume = " + volume);
        
        
        
        
    }
}
