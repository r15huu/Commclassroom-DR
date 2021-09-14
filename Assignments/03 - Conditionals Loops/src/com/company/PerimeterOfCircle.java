package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        float rad = input.nextFloat();

        float perimeter = 2 * 3.14f * rad;

        System.out.println("Area of the circle is = " + perimeter);
    }
}
