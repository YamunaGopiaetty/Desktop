package banking;

public class Company extends AccountHolder{
	private String companyName;
	private int idNumber;
	

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId);
        this.companyName = companyName;
       // this.idNumber =taxId;
        
	}

	public String getCompanyName() {
		// complete the function
		 return companyName;
	}
}
