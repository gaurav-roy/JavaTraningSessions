package JavaBasics;

public class IncrementAndDecrementOprerator {

	public static void main(String[] args) {
		//++
		//--
		
		int i = 1;
	    int j = i++;//Post-Increment 
	    System.out.println(i);
	    System.out.println(j);
	    System.out.println("-------------");
		
	    
	    int a = 1;
	    int b = ++a;// Pre-Increment
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println("-------------");
	    
	    
	    int m = 2;
	    int n = m--;//Post-Decrement
	    System.out.println(m);
	    System.out.println(n);
	    System.out.println("-------------");
	    
	    int x = 2;
	    int y = --x; //Pre-Decrement	    
	    System.out.println(x);
	    System.out.println(y);
	}

}
