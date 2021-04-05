import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class LoginPage extends JFrame
{
Container c = getContentPane();
JPanel PFlightTypes = new JPanel(null);
JPanel PLogin = new JPanel(null);
JPanel PFlightDetails = new JPanel(null);

public boolean bCheck=true;

JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");

JLabel LUserName, LPassword;

JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
JLabel LInternationalFlight1 = new JLabel("<html><B>International Flight Booking</B></html>");

JTextField TFUserName;
JPasswordField TPPassword;

JButton BLogin;

final Object[] col1 ={ "From", "To", "Price", "Time" };
final Object[] col2 = { "From", "To", "Price", "Time" };
final Object[] col3 = { "From", "To", "Price", "Time" };

final Object[][] row1 = { { "Trivandrum", "Bangalore", "3125", "16:30" }, { "Trivandrum", "Chennai ", "3225", "19:00" }, { "Trivandrum", "Delhi", "1425 ", "08:30" }, { "Trivandrum", "Goa", "1025 ", "09:50" }, { "Trivandrum", "Hyderabad", "1525", "11:00" }, { "Trivandrum", "Kolkata", "3825 ", "05:30" }, { "Trivandrum", "Lucknow", "3025 ", "05:30" }, { "Trivandrum", "Mumbai", "1725", "12:00" }, { "Trivandrum", "Vishakapatnam", "3725", "19:00" }, {"Mumbai", "Pune", "35500", "17:40" }, { "Mumbai", "Delhi", "46558", "19:20" }, {"Delhi", "Goa", "29870", "5:05" }, {"Mumbai", "Chennai", "38900", "8:30" }, {"Chennai", "Portblair", "69250", "11:38"}, {"Pune", "Mumbai", "9000", "17:23"} };
final Object[][] row2 = { { "Trivandrum", "Bali", "21485", "06:20" }, { "Trivandrum", "Bangkok", "9000", "20:45" }, { "Trivandrum", "Cairo", "22975", "10:25" }, { "Trivandrum", "CapeTown", "42500", "16:45" }, { "Trivandrum", "Chicago", "35000", "06:30" }, { "Trivandrum", "Dubai", "12000", "08:15" }, { "Trivandrum", "Frankfurt", "18500", "06:50" }, { "Trivandrum", "HongKong", "20845", "12:00" }, { "Trivandrum", "Istanbul", "22000", "10:45" }, { "Trivandrum", "London", "22600", "14:35" }, { "Trivandrum", "LosAngeles", "35000", "22:00" }, { "Trivandrum", "Melbourne", "27800", "21:15" }, { "Trivandrum", "New York", "32000", "08:50" }, { "Trivandrum", "Paris", "18500", "18:45" }, { "Trivandrum", "Rome", "19900", "20:00"}, { "Trivandrum", "SanFrancisco", "35000", "12:00"}, { "Trivandrum", "shanghai", "24430", "10:15" }, { "Trivandrum", "Singapore", "9000", "21:10" }, { "Trivandrum", "Sydney", "27800", "12:00"}, { "Trivandrum", "Toronto", "35000", "17:00 " }, { "Mumbai", "Bali", "64455", "06:20" }, { "Hyderabad", "Bangkok", "27000", "20:45" }, { "Kolkata", "Cairo", "68925", "10:25" }, { "Mumbai", "CapeTown", "37500", "16:45" }, { "Delhi", "Chicago", "105000", "07:30" }, { "Mumbai", "Dubai", "36000", "06:15" } };
final Object[][] row3 = { { "Trivandrum", "Bangalore", "9375", "16:30" }, { "Trivandrum", "Chennai ", "9675", "19:00" }, { "Trivandrum", "Delhi", "4275", "08:30" }, { "Trivandrum", "Goa", "3075", "09:50" }, { "Trivandrum", "Hyderabad", "4575", "11:00" }, { "Trivandrum", "Kolkata", "11475", "05:30" }, { "Trivandrum", "Lucknow", "9075", "05:30" }, { "Trivandrum", "Mumbai", "5175", "12:00" }, { "Trivandrum", "Vishakapatnam", "11175", "19:00" }, {"Pune", "Hyderabad", "89560", "12:50"}, {"Pune", "Delhi", "78190", "13:49" }, {"Pune", "Lucknow", "91999", "9:31"}, {"Delhi", "New York", "35980", "2:50" }, {"Delhi", "California", "49820", "4:21"}, {"Hyderabad", "New Jersey", "39590", "3:19"} };
final Object[][] row4 = { { "Trivandrum", "Bali", "64455", "06:20" }, { "Trivandrum", "Bangkok", "27000", "20:45" }, { "Trivandrum", "Cairo", "68925", "10:25" }, { "Trivandrum", "CapeTown", "37500", "16:45" }, { "Trivandrum", "Chicago", "105000", "06:30" }, { "Trivandrum", "Dubai", "36000", "08:15" }, { "Trivandrum", "Frankfurt", "55500", "06:50" }, { "Trivandrum", "HongKong", "62535", "12:00" }, { "Trivandrum", "Istanbul", "66000", "10:45" }, { "Trivandrum", "London", "67800", "14:35" }, { "Trivandrum", "LosAngeles", "105000", "22:00" }, { "Trivandrum", "Melbourne", "83400", "21:15" }, { "Trivandrum", "New York", "96000", "08:50" }, { "Trivandrum", "Paris", "55500", "18:45" }, { "Trivandrum", "Rome", "59700", "20:00" }, { "Trivandrum", "SanFrancisco", "105000", "12:00" }, { "Trivandrum", "shanghai", "73290", "10:15" }, { "Trivandrum", "Singapore", "27000", "21:10"}, { "Trivandrum", "Sydney", "83400", "12:00"}, { "Trivandrum", "Toronto", "105000", "17:00" }, { "Mumbai", "Bali", "64455", "06:20" }, { "Hyderabad", "Bangkok", "27000", "20:45" }, { "Kolkata", "Cairo", "68925", "10:25" }, { "Mumbai", "CapeTown", "37500", "16:45" }, { "Delhi", "Chicago", "105000", "06:30" }, { "Mumbai", "Dubai", "36000", "08:15" }, { "Hyderabad", "Frankfurt", "55500", "06:50" }, { "Kolkata", "HongKong", "62535", "12:00" }, { "Kolkata", "Istanbul", "66000", "10:45" }, { "Kolkata", "London", "67800", "14:35" }, { "Mumbai", "LosAngeles", "105000", "22:00" }, { "Chennai", "Melbourne", "83400", "21:15" }, { "Hyderabad", "New York", "96000", "08:50" }, { "Mumbai", "Paris", "55500", "18:45" }, { "Chennai", "Rome", "59700", "20:00" }, { "Mumbai", "SanFrancisco", "105000", "12:00" }, { "Hyderabad", "shanghai", "73290", "10:15" }, { "Chennai", "Singapore", "27000", "21:10"}, { "Mumbai", "Sydney", "83400", "12:00"}, { "Delhi", "Toronto", "105000", "17:00" } };

JTable TDomesticFlight = new JTable(row1, col1);
JTable TInternationalFlight = new JTable(row2, col2);
JTable TDomesticFlight1 = new JTable(row3, col3);
JTable TInternationalFlight1 = new JTable(row4, col2);

JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

ImageIcon img1 = new ImageIcon(this.getClass().getResource("/business.jpg"));
ImageIcon img2 = new ImageIcon(this.getClass().getResource("/economic.jpg"));
ImageIcon img3 = new ImageIcon(this.getClass().getResource("/business1.jpg"));
ImageIcon img4 = new ImageIcon(this.getClass().getResource("/economic1.jpg"));

JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);

