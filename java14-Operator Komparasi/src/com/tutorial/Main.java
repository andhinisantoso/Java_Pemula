package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // Operator komparasi akan menghasilkan nilai dalam bentuk boolean
        
        int a,b;
        boolean hasilKomparasi;
        
        // operator equal atau persamaan
        System.out.println("===PERSAMAAN===");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);
        
        // operator not equal atau persamaan
        System.out.println("===PERTIDAKSAMAAN===");
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);
        
        // operator less atau kurang dari
        System.out.println("===KURANG DARI===");
        a = 80;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);
        
        // operator greater than atau lebih dari
        System.out.println("===LEBIH DARI===");
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);
        
        // operator greater than equal atau lebih dari
        System.out.println("===LEBIH DARI SAMA DENGAN===");
        a = 12;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);
        
    }
}
