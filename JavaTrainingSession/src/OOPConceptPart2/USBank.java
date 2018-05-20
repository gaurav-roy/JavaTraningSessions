package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;// this is static in nature by default. we cannot change the value of Interface.
	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	
	//only method declaration
	//no method body---Only method prototype
	//In Interface we can declare the variables and variables are by defalut static in nature.
	//values of variable will not be changed. It is final/constant in nature.
	//No static method in Interface
	//No main() Method in Interface
	// we cannot create the object of Interface
	//Interface are abstract in nature.
	
	

}
