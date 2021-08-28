package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i<=num; i++){
            if (num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
