package com.collection;
import java.util.Scanner;
public class ArrayDemo {
	
	

	public static void main(String[] args) {
		//creating scanner object
		Scanner s = new Scanner(System.in);
		
	     //array declaration
		int[] arr = new int[5];
		
		//taking the input from user
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enetr the array element");
			arr[i]= s.nextInt();
		}
		
		//traverse the array elements
		for(int s1 : arr)
		{
			
			System.out.print(s1+" ");
			
			
		}
		
		
	}

}
