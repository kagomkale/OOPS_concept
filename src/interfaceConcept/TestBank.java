package interfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
	//	USBank.min_bal=200;u cant change value 
		HSBSBank b=new HSBSBank();
		b.carLoan();
		b.credit();
		b.debit();
		b.educationLoan();
		b.transferMoney();
		//dynamic polymorphism
		USBank a=new HSBSBank();
		a.credit();
		a.debit();
		a.transferMoney();
		//HSBSBank c=(HSBSBank)new USBank();
	}

}
