package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank b = new USBank(); //Error--Cannot instantiate the type USBank
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new  HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		
		//Dynamic polymorphism:
		//child class object can be referred by parent Interface reference variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}

}
