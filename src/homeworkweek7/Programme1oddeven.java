package homeworkweek7;

import java.util.Scanner;

/**1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)**/
public class Programme1oddeven {

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);//calling scanner
        System.out.println("Enter the Number");
        int n1 = scan.nextInt();//store value

        Programme1oddeven obj = new Programme1oddeven();//call instance method by create object
       String result1 = obj.oddeven(n1);
        System.out.println(n1 + " is " +result1);
        scan.close();
    }
    public String oddeven(int num){ //instance method with return with parameter
        //odd even using ternary opetator
        String  result;
        result = (num % 2 == 0)? "Even" :  "odd";
        return result;
    }
}
