package JavaBasics;

public class IfElseConditions {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//comparison operator: <,>,<=,>=,==,!=
		
		int c = 30;
		int d = 30;
		
		if(c==d) {
			System.out.println("c an d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		// write a code to find the highetst number.
		int a1 = 100;
		int b1 = 500;
		int c1 = 300;
		
		//nested if-else
		
		if(a1>b1 & a1>c1) {//false & true = false 
			System.out.println("a1 is greatest");
		}
		else if (b1>c1) {
			System.out.println("b1 is greatest");
		}
		else {
			System.out.println("c1 is greatest");
		}

	}
	


}
