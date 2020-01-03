package com.company;


import java.util.Scanner;

public class OddCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int a  = scanner.nextInt();

        oddPrinter(a);



    }

    private static void oddPrinter(int  a){
        int sum = 0;
        int add = 0;
        for (int i = 1; i < Integer.MAX_VALUE ; i+=2){
            sum++;
            if (sum > a){
                break;
            }
            add += i;
            System.out.println(i);

        }
        System.out.println("The sum is " + add);
    }

}
