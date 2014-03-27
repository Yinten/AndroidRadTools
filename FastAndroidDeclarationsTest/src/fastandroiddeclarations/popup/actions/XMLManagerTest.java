package fastandroiddeclarations.popup.actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fastandroiddeclarations.popup.util.XMLManager;

/**
 * The class <code>XMLManagerTest</code> contains tests for the class <code>{@link XMLManager}</code>.
 *
 * @generatedBy CodePro at 8/31/11 6:20 PM
 * @author ryan.mattison
 * @version $Revision: 1.0 $
 */
public class XMLManagerTest {
	/**
	 * Run the void parseFileXML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:20 PM
	 */
	@Test
	public void testParseFileXML_1()
		throws Exception {
		String filePath = "C:\\Android\\Android Workspace\\AGWeather_OS\\res\\layout\\mapscreen.xml";
		XMLManager xmlManager = new XMLManager(); 
		xmlManager.parseFileXML(filePath);
		String source = xmlManager.getSource();
		System.out.println("Source: " + source);

	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/31/11 6:20 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 8/31/11 6:20 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/31/11 6:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XMLManagerTest.class);
	}
}