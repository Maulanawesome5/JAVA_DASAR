package com.tutorial;
import java.io.*;

public class Sieve {

    public static void main(String[] args) throws IOException {
        // my keyboard error. copy paste -> g, h, '_', "_"
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            System.out.print("Integer> ");
            String line = in.readLine();
            if ( (line == null) || line.equals("Quit") ) break;
            try {
                int max = Integer.parseInt(line);
                boolean[] isPrime = new boolean[max + 1];
                for (int i = 0; i <= max; i++){
                    isPrime[i] = true;
                }
                isPrime[0] = isPrime[1] = false;
                int n = (int) Math.ceil(Math.sqrt(max));
                for (int i = 0; i <= n; i++){
                    if (isPrime[i]){
                        for (int j = 2 * i; j <= max; j += i){
                            isPrime[j] = false;
                        }
                    }
                }
                int largest;
                for (largest = max; !isPrime[largest]; largest--) {
                    System.out.println("largest = " + largest);
                }
                System.out.println("Nilai prima terbesar yang lebih kecil atau sama dengan " + max + " adalah " + largest);
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }
    }
}
