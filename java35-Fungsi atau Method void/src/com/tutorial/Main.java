package com.tutorial;


public class Main {
    public static void main(String[] args) {
        
        // void = hampa atau kosong (tipe data kosong) sehingga tidak butuh return
        
        System.out.println(simple());
        fungsiVoid("Apapun");
        selamatPagi("emak");
    }
    
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }
    
    // method dengan return (kembalikan nilai)
    private static float simple(){
        return 10.0f;
    }
    
    // method tanpa return
    // mendelegasikan sebuah aksi tanpa mengambil nilai
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    
}
