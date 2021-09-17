package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        float rad = input.nextFloat();

        float area = 3.14f * rad * rad;

        System.out.println("Area of the circle is = " + area);
    }
}
