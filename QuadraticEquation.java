package com.company;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter value of b");
        int b = scanner.nextInt();

        System.out.println("Enter value of c");
        int c = scanner.nextInt();


        double root1 = calculate01(a, b, c);

         double root2  = calculate01(a,b,c);

        if(root1 == 0 || root2 == 0){
            System.out.println("FUNCTION DOESN'T HAVE ROOTS. ");
        } else {
            System.out.println("The roots are " + root1 + " and " + root2);
        }

    }


    private static double calculate01(int a, int b, int c) {

        double one = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        return one;

    }

    private static double calculate02(int a, int b, int c) {


        double one = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        return one;

    }

}
