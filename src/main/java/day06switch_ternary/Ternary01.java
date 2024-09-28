package day06switch_ternary;

public class Ternary01 {
    public static void main(String[] args) {

        /*
        Ternary is used for the same purpose as if-else => conditional situations
        But Ternary has SiMPLER syntax

        condition ? this part will be executed if condition is ture: this part will be executed if
        condition? these codes if condition is ture : these codes if condition is false;
         */

        // String message = a > 0 ? "Positive" : "Negative";

        // System.out.println(message);



        int x = 3;
        String result2 = x > 0 && x < 10 ? "It's a digit": " Not a digit";
        System.out.println("result2 = " + result2);
        
        



    }
}
