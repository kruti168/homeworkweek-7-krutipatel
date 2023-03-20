package homeworkweek7;
/**20. Write a Java program to test if an array contains a specific value.**/

public class Programme20SpeValue {

    public static void main(String[] args) {
        int x[] = {89, 35, 56, 73, 65, 57};
        System.out.println(specifiValue(x, 56));
        System.out.println(specifiValue(x, 100));


    }

    public static boolean specifiValue(int[] n1, int item) {//static method with return with parameter

        for (int n : n1) {

            if (item == n) {
                return true;
            }
        }return false;
    }
}