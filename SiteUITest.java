import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Test;

public class SiteUITest extends JFrame{

	@Test
	public void testSiteUI() {
		final int FRAME_WIDTH = 400;
		final int FRAME_LENGTH = 750;
		setSize(FRAME_WIDTH, FRAME_LENGTH);
	}

}
