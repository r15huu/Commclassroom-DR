package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        float side = input.nextFloat();

        float area = 0.43301f * side * side;

        System.out.println("Area of the triangle is = " + area);
    }
}
