package com.company;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float rad = input.nextFloat();
        System.out.print("Enter the Height: ");
        float height = input.nextFloat();

        float volume = 3.14f * 0.3333f * rad * rad * height;
        System.out.println("Volume of the Cone is = " + volume);
    }
}
