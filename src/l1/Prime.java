package l1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int no=s.nextInt();

		for(int d=2;d<no;d++){
			if(no%d == 0)
			{
				System.out.print("Not Prime");
		//		return 0;
			}
		}
		System.out.print("Prime");
		s.close();
	}

}
