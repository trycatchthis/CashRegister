import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.junit.Test;

public class UICreateAccountTest extends SiteUI{

	JLabel name, password, confirmP, email, address, city, province, postal, phone;
	JTextArea input;
	JScrollPane scroll;
	JButton submit;
	
	@Test
	public void testCreateFrame() {
		name = new JLabel("User name");
		password = new JLabel("Enter password");
		confirmP = new JLabel("Confirm password");
		email = new JLabel("Email");
		address = new JLabel("Address");
		city = new JLabel("City");
		province = new JLabel("Province");
		postal = new JLabel("Postal / Zip code");
		phone = new JLabel("Phone");
		
		submit = new JButton("Submit");
	}

}
