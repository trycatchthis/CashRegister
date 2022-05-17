import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UICheckOut extends SiteUI {
	
	JLabel list, price, ccnumber, date, address, shipping;
	JTextArea output, input;
	JButton submit;
	Cart cart = new Cart();
	
	public UICheckOut() {
		super();
	}
	
	public void purchaseUI() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		submit = new JButton("purchase");
		
		ActionListener listener = new CartListener();
		submit.addActionListener(listener);
	}
	//allows customer to add an item to the cart when 'Add to cart' button is clicked
	class CartListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	
	
	
}
