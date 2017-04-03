package oops;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.numStudents = 2;
		Student.getNumStudents();
		Student s1 = new Student("abc");
		Student s2 = new  Student("ghi");
		s1 = s2;
		
		
		
	//	s1.name = "@@@@";
		System.out.println("Name : "+s1.name+" rollNo :"+s1.rollNo+" batch "+s1.batch);
//		
//		s1.name = "student1";
		
//		Student s2 = new Student("ghi");
//		s2.name = "student2";
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s2.numStudents);
		s2.numStudents = 3;
//		System.out.println(s1.numStudents);
		
		
	}

}
