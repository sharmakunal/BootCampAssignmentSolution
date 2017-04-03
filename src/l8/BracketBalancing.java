package l8;

import java.util.Scanner;

public class BracketBalancing {

	public static void main(String[] args) throws StackEmptyException {
		CharStack stack=new CharStack();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str=s.next();
		char ch, temp;
		int flag=0;
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			ch=arr[i];
			if(ch=='{' || ch=='(' || ch=='[')
				stack.push(arr[i]);
			else if(ch=='}' || ch==')' || ch==']')
			{
				try
				{
					temp=stack.pop();
					
					if((ch==']' && temp=='[')||(ch==')' && temp=='(')||(ch=='}' && temp=='{'))
					{
						flag=0;
					}
					else
					{
						flag=1;
						break;
					}
				}
				catch(StackEmptyException e)
				{
					flag=1;
				}
			}
		}
		
		if(flag==1 || stack.size()!=0)
			System.out.println("Not balanced");
		else
			System.out.println("Balanced");
		
		s.close();
	}

}
