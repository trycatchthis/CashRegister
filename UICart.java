import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UICart extends SiteUI{

	JLabel product, quantity, price;
	JButton submit, delete;
	JTextArea productOut, quantityOut, priceOut;
	
	public UICart() {
		super();
	}
	
	public void CartFrame() {
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
