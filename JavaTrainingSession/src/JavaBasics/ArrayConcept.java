package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array: to store similar data type values in array variable.
		//One Dimensional array because only one square bracket is used[].
		// Advantages of array- we can store multiple values in a single variable  with the similar datatypes.
		//Dis-advantages of array -1. Size is fixed- static array- 
		                               //to overcome this problem we use --[COllections]like ArrayList, HasTable-called as Dynamic array
		                          //2. Stores only similar similar datatypes. ex- if you store int datatype then only int datatypes can be stored.
		                               // to over come this problem, we use [Object Array].
		//1. int array
		//Lowest bound/index = 0
		//uper bound/index = n-1(n is size of the array)
		
		int i[] = new int [4];// we can write this as- int []x = new int[5]- this is also correct and 1D-array
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException- This location of array doesnot exist.
		
		
		System.out.println(i.length);// (i.length) will give the size/lenth of the array
		
		
		//print all the values of array: use for loop concept
		
		for(int j = 0; j<i.length; j++) {
			System.out.println(i[j]);
		}

		
		//2.double array:
		double d[] = new double[3];
		d[0] = 10.33;
		d[1] = 12.33;
		d[2] = 22.33;
		System.out.println(d[2]);
				
		
		//3.char array
		char c[] = new char[3];// in char only single values
		c[0] = 'q';
		c[1] = 'r';
		c[2] = '$';
		System.out.println(c[2]);
		
		//4.boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		
		//5. String array
		
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		System.out.println(s.length);
		
		//6.Object Array(Object is a class)--is used to store values of different Data Types
		//Object class is the super class of all the classes available is Java 
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = "M";
		ob[2] = 25;
		ob[3] = 12.33;
		ob[4] = "London";
		ob[5] = "1/1/2018";
		System.out.println(ob[4]);
		System.out.println(ob.length);
		
		
		
		

	}

}
