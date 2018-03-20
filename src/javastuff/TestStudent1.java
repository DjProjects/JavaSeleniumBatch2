package javastuff;

class Student11{
	int studentid;
	String name;
	String collegename;
	int collegecode;
	int subject1;
	int subject2;
	int subject3;
}

public class TestStudent1 {

	public static void main(String[] args) {
		
		Student11 s1 = new Student11();
		s1.studentid = 101;
		s1.name = "pavan";
		Student11 s2 = new Student11();
		s2.studentid = 102;
		s2.name = "vijay";
		Student11 s3 = new Student11();
		s3.studentid = 103;
		s3.name = "Madhu";
		System.out.println(s1.studentid);
		System.out.println(s1.name);

	}

}
