package l12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapUse {
	
	public static ArrayList<Integer> intersection(int a[], int b[])
	{
		HashMap<Integer, Integer> frequency=new HashMap<>();
		
		for(int element : a )
		{
			if(frequency.containsKey(element))
			{
				int prevCount=frequency.get(element);
				frequency.put(element, prevCount+1);
			}
			else
				frequency.put(element,1);
		}
		
		ArrayList<Integer> output=new ArrayList<>();
		for(int element : b)
		{
			if(frequency.containsKey(element))
			{
				output.add(element);
				int count=frequency.get(element);
				
				if(count==1)
					frequency.remove(element);
				else
					frequency.put(element, count-1);
			}
		}
		
		return output;
	}
	
	public static void findPairElements(int a[])		//check.. not correct.. maintain count
	{
		HashMap<Integer, Integer> frequency=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(frequency.containsKey(a[i]))
			{
				if(frequency.containsKey(0-a[i]))
				{
				//	System.out.println("yes");
					System.out.print("\n "+a[i]+ "  "+(0-a[i]));
				//	frequency.put(a[i],1);
				}
				int count=frequency.get(a[i]);
				frequency.put(a[i], count+1);
			}
			else
			{
				if(frequency.containsKey(0-a[i]))
				{
					System.out.print("\n "+a[i]+ "  "+(0-a[i]));
					frequency.put(a[i],1);
				}
				else
					frequency.put(a[i],1);
			}
		}
	}
	
	
	public static ArrayList<Integer> removeDuplicates(int a[])
	{
		ArrayList<Integer> output =new ArrayList<>();
		HashMap<Integer, Integer> frequency=new HashMap<>();
		
		for(int element : a)
		{
			if(frequency.containsKey(element))
			{
				
			}
			else
			{
				frequency.put(element,1);
				output.add(element);
			}
		}
		
		return output;
	}
	
	public static void hashCodeDemo()
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		HashMap<String, Integer> map=new HashMap<>();
		map.put("this", 1);
//		int value=map.get("this");
		Integer value=map.get("this");
		System.out.println(value);
		map.remove("this");
		value=map.get("this");
		System.out.println(value);
		
		int n=7;
//		int[] arr=new int[n];
//		
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("\nEnter data : ");
//			arr[i]=s.nextInt();
//		}
		
		int[] arr={2,1,-2,1,2,-2,-1};
		findPairElements(arr);
		
		System.out.println("\nremove duplicates :");
		ArrayList<Integer> output=new ArrayList<>();
		
		output=removeDuplicates(arr);
		
		for(int i=0;i<output.size();i++)
			System.out.print(output.get(i) + "  ");
	}

}
