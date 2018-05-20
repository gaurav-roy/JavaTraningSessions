package OOPConceptPart1;

public class StaticAndNonStatic {
	// static methods and static variables are not part of object.

	// Global Variables: The scope of global vars will be available across all the
	// functions with some conditions.

	String name = "Tom"; // non- static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {
		// How to call static methods ?
		// 1. Direct calling:
		sum();
		// 2. calling by class name:
		StaticAndNonStatic.sum();

		// How to call static variables ?
		// How to call static methods ?
		// 1. Direct calling:
		System.out.println(age);
		// 2. calling by class name:
		System.out.println(StaticAndNonStatic.age);

		// How to call non-static methods and variable?
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);

		// Can I access static methods by using object reference- yes we an access, but
		// this is not the good way to access. We should call it directly or by using
		// the class name.
		obj.sum(); // warning will be given, see the warning. this is not a good way.

	}

	public void sendMail() { // non-static method
		System.out.println("send mail method");
	}

	public static void sum() { // static method
		System.out.println("Sum Method");
	}

}
