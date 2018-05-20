package OOPConceptPart1;

public class LocalVsGlobalVariables {

	// Global Variables: are always defined after the class. Global variable or class variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {// we can use i=10 only in this main method.
		
		int i = 10; //Local variable for main() method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);// to call or print the value from Global variable, we need to create the object of that class then we can call it.
		System.out.println(obj.age);

	}
	
	public void sum() {// we can use these i, j and age variable inside this sum method only as it is local variable.
		int i = 15; //Local variable for sum() method
		int j = 20;  //Local variable for sum() method
		int age = 25;   //Local variable for sum() method 
		
	}

}
