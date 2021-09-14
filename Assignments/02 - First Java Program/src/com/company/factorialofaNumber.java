package com.company;

import java.util.Scanner;

public class factorialofaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int x = num;
        int y = 1;

        if (num == 0){
            System.out.println(1);
        } else {
            for (int i = 0; i<x; i++){
                y *= num;
                num--;
            }
        }

        System.out.println(y);
    }
}
