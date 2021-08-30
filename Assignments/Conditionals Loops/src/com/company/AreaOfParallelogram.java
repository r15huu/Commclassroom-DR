package com.company;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height: ");
        float height = input.nextFloat();
        System.out.print("Enter the base: ");
        float base = input.nextFloat();

        float area = height * base;

        System.out.println("Area of the Parallelogram is = " + area);
    }
}
