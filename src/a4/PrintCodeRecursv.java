package a4;

public class PrintCodeRecursv {
	public static void print(String OriginalString,String NewString,int index){
        String DuplicateString = NewString;
       if(index == OriginalString.length())
        {
            System.out.print(NewString+"  ");
            return;
        }
        DuplicateString  += (char)((int)(OriginalString.charAt(index) - 48) + 96);
        print(OriginalString,DuplicateString,index+1);
        DuplicateString = NewString;
        if(index + 1 == OriginalString.length())
            return;
        if(Integer.parseInt(OriginalString.substring(index,index+2)) > 26 )
        {
            return;
        }else {
            DuplicateString += (char) (Integer.parseInt(OriginalString.substring(index, index + 2)) + 96);
            print(OriginalString, DuplicateString, index + 2);
        }
    }
	
	public static void main(String[] args)
	{
		print("1123","",0);
	}
}
