package day05ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {


        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String dayName = scanner.next();
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = scanner.nextLine().toLowerCase();

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("It's the weekend");
        } else if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                day.equals("thursday") || day.equals("friday")) {
            System.out.println("It's a weekday");
        } else {
            System.out.println("Invalid day");
        }



    }
}
