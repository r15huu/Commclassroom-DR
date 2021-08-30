package com.company;

import java.util.Scanner;

public class rupeetodollar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in Rupee: ");
        float rup = input.nextFloat();
        
        float value  = 73.43f;
        float dollar = rup / value;

        System.out.println(rup + " in dollar is: " + dollar);

    }
    
}
