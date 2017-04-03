package a4;

public class PrintCode {

	    public static void main(String args[]) {
	        String str = "1123";
	        String OriginalStrWithSpaces;
	        int k = 0;
	        int n = str.length();
	        for (int i = 0; i < Math.pow(2,n-1); i++)
	        {
	            String BinaryStr = Integer.toBinaryString(i);
	            if(BinaryStr.length() < (str.length()-1))
	            {
	                while(BinaryStr.length() != (str.length() - 1)){
	                    BinaryStr = "0" + BinaryStr;
	                }
	            }
	            OriginalStrWithSpaces = "" + str.charAt(0);
	            k=0;
	            
	            
	            for(int j=0;j<BinaryStr.length();j++)
	            {
	                if(BinaryStr.charAt(j) == '0')
	                    OriginalStrWithSpaces += str.charAt(++k);
	                else{
	                    OriginalStrWithSpaces += " ";
	                    OriginalStrWithSpaces += str.charAt(++k);
	                }
	            }

	            String newString = "";
	            int temp = 0;
	            for (String SplittedStr: OriginalStrWithSpaces.split(" "))
	            {
	                if (Integer.parseInt(SplittedStr) < 26)
	                     newString += (char)(Integer.parseInt(SplittedStr) + 96);
	                    else
	                    temp = 1;
	            }
	            if(temp == 0)
	                System.out.print(newString+"  ");
	        }
	    }
	}
