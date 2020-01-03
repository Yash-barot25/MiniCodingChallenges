package com.company;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER 1ST NUMBER : ");
        int a = scanner.nextInt();


        System.out.println("ENTER 2ND NUMBER : ");
        int b = scanner.nextInt();


        System.out.println("ENTER 3RD NUMBER : ");
        int c = scanner.nextInt();


        if(a > b && a > c){
            System.out.println("THE GREATEST IS " + a);
        } else if(b > a && b > c){
            System.out.println("THE GREATEST IS " + b);
        }  else {
            System.out.println("THE GREATEST IS " + c);
        }


    }

}
