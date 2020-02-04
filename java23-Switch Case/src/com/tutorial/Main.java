package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // switch case
        String input;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Panggil nama: ");
        input = inputUser.next();
        System.out.println(input);
        
        switch(input){
            case "otong" :
                System.out.println("Saya hadir Boss");
                break;
            case "ucup" :
                System.out.println("Saya hadir Boss");
                break;
            case "mario" :
                System.out.println("Saya hadir Boss");
                break;
            default :
                System.out.println("Tidak hadir Boss");
        } 
    }
}
