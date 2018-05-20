package JavaBasics;

public class B extends A {

	public B() {
		super();
		// super(20,30); Constructor call must be the first statement in a constructor-
		// we cannot use two super keyword in same constructor.
		// System.out.println("child class constructor");
	}

	public B(int i) {
		super(i);
		// System.out.println("child class constructor");
	}

	public B(int i, int j) {
		super(i, j);
		// System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}
