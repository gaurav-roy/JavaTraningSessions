package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		
		//primitive datatypes are imnt, char, double, boolean only.
	// 1. int-DataType
		int i = 10;
		System.out.println(i);
		i = 20; // this means that we are replacing the value of i by 20.
		int j = 0;
		int k = -1;
		System.out.println(k);
		
	// 2. double-DataType
		double d = 12.22;
		System.out.println(d);
		double d1 = 100; // we can store integers also in double
		
	// 3. char-DataType-only single digit value and must be written in single quotes.
		char c = 'a';
	//	char ch = 'aa'; char should be of single digit only. so this will show error.
		char c1 = 'A';
		char c2 = '1';
		char c3 = '$';
		System.out.println(c3);
		
		
	// 4. boolean: either true or false. we cannot store any other valeus except true or false. these are values and also key words present in java
		
		boolean b1 = true;
		System.out.println(b1);
		boolean b2 =  false;
		
	// 5. String- Its is a class not a datatype. String are always written in double quotes.
		// String is not a primitive datatype. its just a class
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = "1000";
		String s3 = "12.33";
		

	}

}
