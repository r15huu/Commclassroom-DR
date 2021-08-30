package com.company;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diagonal (a): ");
        float diagonalA = input.nextFloat();
        System.out.print("Enter the the diagonal (b): ");
        float diagonalB = input.nextFloat();

        float area = 0.5f * diagonalA * diagonalB;

        System.out.println("Area of the Rhombus is = " + area );
    }
}
