package javastuff;

class Final1{
	static final int z =10; 
	static final int s; 
	static {
		s=100;
	}
    final int x =10;  // final variable declaration and initiallization
    
	final int y;  // blank final variable..
	
	Final1(){
		y=100;
	}
	
	final void run() {
	 System.out.println("Run method in Final1..");
	}
}

class Final2 extends Final1{
/*	void run() {
		System.out.println("Run method overridded in Final2...");
	} */
}

public class FinalStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
