package OOPConceptPart2;

public class BMW extends Car {//"has-a relationship"- In this we talk about class to class relationship. we use Extends keyword

	// when same method is present in parent class as well as child class with the
	// same name and same number of arguments is called Method over-riding
	
	public void start() {//Overridden method
		System.out.println("BMW---start");
	}

	public void theftsafety() {
		System.out.println("BMW---theftsaftey");
	}

}
