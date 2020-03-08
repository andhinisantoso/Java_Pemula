package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // latihan method
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("masukkan panjang : ");
        int inputPanjang = userInput.nextInt();
        System.out.print("masukkan lebar : ");
        int inputLebar = userInput.nextInt();
        
        gambar(inputPanjang, inputLebar);

        System.out.println("luas = " + luas(inputPanjang, inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang, inputLebar));
        
    }
    
    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    private static int luas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
    
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    
    
}
