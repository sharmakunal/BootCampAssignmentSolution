package a1;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int ch, no, flag=0, check=0, count=0;
		do
		{
			System.out.print("Enter number : ");
			no=s.nextInt();

			if(count==0)
			{
				check=no;
				count++;
			}
			else
			{
				count++;
				if(check>= no && flag==0)
				{
					check=no;
				}
				else if(check<no && flag==0 && count!=2)
				{
					check=no;
					flag=1;
				}
				else if(check<=no && flag==1)
				{
					check=no;
				}
				else if(check>no && flag==1)
				{
					flag=2;
					break;
				}
				else
				{
					flag=2;
					break;
				}
			}
			
			System.out.print("Do you want enter more ( 1 / 0 ): ");
			ch=s.nextInt();
		}while(ch==1);
		if(count==1 || flag==1)
			System.out.println("Valid inputs were given");
		else
			System.out.println("Invlaid inputs");
		System.out.println("");
		s.close();
	}

}
