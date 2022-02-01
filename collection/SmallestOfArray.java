package com.collection;

import java.util.Scanner;

public class SmallestOfArray {

	public static void main(String[] args) {
		
		//creating the Scanner object
				Scanner s = new Scanner(System.in);
				
				int arr[]  = new int[5];
				int min =5, n=arr.length; 
				
				//taking the input from user
				
				for (int i=0;i<n;i++)
				{
					System.out.println("enter the array elements");
					 arr[i] = s.nextInt();
					 if(arr[i]<min)
						{
							min=arr[i];
							
						}
					 
				}
				System.out.println("the smallest element of given array is "+min);
				
				}

	}


