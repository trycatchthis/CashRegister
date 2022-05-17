import java.util.ArrayList;

public class Cart {
	Order order;
	Customer customer;
	Shipping method;
	Database db;
	ArrayList<Item> cart;
	private int count = 1; //measure the quantity of an item. For every item in the cart, there exists one already
	private double total = 0; //total value of the cart
	private int orderNumber = 100000; //order number starts from #100000
	
	public Cart() {
		cart = new ArrayList<Item>();
	}
	
	//add an item to the cart
	public void addItem(String name, int code, double price) {
		cart.add(new Item(name, code, price));
	}
	
	//delete an item from the cart
	public void deleteItem(String label) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getName().equals(label)) {
				cart.remove(cart.get(i));
			}
		}
	}
	
	//delete all items from the cart
	public void emptyCart() {
		cart.clear();
	}
	
	public int quantity(int code) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getCode() == code) {
				count++;
			}
		}
		return count;
	}
	
	//update quantity of an item
	public int update(int num) {
		count = num;
		return count;
	}
	
	//return the total value of the cart
	public double totalPrice() {
		for (int i = 0; i < cart.size(); i++) {
			double temp = cart.get(i).getPrice();
			total += temp;
		}
		return total;
	}
	
	public int cartSize() {
		return cart.size();
	}
	
	public void purchase() {
		emptyCart();
		db.addOrder(new Order(orderNumber, customer.getLastName(), customer.getFirstName(), customer.getAddress(), method.getShipMethod()));
		orderNumber++;
	}
}
