package homeworkweek7;

import java.util.Arrays;

/**17. Write a Java program to sort a numeric array and a string array.  **/


public class Programme17NumStringArray {
    public static void main(String[] args) {
        numericStringarray();//call static method

    }

    public static void numericStringarray() {// static method
        int[] num = {30, 40, 10, 20, 60, 50,};
        String[] name = {"Java", "C", "C++", "VB","Python", "VB.net"};

        //number sorting
        System.out.println("Original Number =" + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted Number =" + Arrays.toString(num));

        System.out.println("============================================");

        //string sorting
        System.out.println("Original String =" + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted String =" + Arrays.toString(name));
    }
}