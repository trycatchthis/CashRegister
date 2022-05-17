import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	Order order = new Order(100000, "Green", "Bob", "123 Sesame Street", "Standard");
	
	@Test
	public void testGetNumber() {
		assertEquals(100000, order.getNumber());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Green", order.getLastName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Bob", order.getFirstName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("123 Sesame Street", order.getAddress());
	}

	@Test
	public void testSetAddress() {
		order.setAddress("Nowhere");
		assertEquals("Nowhere", order.getAddress());
	}

	@Test
	public void testGetsMethod() {
		assertEquals("Standard", order.getsMethod());
	}

	@Test
	public void testSetsMethod() {
		order.setsMethod("Express");
		assertEquals("Express", order.getsMethod());
	}
}
