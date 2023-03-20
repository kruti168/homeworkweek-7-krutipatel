package homeworkweek7;

import java.util.Scanner;

/**5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF**/


public class Programme5Salary {
    public static void main(String[] args) {
       Programme5Salary programme5Salary = new Programme5Salary();//calling instance object
       programme5Salary.gross();


    }//instance method
       public void gross(){
        int basic;
           Scanner scanner = new Scanner(System.in);//calling scanner
           System.out.println("Enter Employee Id = ");
           int empid = scanner.nextInt();
           System.out.println("Enter Employee Name =");
           String name = scanner.next();
           System.out.println("Enter Employee Basic Salary =");
           basic = scanner.nextInt();

           double da = basic * 8/100; //DA = Basic salary 8%
           double hra =basic * 10/100;//HRA = Basic salary 10%
           double ta = basic * 9/100;//TA = Basic salary 9%
           double pf = basic * 20/100;//PF = Basic salary 20%
           double gs = basic + ta +hra + da -pf;// Gross salary = basic salary + HRA +TA+ DA- PF

          System.out.println("|------------------------------|");
          System.out.println("|        Salary Slip           | ");
          System.out.println("|----------------------------- |");
          System.out.println("|Employee Id       :"       +empid       +"          |");
          System.out.println("|Employee  Name    :"       + name       +"       |");
          System.out.println("|----------------------------------");
          System.out.println("|Basic Salary      :"        +basic   +           "      |");
          System.out.println("|HRA 10%           :"   + hra       +              "     |");
           System.out.println("|TA 8%            :"   + ta        +              "      |");
           System.out.println("|DA 9%            :"  + da        +              "      |");
           System.out.println("|PF- 20&          :"  + pf        +              "     |");
           System.out.println("|---------------------------------");
           System.out.println("|Gross Salary     :"   +gs            +          "     |             ");
           System.out.println("|================================");
           scanner.close();
       }

}
