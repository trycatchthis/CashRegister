import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UIBuySmart extends SiteUI {
	
	JLabel colour, year, storage;
	JButton submit;
	JTextArea input;
	
	ArrayList<Item> itemDB = new ArrayList<Item>();
	
	public UIBuySmart() {
		super();
	}

	public void BSFrame() {
		colour = new JLabel("Colour: ");
		year = new JLabel("Year: ");
		storage = new JLabel("Storage: ");
		
		//search button
		submit = new JButton("Search");
		
		input = new JTextArea("Search:");
	}
	
	public Item Search(Item xyz, String name) {
		for (Item find : itemDB) {
			if (find.getName().equals(name)) {
				return find;
			}
		}
		printError();
		return null;
	}
	
	public String printError() {
		return "Sorry, unable to find what you are looking for";
	}
	
}
