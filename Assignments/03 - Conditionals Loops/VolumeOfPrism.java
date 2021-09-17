package com.company;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        float height = input.nextFloat();
        System.out.print("Enter the base of the triangle: ");
        float base = input.nextFloat();

        float area = height * base;

        System.out.println("Volume of the prism is = " + area);
    }

}
