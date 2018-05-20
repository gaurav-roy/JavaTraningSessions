package OOPConceptPart1;

public class FunctionsInJava {

	// main method--- Starting point of execution
	public static void main(String[] args) {
		
		// main method is void because---it never returns any values.

		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(8, 2);
		System.out.println(div);

	}

	// non static methods-
	// void means-- does not return any value
	public void test() {// no input, no output
		System.out.println("teest method");
	}

	// in pqr method we are returning c and c is int data type so we cannot write
	// void. we have to write int instead of void.
	// return type = int
	public int pqr() {// no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	// return type -- string
	public String qa() {// no input, some output
		System.out.println("qa method");
		String s = "Selenium";

		return s;
	}

	// return type = int
	// x,y--input parameters/ arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;

		return d;
	}

}
