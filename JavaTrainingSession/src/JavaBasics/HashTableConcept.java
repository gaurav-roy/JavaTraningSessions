package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");

		System.out.println(h.size());

		h.put(1, 100);
		h.put(2, 200);

		System.out.println(h.size());

		System.out.println(h.get(2));

		System.out.println(h.get("C"));
		
		
		//here we are restricting the hashtable class with Integer data type only.
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		// h1.put(1, "Tom"); The method put(Integer, Integer) in the type
		// Hashtable<Integer,Integer> is not applicable for the arguments (int,
		// String)--ERROR
		
		////here we are restricting the hastable class with Integer and String data type only.
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "Tom");
		// h2.put(1, 100); The method put(Integer, String) in the type
		// Hashtable<Integer,String> is not applicable for the arguments (int, int)--ERROR
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
