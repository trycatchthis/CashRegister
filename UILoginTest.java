import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.Test;

public class UILoginTest extends SiteUI{
	@Test
	public void testLoginFrame() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JPanel loginPanel = new JPanel(); 

		JLabel title = new JLabel("BuySmart");
		title.setFont(new Font("SansSerif", Font.BOLD, 28));
		 
		JButton login = new JButton("Log In");
		login.setFont(new Font("SansSerif", Font.BOLD, 22));
		 
		JButton register = new JButton("Register");
		register.setFont(new Font("SansSerif", Font.BOLD, 22));
		
		loginPanel.add(title);
		loginPanel.add(login);
		loginPanel.add(register);
		panel.add(loginPanel, BorderLayout.NORTH);
	}
}
