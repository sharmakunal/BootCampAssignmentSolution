package data_structures;

public class StackUsingArray {
	
	private int[] data;
	int top; // index of last Element
	
	
	public StackUsingArray() {
		data = new int[10];
		top  = -1;
	}

	public int size(){
		return top + 1;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public void push(int data){
		if(size() == this.data.length){
			// Exception
		}
		this.data[++top] = data;
	}
	
	
	public  int pop() throws StackEmptyException{
		if(isEmpty()){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	
	
}
