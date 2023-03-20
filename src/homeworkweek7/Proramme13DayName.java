package homeworkweek7;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and
 * it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Proramme13DayName {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);//call scanner
        System.out.println("Input any number");
        int n1 = scanner.nextInt();//store value


        Proramme13DayName proramme13DayName = new Proramme13DayName();//call object
        proramme13DayName.day(n1);

    }
    public void day (int day){//instance method
        String name = "";  //switch mehtod
        switch (day){
            case 1 :
            name = "Monday";
                System.out.println(name);
                break;
            case  2:
                name = "Tuesday";
                System.out.println(name);
                break;
            case 3 :
                name = "wednesday";
                System.out.println(name);
                break;
            case 4 :
                name = "Thursday";
                System.out.println(name);
                break;
            case 5 :
                name= "Friday";
                System.out.println(name);
                break;
            case 6 :
                name= "Saturday";
                System.out.println(name);
                break;
            case 7 :
                name= "Sunday";
                System.out.println(name);
                break;
            default:
                System.out.println("Week contains 1 to 7 days");




        }
    }
}
