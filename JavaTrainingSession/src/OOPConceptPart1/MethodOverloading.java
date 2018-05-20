package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}

	public static void mai(int i) {// we can over load main method also. Generally we don't do that but we can
									// overload it by using different datatypes and different number of arguments

	}

	public static void mai(int i, int j) {// here also same concept of method overloading.

	}
	// we cannot create a method inside a method(Line number 32. remove // and see
	// result.)

	// duplicate methods--i.e., same method name with same number of arguments are
	// not allowed in the same class.(Line number 42. remove // and see result)

	// Method overloading-- when the method name is same with different arguments or
	// input parameters within the same class.
	public void sum() { // 0 input parameter
		System.out.println("Sum method -- Zero parameter");

		// public void test() {
		//
		// }
	}

	public void sum(int i) { // 1 input parameter
		System.out.println("sum method -- one input parameter");
		System.out.println(i);
	}

	// public void sum(int i) { // 1 input parameter
	// System.out.println("sum method -- one input parameter");
	// System.out.println(i);
	// }

	public void sum(int i, int k) { // 2 input parameter
		System.out.println("Sum method -- two input parameter");
		System.out.println(i + k);
	}

	public void sum(double d) { // 1 input parameter--we can create same method name with same number of
								// argument but with different datatypes.
		System.out.println("sum method -- one input parameter");
		System.out.println(d);
	}

}
