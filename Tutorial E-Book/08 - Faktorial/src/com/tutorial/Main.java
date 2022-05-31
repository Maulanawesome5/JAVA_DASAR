package com.tutorial;
import java.lang.IllegalArgumentException;

public class Main {

    // Function factorial dengan cara iterasi
    public static int factorial_iteration(int x){
        if (x < 0)
            throw new IllegalArgumentException("x harus >= 0");

        int fact = 1;

        for (int i = 2; i <= x; i++)
            fact *= i;

        return fact;
    }

    // Function factorial dengan cara rekursif
    public static long factorial_recursive(long x){
        if (x < 0)
            throw new IllegalArgumentException("x harus >= 0");
        if (x <= 1)
            return 1;
        else
            return x * factorial_recursive(x-1);
    }

    // Main function atau program utama
    public static void main(String[] args){
        int x = 10;

        System.out.println("Hasil factorial_iteration dari " + x + factorial_iteration(x));
        System.out.println("Hasil factorial_recursive dari " + x + factorial_recursive(x));
    }
}


