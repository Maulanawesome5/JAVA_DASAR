package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Deklarasi variabel
        boolean a;
        boolean b;
        boolean hasil;

        // Operator logika (boolean)
        // OR
        System.out.println("===== OR =====");
        a = true;
        b = true;
        hasil = a || b;
        System.out.println(a + " OR " + b + " = " + hasil);

        a = true;
        b = false;
        hasil = a || b;
        System.out.println(a + " OR " + b + " = " + hasil);

        a = false;
        b = true;
        hasil = a || b;
        System.out.println(a + " OR " + b + " = " + hasil);

        a = false;
        b = false;
        hasil = a || b;
        System.out.println(a + " OR " + b + " = " + hasil);

        // NOT


        // AND
        System.out.println("\n===== AND =====");
        a = true;
        b = true;
        hasil = a && b;
        System.out.println(a + " AND " + b + " = " + hasil);

        a = true;
        b = false;
        hasil = a && b;
        System.out.println(a + " AND " + b + " = " + hasil);

        a = false;
        b = true;
        hasil = a && b;
        System.out.println(a + " AND " + b + " = " + hasil);

        a = false;
        b = false;
        hasil = a && b;
        System.out.println(a + " AND " + b + " = " + hasil);

        // XOR
        System.out.println("\n===== XOR =====");
        a = true;
        b = true;
        hasil = a ^ b;
        System.out.println(a + " XOR " + b + " = " + hasil);

        a = true;
        b = false;
        hasil = a ^ b;
        System.out.println(a + " XOR " + b + " = " + hasil);

        a = false;
        b = true;
        hasil = a ^ b;
        System.out.println(a + " XOR " + b + " = " + hasil);

        a = false;
        b = false;
        hasil = a ^ b;
        System.out.println(a + " XOR " + b + " = " + hasil);

    }
}
