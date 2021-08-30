package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float length = input.nextFloat();
        System.out.print("Enter the width: ");
        float width = input.nextFloat();

        float perimeter = 2 * ( length + width );

        System.out.println("Perimeter of the parallelogram is= " + perimeter);
    }
}
