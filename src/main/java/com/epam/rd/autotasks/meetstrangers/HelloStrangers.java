package com.epam.rd.autotasks.meetstrangers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else if (n < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        // reader.readLine();
        for(int i=1;i<=n;i++){
            String str=reader.readLine();
            System.out.println("Hello, "+str);
        }
        reader.close();
    }
}
