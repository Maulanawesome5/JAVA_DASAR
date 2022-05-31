package com.tutorial;

public class Main {

    public static void main(String[] args){
        /*
         * Membuat FizzBuzz
         * menggunakan loop Switch Case
        */
        for (int i = 1; i <= 100; i++) {
            switch (i % 35) {
                case 0 -> System.out.println(i + " FizzBuzz");
                case 5, 10, 15, 20, 25, 30 -> System.out.println(i + " Fizz");
                case 7, 14, 21, 28 -> System.out.println(i + " Buzz");
                default -> System.out.println(i + " ");
                /* Bentuk 'Java Switch Case' yang otomatis di koreksi */
            }
        }
    }
}
