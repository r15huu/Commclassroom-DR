package com.company;

import java.util.Scanner;

public class calculatevalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Operator: ");
        char op = input.next().trim().charAt(0);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        if( op == '+'){
            System.out.println("Answer: " + (num1 + num2));
        } else if ( op == '-') {
            System.out.println("Answer: " + (num1 - num2));
        } else if (op == '/') {
            System.out.println("Answer: " + (num1/num2));
        } else if (op == '*') {
            System.out.println("Answer: " + (num1 * num2));
        } else {
            System.out.println("Enter valid Operator");
        }



    }
}
