package data_structures;

public class QueueUsingArray {
	private int[] data;
	private int front,rear;
	private int size ;
	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}

	public int size(){

		return size;
	}

	public boolean isEmpty(){
		return size() == 0;
	}

	public void enqueue(int element)
	{
		if(size() == data.length){
			// Exception
		}
		if(size() == 0){
			front = (front + 1)% data.length;
		}
		rear = (rear + 1)% data.length;
		data[rear] = element;
		size++;
	}


	public int dequeue(){
		if(size == 0){
			// Exception
			return Integer.MIN_VALUE;
		}
		size--;
		int temp = data[front];
		if(size == 0){
			front = -1;
			rear = -1;
		}
		else
			front = (front + 1)% data.length;
		return temp;
	}

}
