package javalab;
import java.util.Scanner;
public class prcts1  {

public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	int lim,i;

	
	System.out.println("enter the string you want to reverse");
	String str=sc.next();
	char a[]=str.toCharArray();
	
for(i=(a.length)-1;i>=0;i--) {
	System.out.print(a[i]);
	
}



}



}
