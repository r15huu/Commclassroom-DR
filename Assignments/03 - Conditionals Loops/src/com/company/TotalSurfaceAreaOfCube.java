package com.company;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        float side = input.nextFloat();

        float surfaceArea = 6f * side * side;
        System.out.println("Total surface area of Cube is = " + surfaceArea);
    }
}
