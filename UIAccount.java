import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class UIAccount extends SiteUI {

	JButton address, order, userInfo, payment, delete;
	
	public UIAccount() {
		super();
	}
	
	public void changeAddress() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		address = new JButton("Address");
		order = new JButton("Order");
		userInfo = new JButton("User Information");
		payment = new JButton("Payment Method");
		delete = new JButton("Delete Account");
		
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
