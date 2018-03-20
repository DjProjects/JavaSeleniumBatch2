package javastuff;


interface I1{
	public static final int x =10;
public abstract void sum();
}

interface I2 extends I1{
public static final int x =10;
public abstract void sum1();
}

/*interface I3 extends I1,I2{
//public abstract void sum();
public abstract void sum1();
} */


abstract class A11 implements I2{
	int a =10;
	final int b =20;
	static int s = 30;
public void sum() {
		System.out.println("sum method...");
	}	
}

class A12 extends A11{
	public void sum1() {
		System.out.println("sum1 method...");
	}
}

public class Interface1{
	public static void main(String[] args) {
		A12 a = new A12();
	    a.sum();
	    a.sum1();
	    
	    I2 i = new A12();
	    i.sum();
	    i.sum1();
	}
}