package homeworkweek7;

import java.util.Scanner;

/**16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO” **/

public class Programme16PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner call
        System.out.println("Input any number =");
        int n1 =scanner.nextInt();// store value

        Programme16PosNegZero programme16PosNegZero = new Programme16PosNegZero();//object call
        programme16PosNegZero.positnegzero(n1);
        scanner.close();
    }
    public void positnegzero(int num){




        if (num > 0){//if else statement//if else statement
            System.out.println(num + " number is positive.");
        }
        else {
            if (num < 0){//logic for negative
                System.out.println(num  + " is negative.");
            }else {
                System.out.println(num + " is zero.");


            }
        }



    }
}
