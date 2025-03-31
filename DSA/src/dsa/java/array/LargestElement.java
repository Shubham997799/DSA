package dsa.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	
	public static int  secondLargestElement(int arr[]) {
		int largestElemet=0;
		int secondLargestElement=0;
		
		for(int num:arr) {
			if(num>largestElemet) {
				secondLargestElement=largestElemet;
				largestElemet=num;
			}else if(num >secondLargestElement && num <largestElemet) {
				secondLargestElement=num;
			}
		}
		if(secondLargestElement==0) {
			return -1;
		}
		return secondLargestElement;
	}

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array : "+Arrays.toString(arr));
		
		int secondLargestElement =secondLargestElement(arr);
		if( secondLargestElement == 1 ) {
		System.out.println("The Second Largest Element from Array is : "+ secondLargestElement);
		}else {
			System.out.println("There is Second largest Number in given Array");
		}
		sc.close();
	}

	
}

