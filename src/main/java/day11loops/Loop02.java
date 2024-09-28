package day11loops;

public class Loop02 {
    public static void main(String[] args) {

        // Put * between two consecutive characters and at the end of the String
        // Java => J*a*v*a*
        // NOTE: When we work with Strings, we use index

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + "*");

        }

        // Example: Print all the words before 'm' in the given String.
        // "wisdom" => "wisdo"  "Tram" => "Tra"   "Miami" => "Mia

        // Example:  Print all the letters from a given String except lowercase
        // "Pwd123?AB" => P123?AB

        System.out.println("--------------");
        String str1 = "Pwd123?AB";

        String result = str1.replaceAll("[a-z]", "");

        System.out.println(result);


        System.out.println("----------");

        String s = "java";
        
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println(reversed);
    }



}
