package l8;

public class LLStack {

	public static void main(String[] args) {
		StackUsingLinkedList stack=new StackUsingLinkedList();
		for(int i=0;i<5;i++)
		{
			stack.pushLL(i);
		}
		
		System.out.println("size is : "+stack.size());
		for(int i=0;i<5;i++)
		{
			System.out.println(stack.popLL());
		}
		


	}

}
