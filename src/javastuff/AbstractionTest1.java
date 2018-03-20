package javastuff;

abstract class Bike {
	 Bike(){
		 System.out.println("Bike class Constructor");
	 }
	final int a =10;
	 abstract void run();  //  abstract method
     abstract void run1();
	 void sum() {                                       // non abstarct method (or) concrete method
		 System.out.println("sum..");
	 }
}

 abstract class Honda extends Bike{
	  void run() {
		System.out.println("Honda class run...");
	}
}

 class Honda1 extends Honda{
	void run1() {
		System.out.println("Run1..");
	}
	void run() {
		System.out.println("Honda1 class run...");
	}
	 
}


/*class Tvs extends Bike{
	void run() {
		System.out.println("TVS BIKE run method..");
	}
} */


public class AbstractionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bike b = new Bike();
	/*	Honda h = new Honda();
		h.run();
		Tvs t = new Tvs();
		t.run(); */
		
		Bike b = new Honda1();
		b.run();
		b.sum();

	}

}
