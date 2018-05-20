package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop
		//disadvantage of while loop- it will generate infinite loop if you don't give incremental or decremental part.
		
		int i = 1; //initialization
		while(i<=10) {//conditional part
			System.out.println(i);
			i = i+1;//Incremental or decremental part
		}
		System.out.println("-------------");
		
		//2. for loop
		
		for(int j=1; j<=10;j++) {//initialization, condition part, Incremental or decremental part
			System.out.println(j);			
		}
		System.out.println("-------------");
		
		//printing from 10 to 1
		
		for (int k=10;k>=1; k--) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
