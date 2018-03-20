package javastuff;

class Student1{
	int studentid;
	String name;
}

class Student2{
	int studentid = 101;
	String name = "dhananjay";
	
	void sum(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	

}

public class Students {
	
	void sum(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		System.out.println(s1.studentid);
		System.out.println(s1.name);
		Student2 s2 = new Student2();
		System.out.println(" Student2 class info...");
		System.out.println(s2.studentid);
		System.out.println(s2.name);
		s2.sum(6,6);
		
		Students s = new Students();
		s.sum(5, 5);
		
	}

}
