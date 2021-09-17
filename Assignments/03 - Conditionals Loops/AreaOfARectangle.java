package com.company;

import java.util.Scanner;

public class AreaOfARectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float length = input.nextFloat();
        System.out.print("Enter the width: ");
        float width = input.nextFloat();

        float area = length * width;
        System.out.println("Area of Rectangle is = " + area);

    }
}
