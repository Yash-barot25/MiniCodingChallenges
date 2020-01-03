package com.company;

import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        printer(a);

    }


    private static void printer(int a){

        for (int i = 1 ; i <= a ; i++){

            System.out.println("Number is " + i + " & " + "the cube is " + (i*i*i));
        }
    }


}
