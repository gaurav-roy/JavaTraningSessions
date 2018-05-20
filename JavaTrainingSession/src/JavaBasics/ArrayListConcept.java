package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		
		ar.add(100);// 0	stores the values in the basis of Indexes
		ar.add(200);// 1
		ar.add(300);// 2

		System.out.println(ar.size());
		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());

		ar.add("Tom");// 5
		ar.add("Hello");// 6
		ar.add(12.33);// 7
		ar.add('M');// 8

		System.out.println(ar.size());
		
		ar.remove(8);
		System.out.println(ar.size());

		System.out.println(ar.get(4));
		// System.out.println(ar.get(9)); arrayOutOfBoundsException---Index is from 0 to
		// 8.

		// to print all the values of ArrayList: use for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//generic and non-generic

		// To bound array list to store some particular value of datatype only
		ArrayList<Integer> ar1 = new ArrayList<Integer>();// Here we have bound it with Integer value, so it will not
															// take any datatype value except Integer.
		ar1.add(100);
		// ar1.add("Tom"); The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)--Error
		
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
	//	ar2.add(100); The method add(String) in the type ArrayList<String> is not applicable for the arguments (Integer)--Error
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
