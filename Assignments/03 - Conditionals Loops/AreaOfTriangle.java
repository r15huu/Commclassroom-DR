package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        float height = input.nextFloat();
        System.out.print("Enter the base of the triangle: ");
        float base = input.nextFloat();

        float area = 0.5f * height * base;

        System.out.println("Area of the triangle is = " + area);
    }
}
