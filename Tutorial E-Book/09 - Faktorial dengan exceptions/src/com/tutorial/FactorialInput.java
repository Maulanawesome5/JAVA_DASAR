package com.tutorial;

public class FactorialInput {
    // Function factorial dengan cara rekursif
    public static long factorial_recursive(long x){
        int fact = 1;

        if (x < 0){
            throw new IllegalArgumentException("x harus >= 0");
        }
        for (int i = 2; i <= x; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(x + "! = " + factorial_recursive(x));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Anda harus menentukan nilai argumennya! ");
            System.out.println("Usage: java Main <number>");
        }
        catch (NumberFormatException e){
            System.out.println("Nilai argumen harus integer");
        }
        catch (IllegalArgumentException e){
            System.out.println("Bad argument: " + e.getMessage());
        }
    }
}
