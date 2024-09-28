package day06switch_ternary;

public class Switch01 {
    public static void main(String[] args) {

        /*
        1. Switch statement is also used for conditional sentences.
        2. But it has simpler syntax
        3. We dont write if(), instead we write switch.
         */

        int day = 4; // Let's say 4 represents Thursday

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


    }
}
