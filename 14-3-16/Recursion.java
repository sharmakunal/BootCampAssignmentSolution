package l3;

public class Recursion {

	public static int[] smallerArray(int [] a) {
		int smallerArray[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			smallerArray[i - 1] = a[i];
		}
		return smallerArray;
	}
	
	// checks if a is sorted from startIndex to end of array
	public static boolean isSortedWithStartIndex(int a[], int startIndex) {
		if (startIndex >= a.length - 1) {
			return true;
		}
		
		if (a[startIndex] > a[startIndex + 1]) {
			return false;
		}
		boolean isSmallerSorted = isSortedWithStartIndex(a, startIndex + 1);
		return isSmallerSorted;
	}
	
	public static boolean isSorted(int [] a) {
		if (a.length == 0 || a.length == 1) {
			return true;
		}
		
		if (a[0] > a[1]) {
			return false;
		}
		
		
		boolean isSmallerSorted = isSorted(smallerArray(a));
		if (isSmallerSorted)
			return true;
		else
			return false;
	}
	
	public static int lastIndex(int [] a) {
		if (a.length == 0)
			return -1;
		int lastIndexInSmaller = lastIndex(smallerArray(a));
		if (lastIndexInSmaller != -1) {
			return lastIndexInSmaller + 1;
		} else {
			if (a[0] == 7) {
				return 0;
			} else {
				return -1;
			}
		}
	}
	
	public static String getOptions(char c) {
		if (c == '2') {
			return "abc";
		}
		if (c == '3') {
			return "def";
		}
		
		if (c == '4') {
			return "ghi";
		}
		
		if (c == '7') {
			return "pqrs";
		}
		return " ";
	}
	
	public static String[] keypadCombinations(String input) {
		
	}
	
	public static String[] subsequences(String input) {
		if (input.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallerOutput = subsequences(input.substring(1));
		String[] output = new String[2 * smallerOutput.length];
		for (int i = 0; i < smallerOutput.length; i++) {
			output[i] = smallerOutput[i];
		}
		
		for (int i = 0; i < smallerOutput.length; i++) {
			output[i + smallerOutput.length] = input.charAt(0) + smallerOutput[i];
		}
		return output;
	}
	
	public static int firstIndex(int [] a) {
		if (a.length == 0)
			return -1;
		if (a[0] == 7)
			return 0;
		
		int indexInSmallerArray = firstIndex(smallerArray(a));
		if (indexInSmallerArray == -1)
			return -1;
		else
			return indexInSmallerArray + 1;
	}
	
	public static boolean contains7(int [] a) {
		if (a.length == 0)
			return false;
		
		if (a[0] == 7) {
			return true;
		}
		boolean smallerArrayContains7 = contains7(smallerArray(a));
		return smallerArrayContains7;
	}
	
	public static int fib(int n) {
		System.out.println(n);
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
	
	public static int fact(int n) {
		if (n == 0)
			return 1;
		
		return n * fact(n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(5);
		String[] output = subsequences("abcd");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
