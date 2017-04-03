package a3;

public class permutations {

	public static String[] strPermutations(String str)
	{
		if (str.length()==0)
			return null;
		if(str.length()==1)
		{
			String[] result = new String[1];
			result[0] = str;
			return result;
		}
		String[] prevResult=strPermutations(str.substring(1));
		String[] result=new String[str.length()*prevResult.length];
		
		for(int i=0;i<str.length();i++)
			for(int j=0;j<prevResult.length;j++)
				result[(i*prevResult.length)+ j]=prevResult[j].substring(0, i)+str.charAt(0)+prevResult[j].substring(i, prevResult[0].length());
		return result;
	}
	
	public static void main(String[] args) {
		String options[] = strPermutations("abcd");
		for(int i = 0 ; i < options.length ; i++)
			System.out.println(options[i]);

	}

}
