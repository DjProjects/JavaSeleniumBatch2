package javastuff;

class Animal1{
	String color ="White";
	void eat() {
		System.out.println("Animal class eat method");
	}
}

class Dog1 extends Animal1{
	String color ="Black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void bark() {
		System.out.println("Bark");
	}
	void work() {
		super.eat();
		bark();
	}
}

public class SuperStuff {

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		d.printColor();
		d.work();
       // System.out.println(d.color);
	}

}
