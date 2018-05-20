package OOPConceptPart2;

public class TestBMW {

	public static void main(String[] args) {

		// static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuled();
		b.theftsafety();
		b.engine();

		System.out.println("****");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuled();

		System.out.println("****");
		
		//Top Casting
		Car c1 = new BMW();// child class object can be reffered by parent class reference variable is
							// called Dynamic Polymorphism or Run Time polymorphism
		
		c1.start();
		c1.stop();
		c1.refuled();
		
		//Down Casting
		BMW b1 = (BMW)new Car();// This is possible but it will give  ClassCastException 
		

	}

}
