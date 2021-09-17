package com.company;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        float rad = input.nextFloat();
        System.out.print("Enter the Height of the Cylinder: ");
        float height = input.nextFloat();

        float area = 3.14f * rad * rad * height;

        System.out.println("Area of the circle is = " + area);
    }
}
