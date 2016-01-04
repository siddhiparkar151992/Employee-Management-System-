package employeeManagement.companyDatabase.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LoginForm extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton SUBMIT;
	JPanel panel;
	JLabel userLabel, passwordLabel;
	final JTextField text1, text2;

	LoginForm() {
		userLabel = new JLabel();
		userLabel.setText("Username:");
		text1 = new JTextField(15);

		passwordLabel = new JLabel();
		passwordLabel.setText("Password:");
		text2 = new JPasswordField(15);
		SUBMIT = new JButton("SUBMIT");
		panel = new JPanel(new GridLayout(3, 1));
		panel.add(userLabel);
		panel.add(text1);
		panel.add(passwordLabel);
		panel.add(text2);
		panel.add(SUBMIT);
		add(panel, BorderLayout.CENTER);
		SUBMIT.addActionListener(this);
		setTitle("LOGIN FORM");
	}

	public void actionPerformed(ActionEvent ae) {
		String username = text1.getText();
		String password = text2.getText();
		if (username.equals("admin") && password.equals("admin")) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ApplicationForm window = new ApplicationForm();
						window.getFrame().setVisible(true);
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
			
		} else {
			System.out.println("enter the valid username and password");
			JOptionPane.showMessageDialog(this, "Incorrect login or password",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}

