package com.demo1;

public class StackExampleReview {
//Write a program to print the alternative numbers in given array and count the values.
 //   {2,5,6,1,7,3,4,8,9}(Done)
	public static void main(String[] args) {
		
		int a[]= {2,5,6,1,7,3,4,8,9};
		int sum=0;
		System.out.print("Alternate numbers are : ");
		for(int i=0; i<a.length; i=i+2) {
			System.out.print(a[i]+" ");
			sum=sum+ a[i];
			
		}
		System.out.println();
		System.out.println("Sum is : "+sum);

	}

}
