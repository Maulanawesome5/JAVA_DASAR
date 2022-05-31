package com.tutorial;
import java.util.Scanner; // ditulis setelah nama package

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Ketikkan angka untuk A: ");
        a = input.nextInt();

        System.out.print("Ketikkan angka untuk B: ");
        b = input.nextInt();

        /*
         * Percabangan IF dan Operator Perbandingan
         * Struktur IF
         * if( nilai1 operator nilai2 ){ aksi / statement}
         *
         * Operator Perbandingan
         * == Sama dengan
         * != Tidak sama dengan
         * >  Lebih besar
         * >= Lebih besar atau sama dengan
         * <  Lebih kecil
         * <= Lebih kecil atau sama dengan
        */
        if (a == b)
            System.out.printf("%d == %d\n", a, b);

        if (a != b)
            System.out.printf("%d != %d\n", a, b);

        if (a < b)
            System.out.printf("%d < %d\n", a, b);

        if (a <= b)
            System.out.printf("%d <= %d\n", a, b);

        if (a > b)
            System.out.printf("%d > %d\n", a, b);

        if (a >= b)
            System.out.printf("%d >= %d\n", a, b);

    } // end public static void
} // end public class
