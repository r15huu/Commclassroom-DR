package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	    System.out.print("Enter the principal value: ");
	    int principal = input.nextInt();
	    System.out.print("Enter the time: ");
        int time = input.nextInt();
        System.out.print("Enter the rate: ");
        int rate = input.nextInt();

        float si = principal * time * rate / 100f;

        System.out.println("Simple interest: " + si);

    }
}
