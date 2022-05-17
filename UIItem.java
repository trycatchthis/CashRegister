import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class UIItem extends SiteUI{

	JButton add, next, previous;
	JScrollPane page;
	
	public UIItem() {
		super();
	}
	
	public void shopFrame() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		add = new JButton("Add to cart");
		
		ActionListener listener = new CartListener();
		add.addActionListener(listener);
	}
	
	//allows customer to purchase the item in the cart when 'Submit' button is clicked
	class CartListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	
}
