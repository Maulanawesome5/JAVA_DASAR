package com.tutorial;

import java.io.*;

public class RotasiText {
    // function untuk merotasi huruf
    public static char rotate(char c){
        if ( (c >= 'A') && (c <= 'Z') ){
            c += 8;
            if (c > 'Z'){
                c -= 26;
            }
        }
        if ((c >= 'a') && (c <= 'z')){
            c += 8;
            if (c > 'z'){
                c -= 26;
            }
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
        // my keyboard error. copy paste -> g, h, '_', "_"
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            System.out.print("> ");
            String line = in.readLine();
            if ((line == null) || line.equals("quit")) break;
            StringBuffer buf = new StringBuffer(line);
            for (int i = 0; i < buf.length(); i++){
                buf.setCharAt(i, rotate(buf.charAt(i)));
            }
            System.out.println(buf);
        }
    }
}
