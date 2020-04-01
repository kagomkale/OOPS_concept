package interfaceConcept;

public class HSBSBank implements USBank,BrazilBank{//we are achieving multiple inheritance-2 parents of single child
	//is a relationship
//If a class is implementing any interface,then it is mandatory to define/override all te methods of interface.
	//from USBank
	@Override
	public void credit() {
	System.out.println("HSBS Bank-->Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBS Bank-->debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBS Bank-->transfermoney");
		
	}
	//own methods
	public void carLoan() {
	System.out.println("HSBS Bank-->carloan");
	}
	
	public void educationLoan() {
	System.out.println("HSBS Bank-->educationloan");
	}
	//brazilbank 
	public void mutualFund() {
	System.out.println("HSBS Bank-->mutualfund");
		
	}
}
