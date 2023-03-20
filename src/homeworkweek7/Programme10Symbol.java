package homeworkweek7;

import java.util.Scanner;

/**10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)**/

public class Programme10Symbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// call scanner
        System.out.println("Input  No1 =");
        double n1 = scanner.nextDouble();// store value
        System.out.println("Input No2 =");
        double n2 =scanner.nextDouble();
        System.out.println("Enter any of this Operator( + - * /)");
        char opration =scanner.next().charAt(0);
        double result;
        // switch statement
        switch (opration){
            //addition
            case '+':
                result = n1 + n1;
                System.out.println("Addition of "+ n1 + " + " + n2 + " = "+ result);
                break;

            //subtraction
            case '-' :
                result = n1 - n2;
                System.out.println("Subtraction of "+ n1 + "-" +n2 +" = " + result);
                break;

            //multiplication
            case '*' :
                result = n1 * n2;
                System.out.println("Multiplication of "+ n1 + "*" +n2 +" = " + result);
                break;

            //Division
            case '/' :
                result = n1 / n2;
                System.out.println("Division of "+ n1 + "-" +n2 +" = " + result);
                break;
        }





        scanner.close();
    }


    }

