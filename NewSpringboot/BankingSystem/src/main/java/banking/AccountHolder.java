package banking;

public abstract class AccountHolder {
	
	public int idNumber;

	/**
	 * @param idNumber The government-issued ID used during account setup.
	 */
	public AccountHolder(int idNumber){
		// complete the function
		
		this.idNumber =idNumber;
	}

	/**
	 * @return private int {@link AccountHolder#idNumber}
	 */
	public int getIdNumber() {
		// complete the function
		 return idNumber;
	}
}
