package dsa.java.string;

import java.util.Scanner;

public class palindrome {

	public static boolean isPalindrome(String text) {
		
		text=text.toLowerCase();
		
		if(text==null || text.length()==0)
			return false;

		char[] arr = text.toCharArray();

		int a = 0, b = arr.length-1;
		while (a < b) {
			if (arr[a] == arr[b]) {
				a++;
				b--;
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Text : ");

		String word = sc.next();

		boolean bool = isPalindrome(word);

		if (bool) {
			System.out.println(word + " " + " is a Palindrome.");
		} else {
			System.out.println(word + " " + " is not a Palindrome.");
		}

	}

}
