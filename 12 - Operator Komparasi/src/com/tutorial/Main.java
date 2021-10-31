package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Deklarasi variabel
        int a = 9;
        int b = 5;
        boolean hasil;

        // Operator Komparasi (Perbandingan)
        // lebih dari
        hasil = (a > b);
        System.out.printf("%d > %d = %b \n", a, b, hasil);

        // kurang dari
        hasil = (a < b);
        System.out.printf("%d < %d = %b \n", a, b, hasil);

        // lebih dari sama dengan
        hasil = (a >= b);
        System.out.printf("%d >= %d = %b \n", a, b, hasil);

        // kurang dari sama dengan
        hasil = (a <= b);
        System.out.printf("%d <= %d = %b \n", a, b, hasil);

        // sama dengan
        hasil = (a == b);
        System.out.printf("%d == %d = %b \n", a, b, hasil);

        // tidak sama dengan
        hasil = (a != b);
        System.out.printf("%d != %d = %b \n", a, b, hasil);
    }
}
