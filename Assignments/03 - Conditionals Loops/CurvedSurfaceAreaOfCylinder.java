package com.company;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float rad = input.nextFloat();
        System.out.print("Enter the Height: ");
        float height = input.nextFloat();

        float csa = 3.14f * 2 * rad * height;
        System.out.println("Volume of the Cone is = " + csa);
    }
}
