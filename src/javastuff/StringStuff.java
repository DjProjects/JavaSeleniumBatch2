package javastuff;

public class StringStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Dhananjaya"; // String literal
		String s1 = "Dhananjaya";
		//String s1  = new String("Dhananjaya");
		
		if(s.equals(s1)) {
			System.out.println("Both strings are equal..");
		}else {
			System.out.println("Both strings are not equal..");
		}
		
		if(s==s1) {
			System.out.println("Both strings references are equal..");
		}else {
			System.out.println("Both strings references are not equal..");
		}
		
		s.concat("Reddy");
		System.out.println(s);
		
		StringBuilder sbu = new StringBuilder();
		
		StringBuffer sb = new StringBuffer("madhu"); 
		sb.append("Reddy");
		System.out.println(sb);
		
		//System.out.println(s.concat("Reddy"));
		//System.out.println(s);
		//String s2 = "Dhananjaya";
		
	/*	char ch[] = {'a','b','c'};
		
		String s3 = new String("Dhananjaya");
		
		String s1 = new String("madhu"); // new operator
		
		String s4 = "";
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.charAt(6));
		
		System.out.println(s.length());
		
		System.out.println(ch.length);
		
		System.out.println(s.subSequence(6, 8));
		
		System.out.println(s.contains("Dh"));
		
		System.out.println(s4.isEmpty());
		System.out.println(s.concat("Reddy"));
		
		System.out.println(s.replace('a', 'x')); */

	}

}
