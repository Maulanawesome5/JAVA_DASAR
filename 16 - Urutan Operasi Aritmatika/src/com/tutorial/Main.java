package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int hasil = 5 * 10 / 2; // Pembagian akan dihitung dulu, baru dikali
        System.out.println(hasil);
        hasil = 5 + 2 - 10; // Ditambah dulu, lalu dikurangi
        System.out.println(hasil);

        // Prioritas operasi aritmatika dengan tanda ()
        hasil = 60 / (2 + 10); // Ditambah dulu jadi 12, lalu 60 dibagi 12
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // Menghitung persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m, x, c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("\ngradient m = ");
        m = userInput.nextInt();
        System.out.print("\nbias c = ");
        c = userInput.nextInt();

        int y = (m * x * x) + c; // Rumus persamaan kuadrat
        System.out.println("Nilai y = " + y);

    }
}
