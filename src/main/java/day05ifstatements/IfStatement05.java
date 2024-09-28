package day05ifstatements;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        // Example: Based on the age entered by the user, print one of the following messages:
        // 0-4 => infant
        // 5-12 => child
        // 13-20 => teen
        // 21-40 => adult
        // 41+  => middle age

        // Also include "invalid age" message

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        if(age >= 0 && age <= 4){
            System.out.println(age + " is Infant");
        }
        else if(age >= 5 && age<= 12){
            System.out.println(age + " is child");
        }
        else if (age >=13 && age<= 20) {

            System.out.println(age + " is Teen");
        }
        else if(age >=21 && age<=40){
            System.out.println(age +" is adult");
        }
        else if(age>= 41 && age < 60){
            System.out.println(age + " is middle age");
        }
        else {
            System.out.println(age + " is invalid");
        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        String result = (age >= 0 && age <= 4) ? "Infant" :
//                        (age >= 5 && age <= 12) ? "Child" :
//                        (age >= 13 && age <= 20) ? "Teen" :
//                        (age >= 21 && age <= 40) ? "Adult" :
//                        (age >= 41 && age <= 60) ? "Middle age" : "Invalid age entered";
//
//        System.out.println(result);

        // 2nd way:

        if (age<0 || age > 130){
            System.out.println("Invalid age");
        } else if (age<5) {
            System.out.println("Infant");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 41) {
            System.out.println("Adult");
        } else if (age < 60) {
            System.out.println("Middle age");
        } else if (age < 90) {
            System.out.println("Old age");
        }



    }
}
