/*Given an array of integers arr[] representing a permutation, implement the next permutation that 
 * rearranges the numbers into the lexicographically next greater permutation. 
 * If no such permutation exists, rearrange the numbers into the 
 * lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements 
in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
 * */

package dsa.java.array;

public class NextPermutation {

	public static void main(String[] args) {
		// Test cases
		int[] arr1 = { 1, 2, 3 };
		nextPermutation(arr1);
		printArray(arr1); // Output: [1, 3, 2]

		int[] arr2 = { 3, 2, 1 };
		nextPermutation(arr2);
		printArray(arr2); // Output: [1, 2, 3]

		int[] arr3 = { 1, 1, 5 };
		nextPermutation(arr3);
		printArray(arr3); // Output: [1, 5, 1]
	}

	public static void nextPermutation(int[] arr) {
		int n = arr.length;
		int i = n - 2;

		// Step 1: Find the first element from right that is smaller than next element
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i >= 0) {
			// Step 2: Find the smallest element greater than arr[i] from right
			int j = n - 1;
			while (arr[j] <= arr[i]) {
				j--;
			}
			// Step 3: Swap them
			swap(arr, i, j);
		}
		// Step 4: Reverse the remaining elements
		reverse(arr, i + 1, n - 1);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
