package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // break, continue dan return (control flow)
        
        int a = 0;
        
        while(true){
            a++;
            
            if ( a== 10){
                break; // keyword keluar dari loop
            }else if( a==5 ){
                continue; // keyword skip
            }else if( a==7 ){
                return; // keluar dari psvm
            }
            
            System.out.println("looping ke-" + a);
            
        }
        System.out.println("akhir aksi"); 
        
    }
}