public LoginPage()
{
	WindowUtilities.setNativeLookAndFeel();
	setPreferredSize(new Dimension(796,572));

	PFlightTypes.setBackground(Color.white);
	PLogin.setBackground(Color.white);
	PFlightDetails.setBackground(Color.white);

	JSP1.setBounds(0, 340, 790, 200);
	JSP2.setBounds(0, 340, 790, 200);
	JSP3.setBounds(0, 340, 790, 200);
	JSP4.setBounds(0, 340, 790, 200);

	PFlightTypes.setBounds(0,0,500, 340);
	PLogin.setBounds(500,0,350, 340);
	PFlightDetails.setBounds(0,340,790,200);

	LUserName = new JLabel("         User Name ");
	LPassword = new JLabel("         Password ");
	TFUserName = new JTextField(10);
	TPPassword = new JPasswordField(10);
	BLogin = new JButton("Sign In");

	LUserName.setBounds(40, 100, 100, 21);
	LPassword.setBounds(40, 140, 100, 21);
	TFUserName.setBounds(160, 100, 100, 21);
	TPPassword.setBounds(160, 140, 100, 21);
	BLogin.setBounds(160, 200, 100,25);

	LDomesticFlight1.setBounds(60, 60, 138, 20);
	LInternationalFlight1.setBounds(60, 100, 153, 20);

	PLogin.add(LUserName);
	PLogin.add(TFUserName);
	PLogin.add(LPassword);
	PLogin.add(TPPassword);
	PLogin.add(BLogin);

	PFlightDetails.add(JSP1);
	PFlightDetails.add(JSP2);
	PFlightDetails.add(JSP3);
	PFlightDetails.add(JSP4);

	JSP1.setVisible(true);
	JSP2.setVisible(false);
	JSP3.setVisible(false);
	JSP4.setVisible(false);

	LBusiness.setBounds(265, 170, 300, 125);
	LEconomic.setBounds(0, 170, 250, 125);
	LBusiness1.setBounds(280, 200, 135, 60);
	LEconomic1.setBounds(50, 200, 147, 60);

	PFlightTypes.add(LEconomic);
	PFlightTypes.add(LBusiness);
	PFlightTypes.add(LEconomic1);
	PFlightTypes.add(LBusiness1);

	LBusiness.setVisible(false);
	LEconomic1.setVisible(false);
	LBusiness1.setVisible(true);
	LEconomic.setVisible(true);

	LDomesticFlight.setBounds(60, 60, 100, 25);
	LInternationalFlight.setBounds(60, 100, 120, 25);

	c.add(PFlightTypes);
	c.add(PLogin);
	c.add(PFlightDetails);

	PFlightTypes.add(LDomesticFlight);
	PFlightTypes.add(LInternationalFlight);

	pack();
	setVisible(true);

	addWindowListener(new ExitListener());

	LDomesticFlight.addMouseListener(new mouse1(this, true));
	LInternationalFlight.addMouseListener(new mouse1(this, false));

	LDomesticFlight1.addMouseListener(new mouse3(this, true));
	LInternationalFlight1.addMouseListener(new mouse3(this, false));

	LBusiness1.addMouseListener(new mouse2(this, true));
	LEconomic1.addMouseListener(new mouse2(this, false));

	BLogin.addActionListener(new button1(this));
}

