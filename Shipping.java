public class Shipping {
	
	// Instance variables
	double methodCost;
	String shipMethod;
	
	// Standard initialization
	public Shipping() {
		shipMethod ="";
	}
	
	// Constructor
	public Shipping(String shipMethod) {
		this.shipMethod = shipMethod;
	}
	
	// getter
	public String getShipMethod() {
		return shipMethod;
	}
	
	// setter
	public void setShipMethod(String method) {
		
		shipMethod = method;
		
		if (method.equals("Express")) {
			methodCost = 20;
		}
		else if (method.equals("Standard")){
			methodCost = 5;
		}
	}
	
	//to string method
	public String toString() {
		return("Hello the method you have picked for shipping is: " + shipMethod +" Costs: $" + methodCost);
	}
}