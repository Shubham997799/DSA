/*Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, 
 * where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
 * */

package dsa.java.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int d1 = 2;

		rotateArray(arr1, d1);
		System.out.println(Arrays.toString(arr1));
		//
		int arr2[] = { 7,3,9,1 };
		int d2 = 9;

		rotateArray(arr2, d2);
		System.out.println(Arrays.toString(arr2));
	}

	private static void rotateArray(int[] arr, int d) {
		int a = arr.length;
		//d=d%a;
		d=(d%a+a)%a; /// Adjust for negative d and ensure it's within [0, n-1];

		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, a - 1);
		reverseArray(arr, 0, a - 1);

	}

	private static void reverseArray(int[] arr1, int start, int end) {
		while (start < end) {
			int temp = arr1[start];
			arr1[start] = arr1[end];
			arr1[end] = temp;
			start++;
			end--;

		}

	}

}