public static void main(String args[])
{
	new LoginPage();
}
}


class button1 implements ActionListener
{
LoginPage type;
char[] cCheck, cPassword={'a','d','m','i','n','\0'};
JFrame f;
String sCheck,sCheck1="admin";

public button1(LoginPage type)
{
	this.type = type;
}
public void actionPerformed(ActionEvent e)
{
	cCheck=type.TPPassword.getPassword();
	sCheck = type.TFUserName.getText();
	if ((sCheck1.equals(sCheck)) && check())
	{
		type.PLogin.add(type.LDomesticFlight1);
		type.PLogin.add(type.LInternationalFlight1);

		type.PLogin.remove(type.LUserName);
		type.PLogin.remove(type.TFUserName);
		type.PLogin.remove(type.LPassword);
		type.PLogin.remove(type.TPPassword);
		type.PLogin.remove(type.BLogin);

		type.c.repaint();
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
	}
}
public boolean check()
{
	if (cCheck.length >= 6 || cCheck.length < 4)
		return false;
	for(int i=0;i<=4;i++)
	{
		if(cCheck[i]!=cPassword[i])
			return false;
	}
	return true;
}
}

class mouse1 extends MouseAdapter
{
LoginPage type;
boolean bCheck;

public mouse1(LoginPage type, boolean bCheck)
{
	this.type = type;
	this.bCheck = bCheck;
}
public void mouseEntered(MouseEvent e)
{
	type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}
public void mouseClicked(MouseEvent e)
{
	if(bCheck)
		type.bCheck = true;
	else
		type.bCheck = false;
	type.LEconomic.setVisible(true);
	type.LBusiness1.setVisible(true);
	type.LEconomic1.setVisible(false);
	type.LBusiness.setVisible(false);

	type.JSP1.setVisible(false);
	type.JSP2.setVisible(false);
	type.JSP3.setVisible(false);
	type.JSP4.setVisible(false);
	if(bCheck)
		type.JSP1.setVisible(true);
	else
		type.JSP2.setVisible(true);
}
}

class mouse3 extends MouseAdapter
{
LoginPage type;
boolean bCheck;

public mouse3(LoginPage type, boolean bCheck)
{
	this.type = type;
	this.bCheck = bCheck;
}
public void mouseEntered(MouseEvent e)
{
	type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}
public void mouseClicked(MouseEvent e)
{
	if (bCheck)
		new DomesticFlight(type);
	else
		new InternationalFlight(type);
}
}


class mouse2 extends MouseAdapter
{
LoginPage type;
boolean bCheck;

public mouse2(LoginPage type, boolean bCheck)
{
	this.type = type;
	this.bCheck = bCheck;
}
public void mouseEntered(MouseEvent e)
{
	type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}
public void mouseClicked(MouseEvent e)
{
	if(type.bCheck)
	{
		if (bCheck)
		{
			type.LBusiness1.setVisible(false);
			type.LBusiness.setVisible(true);
			type.LEconomic.setVisible(false);
			type.LEconomic1.setVisible(true);
			type.JSP1.setVisible(false);
			type.JSP2.setVisible(false);
			type.JSP3.setVisible(true);
			type.JSP4.setVisible(false);
		}
		else
		{
			type.LEconomic1.setVisible(false);
			type.LBusiness.setVisible(false);
			type.LBusiness1.setVisible(true);
			type.LEconomic.setVisible(true);
			type.JSP1.setVisible(true);
			type.JSP2.setVisible(false);
			type.JSP3.setVisible(true);
			type.JSP4.setVisible(false);
		}
	}
	else
	{
		if (bCheck)
		{
			type.LBusiness1.setVisible(false);
			type.LBusiness.setVisible(true);
			type.LEconomic.setVisible(false);
			type.LEconomic1.setVisible(true);
			type.JSP1.setVisible(false);
			type.JSP2.setVisible(false);
			type.JSP3.setVisible(false);
			type.JSP4.setVisible(true);
		}
		else
		{
			type.LEconomic1.setVisible(false);
			type.LBusiness.setVisible(false);
			type.LBusiness1.setVisible(true);
			type.LEconomic.setVisible(true);
			type.JSP1.setVisible(false);
			type.JSP2.setVisible(true);
			type.JSP3.setVisible(false);
			type.JSP4.setVisible(false);
		}
	}
}
}

