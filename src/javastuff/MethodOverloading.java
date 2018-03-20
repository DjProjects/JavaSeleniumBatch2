package javastuff;

public class MethodOverloading {
	
	
	
	void sum(int a, int b)  
	{
		System.out.println(a+b);
	}
	
	void sum(int a, float b)
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.sum(6, 6);
		m.sum(6, 6.6f);
		m.sum(5, 5, 5);

	}

}
