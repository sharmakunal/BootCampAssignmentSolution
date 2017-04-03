package data_structures;

public class StackUse {
	
	
	public static void reverse(StackUsingArray stack, StackUsingArray helper) throws StackEmptyException{
		if(stack.size() == 0 || stack.size() == 1){
			return;
		}	
		int temp = stack.pop();
		reverse(stack, helper);
		while(!stack.isEmpty()){
			helper.push(stack.pop());
		}
		stack.push(temp);
		while(!helper.isEmpty()){
			stack.push(helper.pop());
		}	
	}

	public static void main(String[] args) throws StackEmptyException  {
		StackUsingArray stack = new StackUsingArray();
		StackUsingArray helper = new StackUsingArray();
		//reverse(stack,helper);
		
		for(int i = 0; i < 5 ; i++){
			stack.push(i+1);
		}
		//System.out.println("Size : "+ stack.size());
		reverse(stack, helper);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
//			try {
//				System.out.println(stack.pop());
//			} catch (StackEmptyException e) {
//				System.out.println("Never Reach Here");
//			}
		}
//		System.out.println(stack.pop());
	}

}
