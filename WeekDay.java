package com.company;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number : ");
        int a = scanner.nextInt();

        if (a <= 7 && a >= 1) {

            switch (a) {


                case 1:
                    System.out.println("Monday:)");
                    break;
                case 2:
                    System.out.println("Tuesday:)");
                    break;
                case 3:
                    System.out.println("wednesday:)");
                    break;
                case 4:
                    System.out.println("Thursday:)");
                    break;
                case 5:
                    System.out.println("Friday:)");
                    break;
                case 6:
                    System.out.println("Saturday:)");
                    break;
                case 7:
                    System.out.println("Sunday:)");
                    break;
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

//Another solution

//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int day = in.nextInt();
//
//        System.out.println(getDayName(day));
//    }
//
//    // Get the name for the Week
//    public static String getDayName(int day) {
//        String dayName = "";
//        switch (day) {
//            case 1: dayName = "Monday"; break;
//            case 2: dayName = "Tuesday"; break;
//            case 3: dayName = "Wednesday"; break;
//            case 4: dayName = "Thursday"; break;
//            case 5: dayName = "Friday"; break;
//            case 6: dayName = "Saturday"; break;
//            case 7: dayName = "Sunday"; break;
//            default:dayName = "Invalid day range";
//        }
//
//        return dayName;
//    }
//}