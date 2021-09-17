package com.company;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side = input.nextFloat();

        float perimeter = 4 * side;

        System.out.println("Perimeter of the square is = " + perimeter);
    }
}
