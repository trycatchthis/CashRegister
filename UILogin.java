import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UILogin extends SiteUI{

	JButton login;
	JButton register;
	
	
	public void loginFrame() {
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JPanel loginPanel = new JPanel(); 

		title = new JLabel("BuySmart");
		title.setFont(new Font("SansSerif", Font.BOLD, 28));
		 
		login = new JButton("Log In");
		login.setFont(new Font("SansSerif", Font.BOLD, 22));
		 
		register = new JButton("Register");
		register.setFont(new Font("SansSerif", Font.BOLD, 22));
		
		loginPanel.add(title);
		loginPanel.add(login);
		loginPanel.add(register);
		panel.add(loginPanel, BorderLayout.NORTH);
		
		add(panel, BorderLayout.NORTH);
	}
}
