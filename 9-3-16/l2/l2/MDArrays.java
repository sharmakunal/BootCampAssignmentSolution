package l2;

public class MDArrays {

	public static int[][] takeInput() {
		int [][] array = {{1,2,3}, {4,5, 6}, null, {7,8,9}};
		return array;
	}
	
	public static void print(int [][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				System.out.println("null");
				continue;
			}
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		print(takeInput());
		
		int[][] a = new int[4][];
		
		//a[2] = new int[100];
		
		for (int i = 0; i < 4; i++) {
			a[i] = new int[i + 1];
		}
		System.out.println(a[2][2]);
		
		//for (int i = 0; i < 3; i++)
		
		//int [][] a = new int[5][4];
		//System.out.println(a[3][3]);
		
		System.out.println(a);
		System.out.println(a[3]);
	}

}
