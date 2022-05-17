import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.junit.Test;

public class UIBuySmartTest extends SiteUI {
	
	JLabel colour, year, storage;
	JButton submit;
	JTextArea input;
	
	ArrayList<Item> itemDB = new ArrayList<Item>();
	
	UIBuySmart test = new UIBuySmart();

	@Test
	public void testBSFrame() {
		colour = new JLabel("Colour: ");
		year = new JLabel("Year: ");
		storage = new JLabel("Storage: ");
		
		//search button
		submit = new JButton("Search");
		
		input = new JTextArea("Search:");
	}

	@Test
	public void testSearch() {
		Item item = new Item("Apple", 111, 699.99);
		itemDB.add(item);
		assertEquals(null, test.Search(item, "Pear"));
	}

	@Test
	public void testPrintError() {
		assertEquals("Sorry, unable to find what you are looking for", test.printError());
	}

}
