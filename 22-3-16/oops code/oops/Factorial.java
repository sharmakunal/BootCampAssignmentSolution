package oops;

public class Factorial {

	public static int fact(int num) throws InvalidInputException{
		if(num < 0){
			InvalidInputException e = new InvalidInputException();
			throw e;
		}
		if(num == 0){
			return 1;
		}
		return num*fact(num-1);

	}

	public static void main(String args[])  {

		int num = 5;
		//	System.out.println(fact(num));
		try {
			System.out.println(fact(num));
			System.out.println("After Factorial");
		}
		catch (InvalidInputException e) {
			System.out.println("Try with better input !!");	
			return;
		}
	
		finally{
			System.out.println("Inside Finally");
		}
		//	
		System.out.println("After Try Catch");
	}

}
