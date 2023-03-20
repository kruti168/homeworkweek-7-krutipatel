package homeworkweek7;

import java.util.Scanner;

/**12. Write a program that tells us input value is number or an alphabet or symbol.**/

public class Programme12Value {

        public static void main(String[] args) {
            Programme12Value programme12Value = new Programme12Value();//object call
            programme12Value.symbol();

    }
    public void symbol (){//instance method
        Scanner scanner = new Scanner(System.in);//scanner call
        System.out.println("Enter any Number or alphabet or symbol =");
        char ch = scanner.next().charAt(0);

         if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){//if else statement
             System.out.println(ch + " is a alphabet.");
         }
         else {
             if (ch >= '0' && ch <=  '9'){
                 System.out.println(ch + " is a Numeric");
             }else {
                 System.out.println(ch + " is a Symbol");


             }
         }
        scanner.close();
    }

}
