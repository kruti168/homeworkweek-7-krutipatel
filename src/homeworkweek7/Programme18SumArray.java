package homeworkweek7;
/**18. Write a Java program to sum values of an array. **/

public class Programme18SumArray {

    public static void main(String[] args) {
        int n1 = 0;
        Programme18SumArray progrmme18SumArray = new Programme18SumArray();//Create object
        progrmme18SumArray.sumArray(n1);

    }
    public void sumArray(int sum) {//instance method

        int num [] ={ 2, 5, 20,50,34,10};
        for (int i : num){// sum logic using for loop
            sum += i;
            System.out.println(i);// store value

        }
        System.out.println("Sum of array values = " + sum);//total sum 121
    }
}
