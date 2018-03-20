package javastuff;

public class ConstructorStuff {
	int id;
	String name;
	String namee;
	
/*	ConstructorStuff(){     // default constructor
	id = 101;
	name = "dhanu";
	}  */
	
	ConstructorStuff(int i, String n)
	{
		id = i;
		name = n;
	}
	
	ConstructorStuff(int i, String n, String nam)
	{
		id = i;
		name = n;
		namee = nam;
		
		display();
	}
	void display() {
		System.out.println("id value:" +id );
		System.out.println("name value:" +name );
		System.out.println("Another String value:" + namee);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorStuff c = new ConstructorStuff(101, "Dhanu");
		ConstructorStuff c1 = new ConstructorStuff(102, "Madhu", "vijay"); 
		//c.display();
		//c1.display();

	}

}
