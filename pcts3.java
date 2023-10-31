package javalab;
import java.util.Scanner;

public class pcts3 {
	
	
	
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			int count=0;
			System.out.println("Enter a Number:");
			int num=sc.nextInt();
			   for(int i=1;i<=num;i++) {
				     if(num%i==0)
				    	count++; 
			           }
			  if(count==2)
			     System.out.println(num+"number  is a Prime Number:");
			  else
				  System.out.println(num+" number is Not Prime Number:");  
		}
	}



