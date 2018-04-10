package javastuff;

class Animal11{  
Animal11(){System.out.println("animal is created");}  
}  
class Dog11 extends Animal11{  
Dog11(){  
	//super();
System.out.println("dog is created");  
}  
}  
class TestSuper4{  
public static void main(String args[]){  
Dog11 d=new Dog11();  
}

}  


