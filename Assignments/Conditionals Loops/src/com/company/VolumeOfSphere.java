package com.company;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float rad = input.nextFloat();

        float volume = 3.14f * 4 * 0.3333f * rad * rad * rad ;
        System.out.println("Volume of the Sphere is = " + volume);
    }
}
