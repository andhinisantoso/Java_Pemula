package com.tutorial;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        // Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);
        
        // program untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah = " + nilaiTebakan);
        
        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda " + statusTebakan);
        
        // operasi aljabar boolean
        System.out.print("Masukkan nilai diantara nilai 4 dan 9 : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9) && (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda " + statusTebakan);
        
        
    }
}
