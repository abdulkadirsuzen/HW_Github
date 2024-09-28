package day05ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // Get the number from the user and check if it's Odd or Even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        if (number%2 == 0){

            System.out.println(number + "is Even.");

        }

        if (number%2 != 0){
            System.out.println(number +" is Odd.");
        }

        if (number%2 == 0){
            System.out.println(number + " is Even.");

        }
        else {
            System.out.println(number + " is Odd.");
        }




    }
}
