package homeworkweek7;

import java.util.Scanner;

/**8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 9. Same as above program-8 using switch statement.**/

public class Programme9Switch {

    public static void main(String[] args) {
     switchalpha();
    }

    public static void switchalpha() {//static method
        Scanner scanner = new Scanner(System.in);//calling scanner
        System.out.println("Enter any latter =");
        char ch = scanner.next().charAt(0);// store memory and using charAt() convert string to char
        String alpha;// string method


        switch (Character.toUpperCase(ch)) {
            case 'A':
                alpha = "America";
                System.out.println(alpha);
                break;
            case 'B':
                alpha = "Berlin";
                System.out.println(alpha);
                break;
            case 'C':
                alpha = "Canada";
                System.out.println(alpha);
                break;
            case 'D':
                alpha = "Dubai";
                System.out.println(alpha);
                break;
            case 'E':
                alpha = "England";
                System.out.println(alpha);
                break;
            case 'F':
                alpha = "France";
                System.out.println(alpha);
                break;

            default:

                System.out.println("Invalid Entry");


                scanner.close();
        }

    }
}



