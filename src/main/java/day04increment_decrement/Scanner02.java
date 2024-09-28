package day04increment_decrement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*

        Get two numeric values from the user, store them in double data type.
        Calculate their multiplication and division and print them on the console

         */

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate multiplication and division
        double multiplication = num1 * num2;
        double division = num1 / num2;

        // Print the results
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multiplication);
        System.out.println("Division of " + num1 + " by " + num2 + " is: " + division);


        /*
       Get two numeric values from the user, store them in double data type.
       Calculate their multiplication and division and print them on the console.
       */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numerical values");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

//        multiplication
        System.out.println("multiplication: " +num1*num2);
        System.out.println("multiplication formatted: " + String.format("%.2f" , (num1*num2)) );

//        division
        System.out.println( "division: " +num1/num2);
        System.out.println( "division formatted: " +String.format("%.3f", (num1/num2)) );


        // Get the width and the length of a rectangle from the user and calculate its area. (Use float / double data)

        System.out.println("Enter the length of a rectangle");
        float length = scanner.nextFloat();
        System.out.println("Enter the width of a rectangle");
        float width = scanner.nextFloat();

        float area = length*width;
        System.out.println("area = " + area);

        // Calculate the perimeter of the rectangle as well  (2*(w+l))

        float perimeter = 2*(width+length);
        System.out.println("perimeter = " + perimeter);

         */





    }
}
