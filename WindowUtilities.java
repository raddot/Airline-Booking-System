import javax.swing.UIManager;

public final class WindowUtilities {

	public static void setNativeLookAndFeel() {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
}
