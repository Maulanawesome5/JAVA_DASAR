package com.tutorial;

public class Main {

    public static void main(String[] args){
        double var1;
        double var2;
        double result;

        var1 = 23.34;
        var2 = 12.223;

        result = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + result); // 35.563

        result = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + result); // 11.116999999999999

        result = var1 * var2;
        System.out.println(var1 + " * " + var2 + " = " + result); // 285.28482

        result = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + result); // 1.90951484905506
    }

}
