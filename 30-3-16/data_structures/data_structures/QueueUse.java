package data_structures;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray();
		for(int i = 1; i <=5; i++){
			queue.enqueue(i);
		}
		
		System.out.println("Size :"+queue.size());
		while(!queue.isEmpty()){
			System.out.println(queue.dequeue());
		}
	}

}
