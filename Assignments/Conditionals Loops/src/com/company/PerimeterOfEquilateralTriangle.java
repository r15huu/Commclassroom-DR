package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side = input.nextFloat();

        float perimeter = 3 * side;

        System.out.println("Area of the circle is = " + perimeter);
    }
}
