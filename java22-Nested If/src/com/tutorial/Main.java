package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // nested if (if bersarang)
        
        int a = 1;
        int b = 10;
        System.out.println("#Awal program");
        //awal percabangan
        if( a==5 ){
            if( b==10 ){
                System.out.println("Nilai a = 5, nilai b = 10");
            }else{
                System.out.println("Nilai a = 5, nilai b != 10");
            }
        }else{
            System.out.println("Nilai a dan b salah");
        }
        //akhir percabangan
        System.out.println("#Akhir program");
        
    }
}
