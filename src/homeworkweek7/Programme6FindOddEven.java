package homeworkweek7;

import java.util.Scanner;

/**6. Write a java program to input any number and find out if it’s odd or even**/

public class Programme6FindOddEven {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);//call scanner
        System.out.println("Enter the Number =");
        int n1 = scanner.nextInt();// store value scanner

        Programme6FindOddEven .evenodd(n1);//creat object

        scanner.close();
    }
    //static method with no return with parameter
    public static void evenodd(int num){

        //even odd logic with if-else statement
        if (num % 2 == 0){
            System.out.println("The given number  "  + num +"is Even");
        }
        else{
            System.out.println("The given number "  + num + "  is odd");
        }
    }
}
