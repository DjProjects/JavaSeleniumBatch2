package pack1;

import pack.*;

 class D extends ProtectedStuff{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D p = new D();
		System.out.println(p.z);
		p.msgg();
		PublicStuff p1 = new PublicStuff();
		System.out.println(p1.w);
		p1.publicMsgMethod();

	}

}
