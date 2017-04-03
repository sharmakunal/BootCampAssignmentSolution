package a4;

public class PrintSubsequence {


	public static void substrings(String str, String temp)
    {
        if(str.length()==0)
        {
            System.out.print(temp+"  ");
            return;
        }

          substrings(str.substring(1), temp+str.substring(0,1));
          substrings(str.substring(1), temp);
    }
	
	public static void main(String[] args) {
		
		substrings("abcd", "");
	}
}
