package fastandroiddeclarations.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.NewWizardAction;
import org.eclipse.ui.internal.ErrorEditorPart;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GenerateXMLTest</code> contains tests for the class <code>{@link GenerateXML}</code>.
 *
 * @generatedBy CodePro at 8/31/11 6:19 PM
 * @author ryan.mattison
 * @version $Revision: 1.0 $
 */
public class GenerateXMLTest {
	/**
	 * Run the GenerateXML() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testGenerateXML_1()
		throws Exception {

		GenerateXML result = new GenerateXML();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_4()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_5()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void run(IAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testRun_6()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();

		fixture.run(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void selectionChanged(IAction,ISelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testSelectionChanged_1()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();
		ISelection selection = new TreeSelection();

		fixture.selectionChanged(action, selection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Run the void setActivePart(IAction,IWorkbenchPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	@Test
	public void testSetActivePart_1()
		throws Exception {
		GenerateXML fixture = new GenerateXML();
		fixture.selectionChanged(new NewWizardAction(), new TreeSelection());
		IAction action = new NewWizardAction();
		IWorkbenchPart targetPart = new ErrorEditorPart();

		fixture.setActivePart(action, targetPart);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:95)
		//       at org.eclipse.ui.actions.NewWizardAction.<init>(NewWizardAction.java:116)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/31/11 6:19 PM
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
	 * @generatedBy CodePro at 8/31/11 6:19 PM
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
	 * @generatedBy CodePro at 8/31/11 6:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GenerateXMLTest.class);
	}
}