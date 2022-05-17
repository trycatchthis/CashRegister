import java.util.ArrayList;

public class Database {
	
	private ArrayList<Vendor> vend;
	private ArrayList<Order> ord;
	private ArrayList<Customer> cust;

	
	Order order = new Order();
	
	/*
	 * Customer database
	 */	
	
	public Database() {
		vend = new ArrayList<Vendor>();
		ord = new ArrayList<Order>();
		cust = new ArrayList<Customer>();
	}
//	
//	public Database(ArrayList<Vendor> vend, ArrayList<Order> ord, ArrayList<Customer> cust) {
//		 this.vend = vend;
//		 this.ord = ord;
//		 this.cust = cust;
//	}
	
	public void createAccount(Customer customer) {
		cust.add(customer);
	}
	
	public void deleteAccount(String firstName, String lastName) {
		for (int i = 0; i < cust.size(); i++) {
			if(cust.contains(firstName) && cust.contains(lastName)) {
				cust.remove(i);
			}
		}
	}
	
	
	
	/*
	 * Order database
	 */
	
	public void addOrder(Order order) {
		ord.add(order);
	}
	
	public void cancelOrder(int number) {
		for (int i = 0; i < ord.size(); i++) {
			if (ord.get(i).getNumber() == number) {
				ord.remove(i);	
			}
		}
	}
	
	public Order getOrder(int number) {
		if (order.getNumber() == number) {
			return order;
		}else return null;
	}
	
	
	
	/*
	 * Vendor database
	 */
	
	public void addVendor(Vendor vendor) {
		vend.add(vendor);
	}
	
	public void deleteVendor(String name) {
		for (int i = 0; i < vend.size(); i++) {
			if (ifContainsVendorName(name, i)) {
				vend.remove(i);
			}
		}
	}
	
	public boolean ifContainsVendorName(String name, int i) {
		return name.equals(vend.get(i).getName());
	}
	
	/*
	 * 
	 */
}
