package employeeManagement.companyDatabase.presentation;

import javax.swing.JOptionPane;
class Main
{
public static void main(String arg[]) {
	try {
		LoginForm frame = new LoginForm();
		frame.setSize(300, 100);
		frame.setVisible(true);
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	}
}

}
