
public class pickUpstore {

	private String name; //store name
	
	Customer customer = new Customer();
	Order order = new Order();
	
	public pickUpstore (){
		name = "";
	}

	public pickUpstore( String name){
		this.name = name;
	}

	Boolean checkPackage(String lastName, String firstName){
		if (lastName.equals(customer.getLastName()) && firstName.equals(customer.getFirstName())){
			return true;
		}
		else return false;
	}
}
