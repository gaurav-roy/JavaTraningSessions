package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + : concatenation operator
		//println-- is used to print on the console with a new line.
		//print-- is just used to print on the console.
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b); // output will be HelloWorld100200. it will not print HelloWorld300. its wrong.
		
		System.out.println(x+y+(a+b));// output will be HelloWorld300 as a+b is written in bracket
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
		
		System.out.println("HelloWorld");
		
		System.out.println("The Value of a is :"+a);// here we used Concatenation operator. This way we can use this operator.
		
		System.out.println("The Value of b is :"+b);
		
		System.out.println("The Addtion of a and b is"+(a+b));// similarly string concatenation.

	}

}
