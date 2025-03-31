package dsa.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class PushZerosToEnd {

	public static void pushZerosToEnd(int[] arr) {
		int index=0;
		
		for(int num:arr) {
			if(num !=0) {
				arr[index++]=num;
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an Array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array : " + Arrays.toString(arr));

		pushZerosToEnd(arr);

	}

}
