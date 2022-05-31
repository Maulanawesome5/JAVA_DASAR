package com.tutorial;

public class Main {
    public static void main(String[] args){
        /*
         * game FizzBuzz
         * Angka yang habis di modulus 5 dan habis di modulus 7 = FizzBuzz
         * Angka yang habis di modulus 5 = Fizz
         * Angka yang habis di modulus 7 = Buzz
         */

        for (int i = 1; i <= 100; i++) {

            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println(i + " FizzBuzz");
            else if ((i % 5) == 0)
                System.out.println(i + " Fizz");
            else if ((i % 7) == 0)
                System.out.println(i + " Buzz");
            else
                System.out.print(i);

            System.out.println(" ");
        }
        System.out.println();
    }
}
