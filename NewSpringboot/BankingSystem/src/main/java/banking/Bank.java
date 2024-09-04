package banking;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private Long accountNumberCounter;
	 //private Map<Long, Account> accounts;

	public Bank() {
		// complete the function
		 this.accounts = new LinkedHashMap<>();
		 accountNumberCounter = 1000L;
		
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
    
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		 CommercialAccount account = new CommercialAccount(company, generateAccountNumber(), pin, startingDeposit);
	      accounts.put(account.getAccountNumber(), account);
	    		  
	      return account.getAccountNumber();
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		 ConsumerAccount account = new ConsumerAccount(person, generateAccountNumber(), pin, startingDeposit);
	        accounts.put(account.getAccountNumber(), account);
	        return account.getAccountNumber();
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account account = accounts.get(accountNumber);
		 if (account != null) {
		        return account.validatePin(pin) || (account instanceof CommercialAccount && pin == getDefaultPin());
		    }
        return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		 Account account = accounts.get(accountNumber);
	        if (account != null) {
	            return account.getBalance();
	        }
	        return -1; // or throw exception
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		
		Account account = accounts.get(accountNumber);
        if (account != null) {
            account.creditAccount(amount);
        }
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.debitAccount(amount);
        }
        return false;
        
	}
	private Long generateAccountNumber() {
        // Implement your logic to generate unique account numbers
        return accountNumberCounter++;
    }
	private int getDefaultPin() {
	    // Define your logic to get the default PIN for commercial accounts
	    return 3333; // For demonstration purposes
	}
	 
}
