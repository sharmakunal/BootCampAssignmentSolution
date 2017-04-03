package l6;

public class Student implements StudentCompare<Student>{
	String name;
	int marks;
	
	
	public void setName(String n)
	{
		this.name=n;
	}

	public void setMarks(int m)
	{
		this.marks=m;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public int compareTo(Student s)
	{
		if(this.marks>s.marks)
			return -1;
		else if(this.marks<s.marks)
			return 1;
		else
			return 0;
	}
}
