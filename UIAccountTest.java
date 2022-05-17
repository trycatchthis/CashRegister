import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Test;

public class UIAccountTest extends SiteUI{

	@Test
	public void testChangeAddress() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JButton address = new JButton("Address");
		JButton order = new JButton("Order");
		JButton userInfo = new JButton("User Information");
		JButton payment = new JButton("Payment Method");
		JButton delete = new JButton("Delete Account");
		
		ActionListener adrs = new AddressListener();
		ActionListener ordr= new OrderListener();
		ActionListener usrinf = new UserInfoListener();
		ActionListener pymnt = new PaymentListener();
		ActionListener dlt = new DeleteListener();
		
		address.addActionListener(adrs);
		order.addActionListener(ordr);
		userInfo.addActionListener(usrinf);
		payment.addActionListener(pymnt);
		delete.addActionListener(dlt);
	}
	
	//allows customer to edit address when 'address' button is clicked
	class AddressListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	//allows customer to view or edit order
	class OrderListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	//allows customer to edit user information
	class UserInfoListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	//allows customer to add, delete or edit current payment method
	class PaymentListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
	//allows customer to delete current account
	class DeleteListener implements ActionListener {
		public void actionPerformed(ActionEvent Event) {
			
		}
	}
}
