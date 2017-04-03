package l5;

public class StudentUse {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="stu1";
		Student.numStudents=2;
		Student s2=new Student();
		s2.name="stu2";
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(Student.numStudents);
		
		Student s3=new Student();
		
		System.out.println(s3.name+ "  " +s3.roll);

	}

}
