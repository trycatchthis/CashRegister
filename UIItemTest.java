import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Test;

public class UIItemTest extends SiteUI{

	@Test
	public void testShopFrame() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JButton add = new JButton("Add to cart");
		
		ActionListener listener = new CartListener();
		add.addActionListener(listener);
	}
	
	//allows customer to purchase the item in the cart when 'Submit' button is clicked
	class CartListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}

}
