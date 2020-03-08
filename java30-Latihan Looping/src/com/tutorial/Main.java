package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // latihan looping
        int total, nilaiAwal, nilaiAkhir, i;
        
        Scanner inputUser;
        inputUser = new Scanner(System.in);
     
        System.out.print("Nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        // while loop
        total = 0;
        while ( nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        
    }
}
