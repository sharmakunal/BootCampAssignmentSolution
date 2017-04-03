package l1;

//import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		
		//double f=3.4;
		//float f1=3.4f;
		
		//Scanner s=new Scanner(System.in);
		
		//int maxValue=s.nextInt();
		
		int fahrenheit=0;
		
		while(fahrenheit<=300)
		{
			int celcius=(int)((5.0/9)*(fahrenheit-32));
			System.out.println(fahrenheit +"\t" +celcius);
			fahrenheit +=20;
		}
		
	}

}
