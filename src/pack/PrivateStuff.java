package pack;


/*class XYZ{
	private int x =100;
	private void msg() {
		System.out.println("Private method:");
	}
} */

public class PrivateStuff {
	private PrivateStuff(){
		System.out.println("Constructor..");
	}
	private int x =100;
	private void msg() {
		System.out.println("Private method:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateStuff p = new PrivateStuff();
		System.out.println(p.x);
		p.msg();

	}

}
