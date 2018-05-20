package JavaBasics;

public class ConstructorConcept {

	 public ConstructorConcept() {
	 System.out.println("Defalut constructor");
	 }
	
	 public ConstructorConcept(int i) {
	 System.out.println("single parameterize constructor");
	 System.out.println("the value of i " + i);
	 }
	
	 public ConstructorConcept(int i, int j) {
	 System.out.println("single parameterize constructor");
	 System.out.println("the value of i " + i);
	 System.out.println("the value of j " + j);
	 }

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();// when we comment the whole program only this line does not
															// show any error because there is always a hidden
															// constructor present inside constructor class.
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}

}
