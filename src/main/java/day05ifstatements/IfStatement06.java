package day05ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        // If the user is female and older than 60, print "You can retire!"
        // If the user is male and older than 65, print "You can retire!"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender (male/female): ");
        String gender = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if ((gender.equals("female") && age > 60) ||
                (gender.equals("male") && age > 65)) {
            System.out.println("You can retire!");
        } else {
            System.out.println("You cannot retire.");
        }



    }
}
