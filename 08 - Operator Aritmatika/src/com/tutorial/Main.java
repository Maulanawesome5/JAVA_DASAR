package com.tutorial;

public class Main {

    public static void main(String[] args){
        //Operator Aritmatika
        int var1 = 5;
        int var2 = 3;
        int hasil;

        // 1. Penambahan
        hasil = var1 + var2;
        System.out.printf("%d + %d = %d", var1, var2, hasil);

        // 2. Pengurangan
        hasil = var1 - var2;
        System.out.printf("\n%d - %d = %d", var1, var2, hasil);

        // 3. Perkalian
        hasil = var1 * var2;
        System.out.printf("\n%d x %d = %d", var1, var2, hasil);

        // 4. Pembagian
        hasil = var1 / var2;
        System.out.printf("\n%d : %d = %d", var1, var2, hasil);

        // 5. Modulus
        hasil = var1 % var2;
        System.out.printf("\n%d %% %d = %d", var1, var2, hasil);

    }
}
