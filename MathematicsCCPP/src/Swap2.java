/*
Author : Mayur Ind.
Problem Name : Write a program to Swap two numbers without using 3rd variable
Purpose : Educational
*/

public class Swap2 {
	public static void main(String[] args) {
		int i,j;
		i=10;j=20;
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("i=" + i);	
		System.out.println("j=" + j);	
	}
}
