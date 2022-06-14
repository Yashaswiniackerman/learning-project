

public class StudentConstructor
{
	int id;
	String name;
	String course;
	String email;
	int phn;
	
	public StudentConstructor(int id, String name, String course, String email, int phn)
	{
		this.id=id;
		this.name=name;
		this.course= course;
		this.phn = phn;
	}
	
	public StudentConstructor(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public StudentConstructor()
	{
		
	}
	
	@override
	public class ConstructorDemo
	{
		public static void main(String[] args) 
		{
	    }

    }
}
