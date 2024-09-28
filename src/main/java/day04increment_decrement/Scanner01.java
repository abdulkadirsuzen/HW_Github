package day04increment_decrement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*

        How many JAVA LIBRARIES we have used so far?

        java.util ==> all utility classes come from this library ==> Scanner, Arrays, Collections etc.
        java.lang ==> System, String, Object
        java.sql ==> Connection, Statement etc. ==> all database relate operations
        java.io ==> used for File related operations


        There are 3rd party external libraries as well:
        Apache Maven
        JavaFx
        Hibernate
        Selenium

         */


        // Ask user to enter following credentials:
        // Firstname and lastname
        // Age
        // Height
        // Weight
        // Marital status => married, unmarried, do not want to mention





        // Step 1: Create Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Send the message to the user
        System.out.println("Enter your Firstname and Lastname please");
        // Step 3: Store the values/data provided, do not want mention
        String fullName = scanner.nextLine();

        // Age
        System.out.println("Please enter your age!");
        byte age = scanner.nextByte();

        System.out.println("Please enter your Height!");
        float height = scanner.nextFloat();

        System.out.println("Please enter your Weight!");
        float weight = scanner.nextFloat();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);




    }




}
