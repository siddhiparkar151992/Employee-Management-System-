package employeeManagement.companyDatabase.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.salary.Salary;

public class SalaryDetails extends OfficialDetails{

	JTextField textField_Ctc;
	JTextField textField_Hra;
	JTextField textField_Medical;
	JTextField textField_Travel;

	JTextField textField_BasicSalary;
	JTextField textField_ProvidentFund;
	JTextField textField_Conveyance;
	JTextField textField_FixedAllowance;
	JTextField textField_MealCoupon;
	JTextField textField_GiftCard;
	JTextField textField_Gratuity;
	Employee employee=getEmployee();

	/**
	 * @return the textField_Ctc
	 */
	public JTextField getTextField_Ctc() {
		return textField_Ctc;
	}

	/**
	 * @param textField_Ctc
	 *            the textField_Ctc to set
	 */
	public void setTextField_Ctc(JTextField textField_Ctc) {
		this.textField_Ctc = textField_Ctc;
	}

	/**
	 * @return the textField_Hra
	 */
	public JTextField getTextField_Hra() {
		return textField_Hra;
	}

	/**
	 * @param textField_Hra
	 *            the textField_Hra to set
	 */
	public void setTextField_Hra(JTextField textField_Hra) {
		this.textField_Hra = textField_Hra;
	}

	/**
	 * @return the textField_Medical
	 */
	public JTextField getTextField_Medical() {
		return textField_Medical;
	}

	/**
	 * @param textField_Medical
	 *            the textField_Medical to set
	 */
	public void setTextField_Medical(JTextField textField_Medical) {
		this.textField_Medical = textField_Medical;
	}

	/**
	 * @return the textField_Travel
	 */
	public JTextField getTextField_Travel() {
		return textField_Travel;
	}

	/**
	 * @param textField_Travel
	 *            the textField_Travel to set
	 */
	public void setTextField_Travel(JTextField textField_Travel) {
		this.textField_Travel = textField_Travel;
	}

	/**
	 * @return the textField_BasicSalary
	 */
	public JTextField getTextField_BasicSalary() {
		return textField_BasicSalary;
	}

	/**
	 * @param textField_BasicSalary
	 *            the textField_BasicSalary to set
	 */
	public void setTextField_BasicSalary(JTextField textField_BasicSalary) {
		this.textField_BasicSalary = textField_BasicSalary;
	}

	/**
	 * @return the textField_ProvidentFund
	 */
	public JTextField getTextField_ProvidentFund() {
		return textField_ProvidentFund;
	}

	/**
	 * @param textField_ProvidentFund
	 *            the textField_ProvidentFund to set
	 */
	public void setTextField_ProvidentFund(JTextField textField_ProvidentFund) {
		this.textField_ProvidentFund = textField_ProvidentFund;
	}

	/**
	 * @return the textField_Conveyance
	 */
	public JTextField getTextField_Conveyance() {
		return textField_Conveyance;
	}

	/**
	 * @param textField_Conveyance
	 *            the textField_Conveyance to set
	 */
	public void setTextField_Conveyance(JTextField textField_Conveyance) {
		this.textField_Conveyance = textField_Conveyance;
	}

	/**
	 * @return the textField_FixedAllowance
	 */
	public JTextField getTextField_FixedAllowance() {
		return textField_FixedAllowance;
	}

	/**
	 * @param textField_FixedAllowance
	 *            the textField_FixedAllowance to set
	 */
	public void setTextField_FixedAllowance(JTextField textField_FixedAllowance) {
		this.textField_FixedAllowance = textField_FixedAllowance;
	}

	/**
	 * @return the textField_MealCoupon
	 */
	public JTextField getTextField_MealCoupon() {
		return textField_MealCoupon;
	}

	/**
	 * @param textField_MealCoupon
	 *            the textField_MealCoupon to set
	 */
	public void setTextField_MealCoupon(JTextField textField_MealCoupon) {
		this.textField_MealCoupon = textField_MealCoupon;
	}

	/**
	 * @return the textField_GiftCard
	 */
	public JTextField getTextField_GiftCard() {
		return textField_GiftCard;
	}

	/**
	 * @param textField_GiftCard
	 *            the textField_GiftCard to set
	 */
	public void setTextField_GiftCard(JTextField textField_GiftCard) {
		this.textField_GiftCard = textField_GiftCard;
	}

	/**
	 * @return the textField_Gratuity
	 */
	public JTextField getTextField_Gratuity() {
		return textField_Gratuity;
	}

	/**
	 * @param textField_Gratuity
	 *            the textField_Gratuity to set
	 */
	public void setTextField_Gratuity(JTextField textField_Gratuity) {
		this.textField_Gratuity = textField_Gratuity;
	}

