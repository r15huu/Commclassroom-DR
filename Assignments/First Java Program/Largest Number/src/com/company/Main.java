package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          largestNumber();
    }

    static void largestNumber() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = input.nextInt();
        System.out.print("Enter Second Number: ");
        int y = input.nextInt();

        if (y > x) {
            System.out.println("Largest number is = " + y);
        }
        if (x > y) {
            System.out.println("Largest number is = " + x);
        }

    }

}

