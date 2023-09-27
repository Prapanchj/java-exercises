/********************************************************************************
 * Name				:Positiveornegative.java
 * Author			:Prapanch J
 * Description		:Java Program for find positive or negative.
 * Version			:1.0
 * Date				:27/09/23
 * ******************************************************************************/
package study;
import java.util.Scanner;
public class Positiveornegative {
public static void main(String [] args)  { 
	
	int Number,num2;
	  System.out.println("enter the number");
      Scanner sc=new Scanner(System.in);
      Number=sc.nextInt();
      
      if(Number==0) {
    	  
    	  System.out.println("number is zero");
      }
      
      else if (Number>0) {
    	  System.out.println("number is positive");
      }
      
      else if (Number<0) {
    	  System.out.println("number is negative");
	
      }
}}