	protected JPanel createAccountDetailsPanel(String text) {
		JPanel accountDetailsPanel = new JPanel();

		accountDetailsPanel.setLayout(null);

		JLabel lblAccountDetails = new JLabel("ACCOUNTS DETAILS :");
		lblAccountDetails.setBounds(10, 11, 150, 14);
		accountDetailsPanel.add(lblAccountDetails);

		JLabel lblCtc = new JLabel("CTC :");
		lblCtc.setBounds(20, 36, 140, 14);
		accountDetailsPanel.add(lblCtc);

		textField_Ctc = new JTextField();
		textField_Ctc.setBounds(158, 36, 200, 20);
		accountDetailsPanel.add(textField_Ctc);
		textField_Ctc.setColumns(10);

		JLabel lblBasicSalary = new JLabel("Basic Salary :");
		lblBasicSalary.setBounds(22, 73, 138, 14);
		accountDetailsPanel.add(lblBasicSalary);

		JLabel lblHra = new JLabel("House Rent Allowance :");
		lblHra.setBounds(20, 111, 140, 14);
		accountDetailsPanel.add(lblHra);

		textField_Hra = new JTextField();
		textField_Hra.setBounds(158, 108, 200, 20);
		accountDetailsPanel.add(textField_Hra);
		textField_Hra.setColumns(10);

		JLabel lblProvidentFund = new JLabel("Provident Fund :");
		lblProvidentFund.setBounds(20, 149, 140, 14);
		accountDetailsPanel.add(lblProvidentFund);

		JLabel lblMedical = new JLabel("Medical Allowance :");
		lblMedical.setBounds(20, 192, 140, 14);
		accountDetailsPanel.add(lblMedical);

		textField_Medical = new JTextField();
		textField_Medical.setBounds(158, 189, 200, 20);
		accountDetailsPanel.add(textField_Medical);
		textField_Medical.setColumns(10);

		JLabel lblTravel = new JLabel("Transport Allowance :");
		lblTravel.setBounds(20, 235, 140, 14);
		accountDetailsPanel.add(lblTravel);

		textField_Travel = new JTextField();
		textField_Travel.setBounds(158, 232, 200, 20);
		accountDetailsPanel.add(textField_Travel);
		textField_Travel.setColumns(10);

		textField_BasicSalary = new JTextField();
		textField_BasicSalary.setBounds(158, 70, 200, 20);
		accountDetailsPanel.add(textField_BasicSalary);
		textField_BasicSalary.setColumns(10);

		textField_ProvidentFund = new JTextField();
		textField_ProvidentFund.setBounds(158, 146, 200, 20);
		accountDetailsPanel.add(textField_ProvidentFund);
		textField_ProvidentFund.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(158, 357, 86, 23);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Salary salary=new Salary();
				String ctc=getTextField_Ctc().getText().toString();
				salary.setCtc(Double.valueOf(ctc));
				employee.setSalary(salary);
				getTextField_FixedAllowance().setText(String.valueOf(salary.getFixedAllowance()));
				getTextField_BasicSalary().setText(String.valueOf(salary.getBasic()));
				getTextField_Conveyance().setText(String.valueOf(salary.getConveyance()));
				getTextField_GiftCard().setText(String.valueOf(salary.getGiftCard()));
				getTextField_Gratuity().setText(String.valueOf(salary.getGratuty()));
				getTextField_Travel().setText(String.valueOf(salary.getLeavetravelAllowance()));
				getTextField_ProvidentFund().setText(String.valueOf(salary.getPf()));
				getTextField_Hra().setText(String.valueOf(salary.getHra()));
				getTextField_Medical().setText(String.valueOf(salary.getMedicalReimbursement()));
				getTextField_MealCoupon().setText(String.valueOf(salary.getMealCoupon()));
			}
		});
		accountDetailsPanel.add(btnSubmit);

		JButton btnBack = new JButton("<<Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBack.setBounds(267, 357, 86, 23);
		accountDetailsPanel.add(btnBack);

		JLabel lblConveyance = new JLabel("Conveyance :");
		lblConveyance.setBounds(390, 39, 101, 14);
		accountDetailsPanel.add(lblConveyance);

		textField_Conveyance = new JTextField();
		textField_Conveyance.setBounds(501, 33, 200, 20);
		accountDetailsPanel.add(textField_Conveyance);
		textField_Conveyance.setColumns(10);

		JLabel lblFixedAllowence = new JLabel("Fixed Allowence :");
		lblFixedAllowence.setBounds(390, 73, 100, 14);
		accountDetailsPanel.add(lblFixedAllowence);

		textField_FixedAllowance = new JTextField();
		textField_FixedAllowance.setBounds(501, 70, 200, 20);
		accountDetailsPanel.add(textField_FixedAllowance);
		textField_FixedAllowance.setColumns(10);

		JLabel lblMealCoupon = new JLabel("Meal Coupon :");
		lblMealCoupon.setBounds(390, 111, 100, 14);
		accountDetailsPanel.add(lblMealCoupon);

		textField_MealCoupon = new JTextField();
		textField_MealCoupon.setBounds(501, 108, 200, 20);
		accountDetailsPanel.add(textField_MealCoupon);
		textField_MealCoupon.setColumns(10);

		JLabel lblGiftCard = new JLabel("Gift Card :");
		lblGiftCard.setBounds(390, 149, 100, 14);
		accountDetailsPanel.add(lblGiftCard);

		textField_GiftCard = new JTextField();
		textField_GiftCard.setBounds(501, 149, 200, 20);
		accountDetailsPanel.add(textField_GiftCard);
		textField_GiftCard.setColumns(10);

		JLabel lblGratuity = new JLabel("Gratuity :");
		lblGratuity.setBounds(390, 192, 100, 14);
		accountDetailsPanel.add(lblGratuity);

		textField_Gratuity = new JTextField();
		textField_Gratuity.setBounds(501, 189, 200, 20);
		accountDetailsPanel.add(textField_Gratuity);
		textField_Gratuity.setColumns(10);

		return accountDetailsPanel;
	}
}
