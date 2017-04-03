package l12;

public class Outer {
	int i;
	
	public static class Inner {
		// Make it static if you dont need access to data members of outer class
	}
	
	public class Inner2 {
		
	}
	
	public static void main(String args[]) {
		Inner a = new Inner();
		Outer o = new Outer();
		Inner2 b = o.new Inner2();
	}
}
