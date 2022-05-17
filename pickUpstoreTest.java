import static org.junit.Assert.*;

import org.junit.Test;

public class pickUpstoreTest {

	pickUpstore store = new pickUpstore();
	
	@Test
	public void testPickUpstore() {
		store = new pickUpstore();
	}

	@Test
	public void testPickUpstoreString() {
		store = new pickUpstore("ABC Store");
	}

	@Test
	public void testCheckPackage() {
		assertEquals(false, store.checkPackage("Green", "Bob"));
	}

}
