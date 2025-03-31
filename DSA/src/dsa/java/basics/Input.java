package dsa.java.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
	
	public static boolean isPalindrome(String word) {
		
		word=word.toLowerCase();
		char [] arr=word.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		int left=arr[0] ,right=arr.length-1;
		
		while(left<right) {
			if(arr.length == arr.length) {
				left++;
				right--;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		
		String word=sc.next();
		
		boolean bool=isPalindrome(word);

	}

}
