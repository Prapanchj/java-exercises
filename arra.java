/********************************************************************************
 * Name				:array
 * Author			:Prapanch J
 * Description		:Java Program 
 * Version			:1.0
* Date				:-/10/23
 * ******************************************************************************/
package prj;

import java.util.Scanner;

public class arra {
	public static void main(String[]args) {
Scanner sc=new Scanner (System.in);
		int i,j,lim,tem;
		System.out.println("enter the limit");
lim=sc.nextInt();
int array[]=new array();

for(i=0;i<lim;i++) {
array[i]=sc.nextInt();	
}
	for(i=0;i<lim;i++) {
	for(j=0;j<lim;j++) {
		if(array[j]>array[j++]) {
	
		tem=array[j];
				array[j]=tem;
				array[j+1]=tem;
	}
	}
	}
for(int element:array) 

}
