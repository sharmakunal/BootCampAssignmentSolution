
public class Lexicographical {

	

	public static void printLexicographical(int n){
		
		for(int i = 1; i <= 9; i++){
			printLexicographical(n, i);
		}	
	}
	
	private static void printLexicographical(int n, int numSoFar) {
		if(numSoFar > n){
			return;
		}
		System.out.println(numSoFar);
		for(int i = 0; i < 10; i++){
			printLexicographical(n, numSoFar*10+i);
		}
	}

	public static void main(String[] args) {
		printLexicographical(1000);

	}

}
