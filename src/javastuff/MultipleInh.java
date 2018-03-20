package javastuff;

class A{
	void msg() {
		System.out.println("A class method");
	}
}

class B extends A{
	void msg() {
		System.out.println("A class method");
	}
}

class C extends A {
	void msg() {
		System.out.println("A class method");
	}
}

class D extends C {
	void msg() {
		System.out.println("A class method");
	}
}

public class MultipleInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
