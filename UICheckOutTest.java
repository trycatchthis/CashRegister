import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Test;


public class UICheckOutTest extends SiteUI {


	@Test
	public void testPurchaseUI() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JButton submit = new JButton("purchase");
		
		ActionListener listener = new CartListener();
		submit.addActionListener(listener);
	}
	class CartListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
}
