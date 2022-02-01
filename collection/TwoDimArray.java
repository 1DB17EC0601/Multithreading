package com.collection;

import java.util.Scanner;

public class TwoDimArray {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		int n=arr.length;
		Scanner s = new Scanner(System.in);
          
		//taking the inputs from user
				
				for(int row=0;row<n;row++)
				{
					for(int col=0;col<n;col++)
					{
						System.out.print("enter the array element");
						 arr[row][col]  = s.nextInt();
					}
					System.out.println();
				}
		
		//traverse using the for each loop
		
		for(int[] a : arr[row][col])
		{
			System.out.println("the array elements are "+a);
		}
	}

}
