package banking;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName,int idNumber) {
		// complete the function
		    super(idNumber);
	        this.firstName = firstName;
	        this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	

	
}
