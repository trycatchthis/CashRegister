
public class Order {
	
	int number; //confirmation number
	String lastName;
	String firstName;
	String address;
	String sMethod; //delivery method
	
	Shipping method = new Shipping();
	
	public Order() {
		number = 00000000;
		lastName = "";
		firstName = "";
		address = "";
		sMethod = "";
	}
	
	public Order(int number, String lastName, String firstName, String address, String sMethod) {
		this.number = number;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.sMethod = sMethod;
	}

	public int getNumber() {
		return number;
	}

	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getsMethod() {
		return sMethod;
	}

	public void setsMethod(String sMethod) {
		this.sMethod = sMethod;
	}
}
