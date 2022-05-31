package com.tutorial;

public class Main {

    public static void main(String[] args){
        /*
         * Perulangan (Looping)
         * Mengkonversi satuan ukuran air.
         * Diketahui 1 galon air == 3.7854 liter.
         * Jika terdapat lebih dari satu galon, berapa liter air
         * yang ada dari semua galon?
         */

        double galon, liter;
        int counter;

        counter = 0;

        for(galon = 1; galon <= 10; galon++){
            liter = galon * 3.7854;
            System.out.println(galon + " galon adalah " + liter + " liter.");
            counter++;

            if (counter == 10){
                System.out.println("Selesai");
            }
        }
    } // end public static
} // end public class
