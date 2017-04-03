package l12;

import java.util.ArrayList;
import java.util.HashMap;

public class MapUse {

	public static void hashCodesDemo() {
		Integer i = 10;
		System.out.println(i.hashCode());
		Object o = new Object();
		System.out.println(o.hashCode());
		String s = "abd";
		System.out.println(s.hashCode());
		String s2 = "abd";
		System.out.println(s2.hashCode());
		String s3 = new String("abd");
		System.out.println(s3.hashCode());
	}
	
	public static ArrayList<Integer> intersection(int a[], int b[]) {
		HashMap<Integer, Integer> frequency = new HashMap<>();
//		for (int i = 0; i < a.length; i++) {
//			int element = a[i];
//		}
		for (int element: a) {
			if (frequency.containsKey(element)) {
				int prevCount = frequency.get(element);
				frequency.put(element, prevCount + 1);
			} else {
				frequency.put(element, 1);
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		
		for (int element: b) {
			if (frequency.containsKey(element)) {
				output.add(element);
				int count = frequency.get(element);
				if (count == 1) {
					frequency.remove(element);
				} else {
					frequency.put(element, count - 1);
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> ourMap = new Map<>();
		ourMap.put("this", 1);
		
		String s = new String("this");
		System.out.println(ourMap.get(s));
		
		
		hashCodesDemo();
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("this", 1);
		Integer value = map.get("this");
		System.out.println(value);
		value = map.remove("this");
		System.out.println(value);
		value = map.get("this");
		System.out.println(value);
	}

}
