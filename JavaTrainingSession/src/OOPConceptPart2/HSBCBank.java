package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance
	//Is-a relationship-In this we are talking about Interface and class relationship.Here we use implements keyword.
	
	//If a class is implementing any Interface, then it is mandatory to define/override all the methods of Interface
	//overriding from USBank:
	public void credit() {
		System.out.println("HSBC--credit");
	}
	
	public void debit() {
		System.out.println("HSBC---debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");
	}
	
	
	//Overridding from HSBCBnak:
	public void educationLoan() {
		System.out.println("HSBC--educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC---carloan");
	}
	
	//Brazil bank method:Overriding from brazil bank
	public void mutualFunds() {
		System.out.println("HSBC---mutual funds");
	}

}
