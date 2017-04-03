package l8;

public class LLQueue {

	public static void main(String[] args) {
		QueueUsingLL queue=new QueueUsingLL();
		for(int i=0;i<5;i++)
		{
			queue.pushLL(i);
		}
		
		System.out.println("size is : "+queue.size());
		for(int i=0;i<5;i++)
		{
			System.out.println(queue.popLL());
		}
		


	}
}
