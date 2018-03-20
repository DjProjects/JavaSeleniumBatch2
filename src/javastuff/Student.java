package javastuff;

public class Student {
	int studentid;
	//String name = "dhanu";
	String name ;
	
	 static int collegecode;  // static variables
	 static int collegename;
	
	
	
	int sum(int x,int y){             // called method  - x and y are formal variables/parameters  / method heading
		//int z;
		return (x+y);                       // z is local variable  / method definition
		//System.out.println(z);
	} 
	
	//System.out.println(z);
	
	/*void total(int m1, int m2, int m3) {
		int sum = m1+m2+m3;
		System.out.println("sum of 3 subjects:" + sum);
	} */
	
	

	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s.studentid);
		System.out.println(s.name);
		System.out.println(s.sum(4, 5));  // calling or caller method  - 4 and 5 are actual parameters
		//System.out.println(z);
		/*s.total(50,60,70);
		s1.total(60, 70, 80);
		s2.total(70, 70, 80);*/
		
	}

}
