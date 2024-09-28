package practices;

import java.util.Scanner;

public class TurkishClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a password: ");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;
        System.out.println("lengthControl = " + lengthControl);
        
        boolean spaceControl = pwd.replaceAll("^ ","").length() == 0;
        //boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl = " + spaceControl);
        
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseControl = " + upperCaseControl);
        
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean numberControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("numberControl = " + numberControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && numberControl;

        if (isValid){
            System.out.println("Password is valid");

        }

        else{
            System.out.println("Password is invalid");

        }


    }
}
