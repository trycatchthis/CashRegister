
public class Customer {
	private String firstName;
	private String lastName;
	private int ID; //user account number
	private String address;
	private int DOB;
	
	public Customer(){
		firstName = "";
		lastName = "";
		ID = 00000000;
		address = "";
		DOB = 19000101;
	}
	
	public Customer(String firstName, String lastName, int ID, String address, int DOB) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.address = address;
		this.DOB = DOB;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}
}
