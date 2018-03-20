package javastuff;

class Student12{
	
	Student12()
	{
		System.out.println("Constructor...");
	}
	
	Student12(int n){
		this();
		System.out.println("Para  Con...");
	}
	int studentid;
	String name;
	
	void insertRecord(int studentid, String name) {
		
		this.studentid = studentid;
		this.name = name;	
		this.display();
		
		//System.out.println(studentid);
		//System.out.println(name);
	}
	
	
	void display()
	{
	System.out.println(studentid);
	System.out.println(name);
	}
	
}
public class TestStudent2 {

	public static void main(String[] args) {
		
	//	Student12 s1 = new Student12();
		Student12 s2 = new Student12(5);
	//	s1.insertRecord(101, "Pavan");
	//	s1.display();
	//	System.out.println(s1.studentid);
	//	System.out.println(s1.name);
	//	s2.insertRecord(102, "madhu");
	//	s2.display();
		
	}

}
