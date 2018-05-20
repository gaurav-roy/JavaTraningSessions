package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20); //output-10020-string concatenation concept
		
		//data conversion from String to integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y = "12.33";
	    double d =  Double.parseDouble(y);
	    System.out.println(d+10);
	    
	    //String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);//"200"
		System.out.println(j+20);
		
		String u = "100A";
		Integer.parseInt(u);// It will give Exception-NumberFormatException because with integer value some string value is also present.
		

	}

}
