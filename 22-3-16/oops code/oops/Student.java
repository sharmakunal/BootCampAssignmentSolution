package oops;

public class Student {

	public  String name = "abc";
	int rollNo;
	public String batch;
	String address;
	int phoneNo;
	static int numStudents;
	private static Student s;
	//int a[];
	
	  Student(String name){
		this.name = name;
	}
	
//	public  static Student getInstance(String name){
//		if(s == null){
//			s = new Student(name);
//		}
//		return s;
//	}
	
	public void setName(String sName){
		
		name = sName;
	}
	
	public String getName(){
		return name;
	}
	
	public  static int getNumStudents(){
		int a = 10;
//		System.out.println(name+" "+batch);
		
		
		return numStudents;
	}
	
}

