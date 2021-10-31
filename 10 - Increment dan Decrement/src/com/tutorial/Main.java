package com.tutorial;

public class Main {
    
    public static void main(String[] args){
        //Unary Operations adalah operasi yang dilakukan pada satu variabel
        //Operator Unary yang adalah operator yang biasa dipakai untuk
        //Increment dan Decrement

        // 1. Operator unary (+) dan (-)
        int a = 1;
        System.out.println("Angka 1 = " + a + ", Unary (-) = " + -a);
        System.out.println("Angka 1 = " + a + ", Unary (+) = " + +a);
        System.out.println("\n");

        // 2. Operator unary increment(++) dan decrement(--)
        int b = 5;
        System.out.print("Angka = " + b);

        //Pre increment
        System.out.println(", Pre increment (++b) = " + ++b);
        System.out.println("--> Hasil pre increment = " + b);

        //Post increment
        b = 5; //Menimpa variabel b menjadi 5 lagi
        System.out.print("Angka = " + b);
        System.out.println(", Post increment (b++) = " + b++);
        System.out.println("--> Hasil post increment = " + b);
        System.out.println("\n");

        // 2. Operator unary increment(++) dan decrement(--)
        int c = 10;
        System.out.print("Angka = " + c);

        //Pre decrement
        System.out.println(", Pre decrement (--c) = " + --c);
        System.out.println("--> Hasil pre decrement = " + c);

        //Post decrement
        c = 10; //Menimpa variabel c menjadi 10 lagi
        System.out.print("Angka = " + c);
        System.out.println(", Post decrement (c--) = " + c--);
        System.out.println("--> Hasil post decrement = " + c);
        System.out.println("\n");

        // 3. Operator unary NOT (!) untuk data boolean
        boolean data = true;
        System.out.println("Data bool = " + data);
        System.out.println("Data bool = " + !data);

    }
}
