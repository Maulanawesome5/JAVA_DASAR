package com.tutorial;

public class Main {

    public static void main(String[] args){
     /*
        Tipe data di Java ==> integer, byte, short, long, double, float
        char, boolean
    */

        //Integer
        int a = 10;
        System.out.println("=== Integer ===");
        System.out.println("Nilai integer = " + a);
        System.out.println("Nilai min integer = " + Integer.MIN_VALUE);
        System.out.println("Nilai max integer = " + Integer.MAX_VALUE);
        System.out.println("Besar data size integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar data size integer = " + Integer.SIZE + " bit");

        //Byte
        byte b = 15;
        System.out.println("\n=== Byte ===");
        System.out.println("Nilai byte = " + b);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Besar data size byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar data size byte = " + Byte.SIZE + " bit");

        //Short
        short c = 5;
        System.out.println("\n=== Short ===");
        System.out.println("Nilai short = " + c);
        System.out.println("Nilai min short = " + Short.MIN_VALUE);
        System.out.println("Nilai max short = " + Short.MAX_VALUE);
        System.out.println("Besar data size short = " + Short.BYTES + " bytes");
        System.out.println("Besar data size short = " + Short.SIZE + " bit");

        //Long
        long d = 15L; //Diberikan huruf L untuk konvensi sebagai tipe long
        System.out.println("\n=== Long ===");
        System.out.println("Nilai long = " + d);
        System.out.println("Nilai min long = " + Long.MIN_VALUE);
        System.out.println("Nilai max long = " + Long.MAX_VALUE);
        System.out.println("Besar data size long = " + Long.BYTES + " bytes");
        System.out.println("Besar data size long = " + Long.SIZE + " bit");

        //Double
        double e = 15.10d; //Diberikan huruf d untuk konvensi sebagai tipe double
        System.out.println("\n=== Double ===");
        System.out.println("Nilai double = " + e);
        System.out.println("Nilai min double = " + Double.MIN_VALUE);
        System.out.println("Nilai max double = " + Double.MAX_VALUE);
        System.out.println("Besar data size double = " + Double.BYTES + " bytes");
        System.out.println("Besar data size double = " + Double.SIZE + " bit");

        //Float
        float f = 31.4f; //Diberikan huruf f untuk konvensi sebagai tipe float
        System.out.println("\n=== Float ===");
        System.out.println("Nilai float = " + f);
        System.out.println("Nilai min float = " + Float.MIN_VALUE);
        System.out.println("Nilai max float = " + Float.MAX_VALUE);
        System.out.println("Besar data size float = " + Float.BYTES + " bytes");
        System.out.println("Besar data size float = " + Float.SIZE + " bit");

        //Character
        char g = 'a'; //Menampung satu huruf saja
        System.out.println("\n=== Char ===");
        System.out.println("Nilai char = " + g);
        System.out.println("Nilai min char = " + Character.MIN_VALUE);
        System.out.println("Nilai max char = " + Character.MAX_VALUE);
        System.out.println("Besar data size char = " + Character.BYTES + " bytes");
        System.out.println("Besar data size char = " + Character.SIZE + " bit");

        //Boolean
        boolean h; //Coba pakai perbandingan (komparasi)
        System.out.println("\n=== Boolean ===");
        h = 1 > 2;
        System.out.println("1 > 2");
        System.out.println("Nilai boolean = " + h);
        h = 1 < 2;
        System.out.println("1 < 2");
        System.out.println("Nilai boolean = " + h);
    }
}
