package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // ternary operator
             
        int input, x;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("masukkan nilai : ");
        input = inputUser.nextInt();
        System.out.println(input);
        
        // variable x = ekspresi ? statement true : statement false
        
        x = ( input==10 ) ? (input*input) : (input/2);
        System.out.println("hasil x = " + x);
        
    }
}
