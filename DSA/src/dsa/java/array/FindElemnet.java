package dsa.java.array;

public class FindElemnet {
	
	public static boolean isElementFound(String[] arr, String target) {
		
		for(String no:arr) {
			if(no==target)
				return true;
		}
		return false;
	}
	public static boolean isElementFound(int[] arr, int target) {
		
		for(int no:arr) {
			if(no==target)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int []arr = {11,22,33,44,5,66,66,77,88,90};
		int target=54;
		
		String []arr1 = {"Abc" ,"CDS","TYU","Apple"};
		String target1="Abc";
		
		System.out.println(isElementFound(arr1,target1));
		System.out.println(isElementFound(arr,target));
		
	}

}
