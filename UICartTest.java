import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.junit.Test;

public class UICartTest {
	
	JLabel product, quantity, price;
	JButton submit, delete;
	JTextArea productOut, quantityOut, priceOut;

	@Test
	public void testCartFrame() {
		product = new JLabel("Product: ");
		quantity = new JLabel("Quantity");
		price = new JLabel("Total Price");
		
		submit = new JButton("Submit");
		delete = new JButton("Delete");
		
		productOut = new JTextArea();
		quantityOut = new JTextArea();
		priceOut = new JTextArea();
	}

}
