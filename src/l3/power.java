package l3;

public class power {
	
	public static int powerx(int x, int n){
		if(n==1)
			return x;
		return x*powerx(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3, n=2;
		
		System.out.println("Power is : "+ powerx(x,n));
	}

}
