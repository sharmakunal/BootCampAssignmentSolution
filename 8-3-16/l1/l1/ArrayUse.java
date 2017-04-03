package l1;

import java.util.Scanner;

public class ArrayUse {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num elements in array");
		int n = s.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + "th element");
			arr[i] = s.nextInt();
		}
		//s.close();
		return arr;
	}

	public static void printArray(int [] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}

	public static void increment(int [] array) {
		array = new int[10];
		array[0]++;
	}

	public static int sum(int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void bubbleSort(int [] array) {
		int j = 0;
		while (j < array.length) {
			for (int i = 0; i < array.length - 1 - j ; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			j++;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[19];
		System.out.println(a);
		printArray(a);

		int[] arr = takeInput();
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();

		printArray(arr);
		increment(arr);
		printArray(arr);
		System.out.println(sum(arr));
	}

}
