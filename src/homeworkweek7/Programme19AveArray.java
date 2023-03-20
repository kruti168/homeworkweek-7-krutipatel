package homeworkweek7;
/**19. Write a Java program to calculate the average value of array elements. **/

public class Programme19AveArray {
    public static void main(String[] args) {
       int n1 = 0;
       double n2 = 0;
       Programme19AveArray programme19AveArray = new Programme19AveArray();//calling instance method
       programme19AveArray.AveArray(n1,n2);
    }

    public void AveArray(int sum, double ave) {//instance method

        int num[] = new int[]{2, 5, 20, 50, 34, 10, -16, -55};//multidimension array
        for (int i = 0; i < num.length; i++) {//  logic using for loop
         sum = sum + num [i];
         ave = sum/num.length;
            System.out.println(num [i]);

        }
        System.out.println("ave of array Values =" + ave);// Average of array value = 6.0
    }
}