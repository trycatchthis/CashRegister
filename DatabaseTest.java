import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DatabaseTest {


	Vendor vendor = new Vendor("CPS LTD", "Nowhere Street", "Apple XS Max");
	Order order = new Order(100000, "Green", "Bob", "123 Sesame Street", "Standard");
	Database db = new Database();
	
	private ArrayList<Vendor> vend = new ArrayList<Vendor>();
	private ArrayList<Order> ord = new ArrayList<Order>();
	private ArrayList<Customer> cust = new ArrayList<Customer>();

	@Test
	public void testDatabase() {
		vend = new ArrayList<Vendor>();
		ord = new ArrayList<Order>();
		cust = new ArrayList<Customer>();
	}
	
	@Test
	public void testCreateAccount() {
		Customer customer = new Customer("Bob", "Who", 12345, "123 Sesame Street", 19990101);
		db.createAccount(customer);
		System.out.println(cust.size());
		assertEquals(0, cust.size());
	}

	@Test
	public void testDeleteAccount() {
		db.deleteAccount("Bob", "Who");
		assertEquals(0, cust.size());
	}

	@Test
	public void testAddOrder() {
		db.addOrder(order);
		assertEquals(0, ord.size());
	}

	@Test
	public void testCancelOrder() {
		db.cancelOrder(100000);
		assertEquals(0, ord.size());
	}

	@Test
	public void testGetOrder() {
		assertEquals(null, db.getOrder(100000));
	}

	@Test
	public void testAddVendor() {
		db.addVendor(vendor);
		assertEquals(0, vend.size());
	}

	@Test
	public void testDeleteVendor() {
		db.deleteVendor("CPS LTD");
		assertEquals(0, vend.size());
	}


}
