package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a while loops to count down from 10 to 0
        System.out.println("Countdown!");
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i -= 1;
        }
        System.out.println("Blastoff!");


        Scanner keyboard = new Scanner(System.in); // Do an inline initialization of a Scanner objet called keyboard.
        System.out.print("What is your name? ");
        // The nextLine method will read the whole line (including \n)!
        // The next method only reads the next "token".
        String userName = keyboard.nextLine();
        System.out.println("Nice to meet you " + userName + ".");
        System.out.println("It is a pleasure.");

    }
}
