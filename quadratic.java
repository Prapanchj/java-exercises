/********************************************************************************
 * Name				:quadratic.java
 * Author			:Prapanch J
 * Description		:Java Program for find quadratic equation.
 * Version			:1.0
 * Date				:27/09/23
 * ******************************************************************************/
import java.util.Scanner;
public class quadratic {
public static void main(String[] args) {

        int number1,number2,number3,r,s,result;

            System.out.print("Input a: ");
            Scanner sc=new Scanner(System.in);
            number1=sc.nextInt();

            System.out.print("Input b: ");
            try (Scanner pj = new Scanner(System.in)) {
            	number2=pj.nextInt();
			   }
            System.out.print("Input c: ");
            Scanner pr=new Scanner(System.in);
            number3=pr.nextInt();


             result = (int) (number2 * number2 - 4 * number1 * number3);

              if (result == 0) {
                     r = (int) (-number2 / (2 * number1));
                
                 System.out.println("The root is " + r);
                }
             else if (result > 0) {
                     r = (int) ((-number2 + Math.pow(result, 0.5)) / (2 * number1));
                     s= (int) ((-number2 - Math.pow(result, 0.5)) / (2 * number1));
               
                 System.out.println("The roots are " + r+ " and " + s);
               }
            
          
            else {
                System.out.println("The equation has no real roots.");
               }

               }
               
}