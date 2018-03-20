package javastuff;

class Parent{
	int i = 10;
	
	void parentProperty1() {
		System.out.println("Parent Property:");
	}
}


class Child extends Parent{
	int j = 20;
	void childProperty1() {
		System.out.println("Child Property:");
	}
	
/*	void parentProperty1() {
		System.out.println("My own implementation for parentProperty1()");
	} */
	
}

class child11 extends Child{
	
	void childProperty1() {
		System.out.println("Child11 Property:");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Parent p = new Parent();
		//System.out.println(p.i);
		//p.parentProperty1();
		
		
		Child c = new Child();
		//c.childProperty1();
		c.parentProperty1();
		//System.out.println(c.i);
		//System.out.println(c.j);
		
		Parent p1 = new Child();
		
		
		p1.parentProperty1();
		
	}

}
