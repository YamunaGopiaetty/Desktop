package banking;

public class ConsumerAccount extends Account {
	 private Person accountHolder;
	
	
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		 super(person,accountNumber, pin,currentBalance);
		  this.accountHolder = person;
		 	  
	}


	
	
}
