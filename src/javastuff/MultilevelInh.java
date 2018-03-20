package javastuff;

class Animal{
	void eat() {
		System.out.println("Animal eat method:");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking:");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("BabyDOG is Weeping:");
	}
}

public class MultilevelInh {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.eat();
		

	}

}
