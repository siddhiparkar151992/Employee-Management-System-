package employeeManagement.companyDatabase.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import employeeManagement.companyDatabase.classes.Address;
import employeeManagement.companyDatabase.classes.Client;
import employeeManagement.companyDatabase.classes.Company;
import employeeManagement.companyDatabase.classes.DatabaseConnection;
import employeeManagement.companyDatabase.classes.Department;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Executive;
import employeeManagement.companyDatabase.classes.Manager;
import employeeManagement.companyDatabase.classes.Person;
import employeeManagement.companyDatabase.classes.Project;
import employeeManagement.companyDatabase.databaseOperations.DatabasePopulation;
import employeeManagement.companyDatabase.enums.Departments;
import employeeManagement.companyDatabase.enums.Gender;
import employeeManagement.companyDatabase.enums.Grades;
import employeeManagement.companyDatabase.enums.Projects;
import employeeManagement.companyDatabase.exceptions.InvaliadValueException;
import employeeManagement.companyDatabase.exceptions.InvalidDateFormatExcetion;
import employeeManagement.companyDatabase.inputValidation.classes.IntegerValidator;
import employeeManagement.companyDatabase.inputValidation.classes.StringValidator;
import employeeManagement.companyDatabase.interfaces.AgeCalculator;
import employeeManagement.companyDatabase.salary.Salary;

public class ApplicationForm {
	Employee employee = new Employee();
	Manager manager = new Manager();
	Executive executive = new Executive();
	Connection connection = DatabaseConnection.getConnection();
	DatabasePopulation populate = new DatabasePopulation();
	private JFrame frame;
	JTextField empName;
	JLabel date_Of_Birth;
	JLabel date_Of_Joining;
	JLabel lblYear;
	JLabel lblMonth;
	JLabel lblDay;
	JButton getDesignations;
	JComboBox comboBox_Year;
	JComboBox comboBox_Month;
	JComboBox comboBox_Day;
	JComboBox comboBox_JoiningDay;
	JComboBox comboBox_JoiningMonth;
	JComboBox comboBox_JoiningYear;
	JLabel lblAddress;
	JLabel lblBuildingName;
	JTextField textField_StreetName;
	JTextField textField_BuildingName;
	JLabel lblCountry;
	JComboBox comboBox_Country;

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame
	 *            the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	JLabel lblState;
	JComboBox comboBox_State;
	JLabel lblCity;
	JComboBox comboBox_City;
	JLabel lblZipCode;
	JTextField textField_ZipCode;
	JLabel lblContact;
	JTextField textField_Contact;
	JLabel lblEmail;
	JTextField textField_Email;
	JLabel lblValidatename;
	JLabel lblValidatecontact;
	JLabel lblValidateemail;
	JLabel lblValidatebuildingname;
	JLabel lblValidatestreetname;
	JLabel lblValidatezipcode;
	JComboBox employeeTypeBox;

	JTextField textField_employeeId;
	JTextField textField_DepartmentId;
	JTextField textField_Designation;
	JTextField textField_LocationId;
	JTextField textField_ProjectId;
	JTextField textField_ClientId;
	JTextField textField_CompanyLocation;
	JTextField textField_CompanyName;
	JTextField textField_AccountNo;

	JTextField textField_Ctc;
	JTextField textField_Hra;
	JTextField textField_Medical;
	JTextField textField_Travel;

	JButton getProjectId;
	JTextField textField_BasicSalary;
	JTextField textField_ProvidentFund;
	JTextField textField_Conveyance;
	JTextField textField_FixedAllowance;
	JTextField textField_MealCoupon;
	JTextField textField_GiftCard;
	JTextField textField_Gratuity;
	private JButton btnSubmit;
	private JButton btnClearAll;
	private JButton btnGetSalary;
	JLabel lblGratuity;
	JLabel lblStreetName;
	JLabel lblGender;
	JRadioButton rdbtnMale;
	JRadioButton rdbtnFemale;
	JLabel lblEmployeeId;
	JLabel lblDepartment;
	JLabel lblDepartmentId;
	JLabel lblProjectDetails;
	JLabel lblDepartmentName;
	JLabel lblLocationId;
	JLabel lblGrade;
	JComboBox comboBox_Projectname;
	JLabel lblDesignation;
	JLabel lblProjectName;
	JLabel lblProjectId;
	JLabel lblClient;
	JLabel lbl_ClientId;
	JLabel lblCompanyName;
	JLabel lblCompanyLocation;
	JLabel lblAccounts;
	JLabel lblAccountNo;
	JLabel lblValidatecompname;
	JLabel lblValidateaccountno;
	JComboBox comboBox_Grade;
	JComboBox comboBox_DepartmentName;
	JLabel lblAccountDetails;
	JLabel lblCtc;
	JLabel lblBasicSalary;
	JLabel lblHra;
	JLabel lblProvidentFund;
	JLabel lblMedical;
	JLabel lblTravel;
	JLabel lblConveyance;
	JLabel lblFixedAllowence;
	JLabel lblMealCoupon;
	JLabel lblGiftCard;
	JLabel lblValidateCtc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm window = new ApplicationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 100, 1200, 809);
		frame.setTitle("Employee Management ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel personalDetails = new JLabel("PERSONAL DETAILS :");
		personalDetails.setFont(new Font("Courier New", Font.ITALIC, 12));
		personalDetails.setForeground(Color.GRAY);
		personalDetails.setBounds(10, 11, 128, 14);
		frame.getContentPane().add(personalDetails);

		JLabel emp_Name = new JLabel("Name :");
		emp_Name.setBounds(10, 36, 80, 14);
		frame.getContentPane().add(emp_Name);

		empName = new JTextField();
		empName.setBounds(131, 33, 300, 20);
		frame.getContentPane().add(empName);
		empName.setColumns(10);

		date_Of_Birth = new JLabel("Date Of Birth :");
		date_Of_Birth.setBounds(10, 79, 80, 14);
		frame.getContentPane().add(date_Of_Birth);

		lblYear = new JLabel("Year");
		lblYear.setBounds(131, 60, 26, 14);
		frame.getContentPane().add(lblYear);

		lblMonth = new JLabel("Month");
		lblMonth.setBounds(239, 60, 36, 14);
		frame.getContentPane().add(lblMonth);

		lblDay = new JLabel("Day");
		lblDay.setBounds(342, 60, 31, 14);
		frame.getContentPane().add(lblDay);

		final DefaultComboBoxModel years = new DefaultComboBoxModel();

		for (int i = 1954; i <= 2014; i++) {

			String yrs = Integer.toString(i);

			years.addElement(yrs);

		}

		comboBox_Year = new JComboBox(years);
		comboBox_Year.setBounds(131, 75, 100, 22);
		frame.getContentPane().add(comboBox_Year);

		String[] months = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12" };

		comboBox_Month = new JComboBox(months);
		comboBox_Month.setBounds(235, 75, 100, 22);
		frame.getContentPane().add(comboBox_Month);

		String[] days = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" };
		comboBox_Day = new JComboBox(days);
		comboBox_Day.setBounds(342, 75, 95, 22);
		frame.getContentPane().add(comboBox_Day);

		lblAddress = new JLabel("ADDRESS :");
		lblAddress.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblAddress.setForeground(Color.GRAY);
		lblAddress.setBounds(650, 11, 108, 14);
		frame.getContentPane().add(lblAddress);

		lblBuildingName = new JLabel("Building Name :");
		lblBuildingName.setBounds(650, 33, 50, 14);
		frame.getContentPane().add(lblBuildingName);

		lblStreetName = new JLabel("Street Name :");
		lblStreetName.setBounds(650, 70, 80, 14);
		frame.getContentPane().add(lblStreetName);

		textField_StreetName = new JTextField();
		textField_StreetName.setBounds(768, 65, 300, 20);
		frame.getContentPane().add(textField_StreetName);
		textField_StreetName.setColumns(10);

		textField_BuildingName = new JTextField();
		textField_BuildingName.setBounds(768, 33, 300, 20);
		frame.getContentPane().add(textField_BuildingName);
		textField_BuildingName.setColumns(10);

		JLabel empTypes = new JLabel("Employee Type");
		String[] employees = new String[] { "Employee", "Manager", "Executive" };
		employeeTypeBox = new JComboBox(employees);
		employeeTypeBox.setBounds(530, 33, 100, 20);
		frame.getContentPane().add(employeeTypeBox);

		lblCountry = new JLabel("Country :");
		lblCountry.setBounds(650, 100, 80, 14);
		frame.getContentPane().add(lblCountry);

		String[] country = new String[] { "India", "Usa", "Denmark",
				"Australia", "China", "Russia" };
		comboBox_Country = new JComboBox(country);
		comboBox_Country.setBounds(768, 90, 300, 22);
		comboBox_Country.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				switch (comboBox_Country.getSelectedItem().toString()) {
				case "India":
					String[] states = new String[] { "Maharashtra", "Delhi",
							"Andhra Pradesh", "Rajasthan", "Karnataka" };
					comboBox_State = new JComboBox(states);

					frame.getContentPane().add(comboBox_State);

					switch (comboBox_State.getSelectedItem().toString()) {
					case "Maharashtra":
						String[] mhCities = new String[] { "Mumbai", "Pune",
								"Kolhapur", "Aurangabad", "Nagpur" };
						comboBox_City = new JComboBox(mhCities);
						frame.getContentPane().add(comboBox_City);
						break;
					case "Delhi":
						String[] delhiCities = new String[] {
								"New Delhi Municipal Council", "Hastsal",
								"Deoli", "Delhi Cantonment", "Gokal Pur" };
						comboBox_City = new JComboBox(delhiCities);
						frame.getContentPane().add(comboBox_City);
						break;
					case "Andhra Pradesh":
						String[] apCities = new String[] { "Hyderabad ",
								"Vijayawada", "Warangal", "Visakhapatnam" };
						comboBox_City = new JComboBox(apCities);
						frame.getContentPane().add(comboBox_City);
						break;
					}
					break;

				}
			}

		});

		frame.getContentPane().add(comboBox_Country);

		lblState = new JLabel("State :");
		lblState.setBounds(650, 130, 46, 14);
		frame.getContentPane().add(lblState);

		String[] states = new String[] { "Maharashtra", "Gujrat", "Karnataka",
				"Haryana", "Madhya Pradesh" };
		comboBox_State = new JComboBox(states);
		comboBox_State.setBounds(768, 120, 300, 22);
		frame.getContentPane().add(comboBox_State);

		lblCity = new JLabel("City :");
		lblCity.setBounds(650, 160, 46, 14);
		frame.getContentPane().add(lblCity);

		String[] city = new String[] { "pune", "mumbai", "Kolkata", "Gurgaon",
				"Indore", "Bangalore" };
		comboBox_City = new JComboBox(city);
		comboBox_City.setBounds(768, 150, 300, 22);
		frame.getContentPane().add(comboBox_City);

		lblZipCode = new JLabel("Zip Code :");
		lblZipCode.setBounds(650, 190, 80, 14);
		frame.getContentPane().add(lblZipCode);

		textField_ZipCode = new JTextField();
		textField_ZipCode.setBounds(768, 180, 300, 20);
		frame.getContentPane().add(textField_ZipCode);
		textField_ZipCode.setColumns(10);

		lblContact = new JLabel("Contact :");
		lblContact.setBounds(10, 140, 80, 14);
		frame.getContentPane().add(lblContact);

		textField_Contact = new JTextField();
		textField_Contact.setBounds(131, 135, 300, 20);
		frame.getContentPane().add(textField_Contact);
		textField_Contact.setColumns(10);

		lblEmail = new JLabel("Email :");
		lblEmail.setBounds(10, 170, 46, 14);
		frame.getContentPane().add(lblEmail);

		textField_Email = new JTextField();
		textField_Email.setBounds(131, 161, 300, 20);
		frame.getContentPane().add(textField_Email);
		textField_Email.setColumns(10);

		lblGender = new JLabel("Gender :");
		lblGender.setBounds(10, 105, 70, 14);
		frame.getContentPane().add(lblGender);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(131, 105, 55, 23);
		frame.getContentPane().add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(188, 105, 75, 23);
		frame.getContentPane().add(rdbtnFemale);

		lblValidatename = new JLabel("");
		lblValidatename.setBounds(435, 33, 100, 14);
		frame.getContentPane().add(lblValidatename);

		lblValidatecontact = new JLabel("");
		lblValidatecontact.setBounds(435, 140, 100, 14);
		frame.getContentPane().add(lblValidatecontact);

		lblValidateemail = new JLabel("");
		lblValidateemail.setBounds(435, 170, 100, 14);
		frame.getContentPane().add(lblValidateemail);

		lblValidatebuildingname = new JLabel("");
		lblValidatebuildingname.setBounds(1075, 36, 130, 14);
		frame.getContentPane().add(lblValidatebuildingname);

		lblValidatestreetname = new JLabel("");
		lblValidatestreetname.setBounds(1075, 80, 120, 14);
		frame.getContentPane().add(lblValidatestreetname);

		lblValidatezipcode = new JLabel("");
		lblValidatezipcode.setBounds(1075, 183, 120, 14);
		frame.getContentPane().add(lblValidatezipcode);

		// ****************************************************************************************

		JLabel lblOfficialDetails = new JLabel("OFFICIAL DETAILS :");

		lblOfficialDetails.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblOfficialDetails.setForeground(Color.GRAY);
		lblOfficialDetails.setBounds(10, 280, 150, 14);
		frame.getContentPane().add(lblOfficialDetails);

		lblEmployeeId = new JLabel("Employee Id :");
		lblEmployeeId.setBounds(10, 318, 90, 14);
		frame.getContentPane().add(lblEmployeeId);

		textField_employeeId = new JTextField();
		textField_employeeId.setBounds(131, 318, 200, 20);
		frame.getContentPane().add(textField_employeeId);
		textField_employeeId.setColumns(10);
		textField_employeeId.setEnabled(false);

		lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblDepartment.setForeground(Color.GRAY);
		lblDepartment.setBounds(416, 338, 100, 14);
		frame.getContentPane().add(lblDepartment);

		date_Of_Joining = new JLabel("Joining Date :");
		date_Of_Joining.setBounds(10, 370, 80, 14);
		frame.getContentPane().add(date_Of_Joining);

		lblYear = new JLabel("Year");
		lblYear.setBounds(131, 350, 26, 14);
		frame.getContentPane().add(lblYear);

		lblMonth = new JLabel("Month");
		lblMonth.setBounds(239, 350, 36, 14);
		frame.getContentPane().add(lblMonth);

		lblDay = new JLabel("Day");
		lblDay.setBounds(342, 350, 31, 14);
		frame.getContentPane().add(lblDay);

		final DefaultComboBoxModel yearsJ = new DefaultComboBoxModel();

		for (int i = 1954; i <= 2014; i++) {

			String yrs = Integer.toString(i);

			yearsJ.addElement(yrs);

		}

		comboBox_JoiningYear = new JComboBox(yearsJ);
		comboBox_JoiningYear.setBounds(131, 365, 100, 22);
		frame.getContentPane().add(comboBox_JoiningYear);

		String[] monthsJ = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12" };

		comboBox_JoiningMonth = new JComboBox(monthsJ);
		comboBox_JoiningMonth.setBounds(235, 365, 100, 22);
		frame.getContentPane().add(comboBox_JoiningMonth);

		String[] daysJ = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" };
		comboBox_JoiningDay = new JComboBox(daysJ);
		comboBox_JoiningDay.setBounds(342, 365, 65, 22);
		frame.getContentPane().add(comboBox_JoiningDay);

		lblDepartmentName = new JLabel("Department Name :");
		lblDepartmentName.setBounds(416, 399, 119, 14);
		frame.getContentPane().add(lblDepartmentName);

		lblDepartmentId = new JLabel("Department Id :");
		lblDepartmentId.setBounds(416, 374, 90, 14);
		frame.getContentPane().add(lblDepartmentId);

		lblLocationId = new JLabel("Location Id :");
		lblLocationId.setBounds(416, 426, 90, 14);
		frame.getContentPane().add(lblLocationId);

		textField_LocationId = new JTextField();
		textField_LocationId.setBounds(542, 423, 200, 20);
		frame.getContentPane().add(textField_LocationId);
		textField_LocationId.setColumns(10);
		textField_LocationId.setEnabled(false);

		textField_DepartmentId = new JTextField();
		textField_DepartmentId.setBounds(542, 371, 200, 20);
		frame.getContentPane().add(textField_DepartmentId);
		textField_DepartmentId.setColumns(10);
		textField_DepartmentId.setEnabled(false);

		lblGrade = new JLabel("Grade:");
		lblGrade.setBounds(10, 399, 46, 14);
		frame.getContentPane().add(lblGrade);

		lblDesignation = new JLabel("Designation :");
		lblDesignation.setBounds(10, 423, 90, 14);
		frame.getContentPane().add(lblDesignation);

		textField_Designation = new JTextField();
		textField_Designation.setBounds(131, 423, 200, 20);
		frame.getContentPane().add(textField_Designation);
		textField_Designation.setColumns(10);
		textField_Designation.setEnabled(false);

		getDesignations = new JButton("Get Details");
		getDesignations.setBounds(750, 661, 100, 22);
		getDesignations.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					getOfficialData();
				} catch (InvaliadValueException | InvalidDateFormatExcetion e1) {
					e1.getMessage();
				}

			}
		});
		frame.getContentPane().add(getDesignations);

		lblProjectDetails = new JLabel("PROJECT DETAILS:");
		lblProjectDetails.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblProjectDetails.setForeground(Color.GRAY);
		lblProjectDetails.setBounds(10, 216, 118, 14);
		frame.getContentPane().add(lblProjectDetails);

		lblProjectName = new JLabel("Project Name :");
		lblProjectName.setBounds(10, 241, 90, 14);
		frame.getContentPane().add(lblProjectName);

		String[] projects = new String[] { "SHOPPING_APPLICATION",
				"CAR_SELLING_WEBSITE", "ANDROID_PROJECT", "HRMS",
				"BLACKBERRY_PROJECT", "HADOOP_PROJECT", "COMPANY_WEBSITE" };

		comboBox_Projectname = new JComboBox(projects);
		comboBox_Projectname.setBounds(131, 241, 200, 22);
		frame.getContentPane().add(comboBox_Projectname);

		// frame.getContentPane().add(getProjectId);

		lblProjectId = new JLabel("Project Id :");
		lblProjectId.setBounds(340, 241, 90, 14);
		frame.getContentPane().add(lblProjectId);

		textField_ProjectId = new JTextField();
		textField_ProjectId.setBounds(450, 241, 200, 20);
		frame.getContentPane().add(textField_ProjectId);
		textField_ProjectId.setColumns(10);
		textField_ProjectId.setEnabled(false);

		lblClient = new JLabel("CLIENT DETAILS :");
		lblClient.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblClient.setForeground(Color.GRAY);
		lblClient.setBounds(796, 338, 140, 14);
		frame.getContentPane().add(lblClient);

		lbl_ClientId = new JLabel("Client Id :");
		lbl_ClientId.setBounds(796, 374, 100, 14);
		frame.getContentPane().add(lbl_ClientId);

		textField_ClientId = new JTextField();
		textField_ClientId.setBounds(933, 371, 168, 20);
		frame.getContentPane().add(textField_ClientId);
		textField_ClientId.setColumns(10);
		textField_ClientId.setEnabled(false);

		lblCompanyName = new JLabel("Company Name :");
		lblCompanyName.setBounds(796, 399, 110, 14);
		frame.getContentPane().add(lblCompanyName);

		textField_CompanyName = new JTextField();
		textField_CompanyName.setBounds(933, 399, 168, 20);
		frame.getContentPane().add(textField_CompanyName);
		textField_CompanyName.setColumns(10);

		lblCompanyLocation = new JLabel("Company Location :");
		lblCompanyLocation.setBounds(796, 426, 127, 14);
		frame.getContentPane().add(lblCompanyLocation);

		textField_CompanyLocation = new JTextField();
		textField_CompanyLocation.setBounds(933, 423, 168, 20);
		frame.getContentPane().add(textField_CompanyLocation);
		textField_CompanyLocation.setColumns(10);

		lblAccounts = new JLabel("ACCOUNTS :");
		lblAccounts.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblAccounts.setForeground(Color.GRAY);
		lblAccounts.setBounds(10, 469, 91, 14);
		frame.getContentPane().add(lblAccounts);

		lblAccountNo = new JLabel("Account No. :");
		lblAccountNo.setBounds(10, 494, 100, 14);
		frame.getContentPane().add(lblAccountNo);

		textField_AccountNo = new JTextField();
		textField_AccountNo.setBounds(131, 491, 168, 20);
		frame.getContentPane().add(textField_AccountNo);
		textField_AccountNo.setColumns(10);

		lblValidatecompname = new JLabel("");
		lblValidatecompname.setBounds(1111, 402, 100, 14);
		frame.getContentPane().add(lblValidatecompname);

		lblValidateaccountno = new JLabel("");
		lblValidateaccountno.setBounds(309, 494, 100, 14);
		frame.getContentPane().add(lblValidateaccountno);

		String[] grades = new String[] { "G1", "G2", "G3", "G4", "G5", "G6" };
		comboBox_Grade = new JComboBox(grades);
		comboBox_Grade.setBounds(131, 395, 200, 22);
		frame.getContentPane().add(comboBox_Grade);

		String[] departments = new String[] { "HUMAN_RESOURCE", "SOFTAWRE",
				"HARDWARE", "SECURITY", "ADMINISTRATOR", "ACCOUNTS", "FINANCE" };
		comboBox_DepartmentName = new JComboBox(departments);
		comboBox_DepartmentName.setBounds(542, 399, 200, 22);
		frame.getContentPane().add(comboBox_DepartmentName);

		// ***********************************************************************************************************************

		lblAccountDetails = new JLabel(
				"SALARY DETAILS : (Enter CTC and press Get)");
		lblAccountDetails.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblAccountDetails.setForeground(Color.GRAY);
		lblAccountDetails.setBounds(10, 535, 321, 14);
		frame.getContentPane().add(lblAccountDetails);

		lblCtc = new JLabel("CTC :");
		lblCtc.setBounds(20, 560, 100, 14);
		frame.getContentPane().add(lblCtc);
		
		lblValidateCtc=new JLabel("");
		lblValidateCtc.setBounds(335, 560, 50, 14);
		frame.getContentPane().add(lblValidateCtc);
		
		textField_Ctc = new JTextField();
		textField_Ctc.setBounds(131, 557, 200, 20);
		frame.getContentPane().add(textField_Ctc);
		textField_Ctc.setColumns(10);

		lblBasicSalary = new JLabel("Basic Salary :");
		lblBasicSalary.setBounds(416, 560, 90, 14);
		frame.getContentPane().add(lblBasicSalary);

		lblHra = new JLabel("House Rent Allowance :");
		lblHra.setBounds(796, 560, 140, 14);
		frame.getContentPane().add(lblHra);

		textField_Hra = new JTextField();
		textField_Hra.setBounds(933, 557, 200, 20);
		frame.getContentPane().add(textField_Hra);
		textField_Hra.setColumns(10);
		textField_Hra.setEnabled(false);

		lblProvidentFund = new JLabel("Provident Fund :");
		lblProvidentFund.setBounds(20, 585, 100, 14);
		frame.getContentPane().add(lblProvidentFund);

		lblMedical = new JLabel("Medical Allowance :");
		lblMedical.setBounds(416, 591, 119, 14);
		frame.getContentPane().add(lblMedical);

		textField_Medical = new JTextField();
		textField_Medical.setBounds(542, 585, 200, 20);
		frame.getContentPane().add(textField_Medical);
		textField_Medical.setColumns(10);
		textField_Medical.setEnabled(false);

		lblTravel = new JLabel("Transport Allowance :");
		lblTravel.setBounds(796, 585, 140, 14);
		frame.getContentPane().add(lblTravel);

		textField_Travel = new JTextField();
		textField_Travel.setBounds(933, 582, 200, 20);
		frame.getContentPane().add(textField_Travel);
		textField_Travel.setColumns(10);
		textField_Travel.setEnabled(false);

		textField_BasicSalary = new JTextField();
		textField_BasicSalary.setBounds(542, 557, 200, 20);
		frame.getContentPane().add(textField_BasicSalary);
		textField_BasicSalary.setColumns(10);
		textField_BasicSalary.setEnabled(false);

		textField_ProvidentFund = new JTextField();
		textField_ProvidentFund.setBounds(131, 588, 200, 20);
		frame.getContentPane().add(textField_ProvidentFund);
		textField_ProvidentFund.setColumns(10);
		textField_ProvidentFund.setEnabled(false);

		lblConveyance = new JLabel("Conveyance :");
		lblConveyance.setBounds(20, 610, 101, 14);
		frame.getContentPane().add(lblConveyance);

		textField_Conveyance = new JTextField();
		textField_Conveyance.setBounds(131, 615, 200, 20);
		frame.getContentPane().add(textField_Conveyance);
		textField_Conveyance.setColumns(10);
		textField_Conveyance.setEnabled(false);

		lblFixedAllowence = new JLabel("Fixed Allowence :");
		lblFixedAllowence.setBounds(416, 618, 118, 14);
		frame.getContentPane().add(lblFixedAllowence);

		textField_FixedAllowance = new JTextField();
		textField_FixedAllowance.setBounds(542, 610, 200, 20);
		frame.getContentPane().add(textField_FixedAllowance);
		textField_FixedAllowance.setColumns(10);
		textField_FixedAllowance.setEnabled(false);

		lblMealCoupon = new JLabel("Meal Coupon :");
		lblMealCoupon.setBounds(796, 610, 100, 14);
		frame.getContentPane().add(lblMealCoupon);

		textField_MealCoupon = new JTextField();
		textField_MealCoupon.setBounds(933, 610, 200, 20);
		frame.getContentPane().add(textField_MealCoupon);
		textField_MealCoupon.setColumns(10);
		textField_MealCoupon.setEnabled(false);

		lblGiftCard = new JLabel("Gift Card :");
		lblGiftCard.setBounds(20, 635, 100, 14);
		frame.getContentPane().add(lblGiftCard);

		textField_GiftCard = new JTextField();
		textField_GiftCard.setBounds(131, 646, 200, 20);
		frame.getContentPane().add(textField_GiftCard);
		textField_GiftCard.setColumns(10);
		textField_GiftCard.setEnabled(false);

		lblGratuity = new JLabel("Gratuity :");
		lblGratuity.setBounds(416, 640, 100, 14);
		frame.getContentPane().add(lblGratuity);

		textField_Gratuity = new JTextField();
		textField_Gratuity.setBounds(542, 635, 200, 20);
		frame.getContentPane().add(textField_Gratuity);
		textField_Gratuity.setColumns(10);
		textField_Gratuity.setEnabled(false);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(884, 661, 91, 23);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					getOfficialData();
				} catch (InvaliadValueException | InvalidDateFormatExcetion e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}

			}
		});
		frame.getContentPane().add(btnSubmit);

		btnClearAll = new JButton("Clear");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_AccountNo.setText("");
				textField_BasicSalary.setText("");

			}
		});
		btnClearAll.setBounds(1003, 661, 91, 23);
		frame.getContentPane().add(btnClearAll);

	}

	public void getOfficialData() throws InvaliadValueException, InvalidDateFormatExcetion {
		String employeeType = employeeTypeBox.getSelectedItem().toString();
		switch (employeeType) {
		case "Employee":

			if (StringValidator.isNameValid(empName.getText())) {
				if (IntegerValidator.isContactValid(textField_Contact.getText())) {
					if (StringValidator.isEmailValid(textField_Email.getText())) {
						if (IntegerValidator.isZipValid(textField_ZipCode.getText())) {
							if (rdbtnMale.isSelected()) {
								String genderM = rdbtnMale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(genderM);
								employee.setGender(gender);
							}
							if (rdbtnFemale.isSelected()) {
								String female = rdbtnFemale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(female);
								employee.setGender(gender);
							}
							Address address = new Address(
									textField_StreetName.getText(),
									(Long.parseLong(textField_ZipCode.getText())),
									textField_BuildingName.getText(),
									(String) comboBox_City.getSelectedItem(),
									(String) comboBox_Country.getSelectedItem());
							employee.setName(empName.getText());
							System.out.println(empName.getText());
							employee.setAdress(address);
							AgeCalculator ageCalculator = new AgeCalculator();
							try {
								employee.setBirthDate(concatDate());
								System.out.println("Birthdate" + concatDate());

							} catch (InvalidDateFormatExcetion e3) {
								// TODO Auto-generated catch block
								e3.printStackTrace();
							}
							try {
								employee.setAge(Person
										.calculateAge(concatDate()));
							} catch (InvalidDateFormatExcetion e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							employee.getAge();
							employee.setEmail(textField_Email.getText());
							employee.setContactNo(textField_Contact.getText());

							// setEmployee(employee);
							System.out.println(employee);

						} else {
							lblValidatezipcode.setText("Invaild ZipCode");
						}

					} else {
						lblValidateemail.setText("Invaild email");
					}
				} else {
					lblValidatecontact.setText("Invaild contactNo");
				}
			} else {
				lblValidatename.setText("Invaild name");
			}

			employee.setEmployeeSSN();
			try {
				employee.setDateOfJoining(concatJoiningDate());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Grades grade = Grades.valueOf(comboBox_Grade.getSelectedItem()
					.toString());

			employee.setGrade(grade);
			employee.setDesignations(grade);
			Department dept = new Department();
			System.out.println(grade);

			Departments departmantName = Departments
					.valueOf(comboBox_DepartmentName.getSelectedItem()
							.toString());
			System.out.println(departmantName);
			dept.setDepartmantName(departmantName);
			employee.setDepartment(dept);
			employee.getDepartment().setDeptId(departmantName);
			String id = String.valueOf(employee.getDepartment()
					.getDepartmentId());
			textField_DepartmentId.setText(id);

			textField_Designation.setText(employee.getDesignation().toString());

			textField_employeeId.setText(employee.getEmployeeSSN());

			Client client = new Client();
			Company company = new Company();
			if (StringValidator.isNameValid(textField_CompanyName.getText())) {
				company.setComanyName(textField_CompanyName.getText());
				company.setLocationId();
				company.setLocation(textField_CompanyLocation.getText());

				client.setClientCompany(company);

				client.setClientId();
				employee.setClient(client);

				String cid = String.valueOf(client.getClientId());
				textField_ClientId.setText(cid);

				employee.setClient(client);
				Project project = new Project();
				Projects projName = Projects.valueOf(comboBox_Projectname
						.getSelectedItem().toString());
				project.setProjectName(projName);
				project.generateId(projName);
				textField_ProjectId.setText(String.valueOf(project
						.getProjectId()));
				textField_LocationId.setText(String.valueOf(dept
						.getLocationId()));
				project.setLocation(textField_CompanyLocation.getText());
				textField_CompanyLocation.setText(project.getLocation());
				project.setLocationId(client.getClientCompany().getLocationId());
				employee.setProject(project);
				if (IntegerValidator.isAccountNumberValid(textField_AccountNo.getText())) {
					employee.setAccountNo(Long.parseLong(textField_AccountNo
							.getText()));
				} else {
					lblValidateaccountno.setText("Invalid Number");
				}

				Salary salary = new Salary();
				if(IntegerValidator.isCtcValid(textField_Ctc.getText())){
				String ctc = textField_Ctc.getText();
				salary.setCtc(Double.valueOf(ctc));
				employee.setSalary(salary);
				textField_FixedAllowance.setText(String.valueOf(salary
						.getFixedAllowance()));
				textField_BasicSalary
						.setText(String.valueOf(salary.getBasic()));
				textField_Conveyance.setText(String.valueOf(salary
						.getConveyance()));
				textField_GiftCard
						.setText(String.valueOf(salary.getGiftCard()));
				textField_Gratuity.setText(String.valueOf(salary.getGratuty()));
				textField_Travel.setText(String.valueOf(salary
						.getLeavetravelAllowance()));
				textField_ProvidentFund.setText(String.valueOf(salary.getPf()));
				textField_Hra.setText(String.valueOf(salary.getHra()));
				textField_Medical.setText(String.valueOf(salary
						.getMedicalReimbursement()));
				textField_MealCoupon.setText(String.valueOf(salary
						.getMealCoupon()));
				try {
					populate.insertDataIntoClient(client);
					populate.insertDataIntoComapny(company);
					populate.insertDataIntoDepartment(employee.getDepartment());
					populate.insertDataIntoProject(project);
					populate.insertDataIntoEmployee(employee);

				} catch (InvaliadValueException e) {

					e.getMessage();
				}
				}else{
					lblValidateCtc.setText("Invalid CTC");
				}
			}

			else {
				lblValidatecompname.setText("Invalid Company");
			}
			System.out.println(employee);
			break;
		case "Manager":

			if (empName.getText().matches("([a-zA-Z]+ +)*[a-zA-Z]+")) {
				System.out.println("name");

				if (textField_Contact.getText().matches("\\d{10}")) {
					System.out.println("contact");
					if (textField_Email
							.getText()
							.matches(
									"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
						System.out.println("mail");
						if (textField_ZipCode.getText().matches("\\d{6}")) {
							System.out.println("zipcode");
							if (rdbtnMale.isSelected()) {
								String genderM = rdbtnMale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(genderM);
								manager.setGender(gender);
								System.out.println(genderM);

							}
							if (rdbtnFemale.isSelected()) {
								String female = rdbtnFemale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(female);
								manager.setGender(gender);
								System.out.println(female);
							}
							Address address = new Address(
									textField_StreetName.getText(),
									(Long.parseLong(textField_ZipCode.getText())),
									textField_BuildingName.getText(),
									(String) comboBox_City.getSelectedItem(),
									(String) comboBox_Country.getSelectedItem());

							System.out.println(address);

							manager.setName(empName.getText());
							System.out.println(empName.getText());
							manager.setAdress(address);
							AgeCalculator ageCalculator = new AgeCalculator();
							try {
								manager.setBirthDate(concatDate());
								System.out.println("Birthdate" + concatDate());

							} catch (InvalidDateFormatExcetion e3) {
								// TODO Auto-generated catch block
								e3.printStackTrace();
							}
							try {
								manager.setAge(ageCalculator
										.calculateAge(concatDate()));
							} catch (InvalidDateFormatExcetion e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							manager.getAge();
							manager.setEmail(textField_Email.getText());
							manager.setContactNo(textField_Contact.getText());

							// setEmployee(employee);
							System.out.println(manager);

						}

					}
				}
			}

			Grades grade2 = Grades.valueOf(comboBox_Grade.getSelectedItem()
					.toString());

			manager.setGrade(grade2);
			manager.setDesignations(grade2);
			Department dept2 = new Department();
			System.out.println(grade2);

			Departments departmantName2 = Departments
					.valueOf(comboBox_DepartmentName.getSelectedItem()
							.toString());
			System.out.println(departmantName2);
			dept2.setDepartmantName(departmantName2);
			manager.setDepartment(dept2);
			manager.getDepartment().setDeptId(departmantName2);
			String id2 = String.valueOf(manager.getDepartment()
					.getDepartmentId());
			textField_DepartmentId.setText(id2);

			textField_Designation.setText(manager.getDesignation().toString());

			manager.setEmployeeSSN();
			manager.setManagerSSN();
			textField_employeeId.setText(manager.getManagerSSN());

			try {
				manager.setDateOfJoining(concatJoiningDate());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Client client2 = new Client();
			Company company2 = new Company();
			if (textField_CompanyName.getText().matches(
					"([a-zA-Z]+ +)*[a-zA-Z]+")) {
				company2.setComanyName(textField_CompanyName.getText());
				company2.setLocation(textField_CompanyLocation.getText());
				company2.setLocationId();
				client2.setClientCompany(company2);
				client2.setClientId();
				manager.setClient(client2);
				String cid2 = String.valueOf(client2.getClientId());
				textField_ClientId.setText(cid2);

				manager.setClient(client2);
				Project project2 = new Project();
				Projects projName2 = Projects.valueOf(comboBox_Projectname
						.getSelectedItem().toString());
				project2.setProjectName(projName2);
				project2.generateId(projName2);
				textField_ProjectId.setText(String.valueOf(project2
						.getProjectId()));
				textField_LocationId.setText(String.valueOf(dept2
						.getLocationId()));
				project2.setLocation(textField_CompanyLocation.getText());
				textField_CompanyLocation.setText(project2.getLocation());
				project2.setLocationId(client2.getClientCompany()
						.getLocationId());
				manager.setProject(project2);

				if (textField_AccountNo.getText().matches("\\d{10}")) {
					manager.setAccountNo(Long.parseLong(textField_AccountNo
							.getText()));
				} else {
					lblValidateaccountno.setText("Invalid Number");
				}
				Salary salary2 = new Salary();
				String ctc2 = textField_Ctc.getText().toString();
				salary2.setCtc(Double.valueOf(ctc2));
				manager.setSalary(salary2);
				textField_FixedAllowance.setText(String.valueOf(salary2
						.getFixedAllowance()));
				textField_BasicSalary
						.setText(String.valueOf(salary2.getBasic()));
				textField_Conveyance.setText(String.valueOf(salary2
						.getConveyance()));
				textField_GiftCard
						.setText(String.valueOf(salary2.getGiftCard()));
				textField_Gratuity
						.setText(String.valueOf(salary2.getGratuty()));
				textField_Travel.setText(String.valueOf(salary2
						.getLeavetravelAllowance()));
				textField_ProvidentFund
						.setText(String.valueOf(salary2.getPf()));
				textField_Hra.setText(String.valueOf(salary2.getHra()));
				textField_Medical.setText(String.valueOf(salary2
						.getMedicalReimbursement()));
				textField_MealCoupon.setText(String.valueOf(salary2
						.getMealCoupon()));
				System.out.println(manager);
				populate.insertDataIntoClient(client2);
				populate.insertDataIntoComapny(company2);
				populate.insertDataIntoDepartment(manager.getDepartment());
				populate.insertDataIntoProject(project2);
				populate.insertDataIntoEmployee(manager);
				populate.insertDataIntoManager(manager);
			} else {
				lblValidatecompname.setText("Invalid comoany Name");

			}
			break;
		case "Executive":

			if (empName.getText().matches("([a-zA-Z]+ +)*[a-zA-Z]+")) {
				System.out.println("name");

				if (textField_Contact.getText().matches("\\d{10}")) {
					System.out.println("contact");
					if (textField_Email
							.getText()
							.matches(
									"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
						System.out.println("mail");
						if (textField_ZipCode.getText().matches("\\d{6}")) {
							System.out.println("zipcode");
							if (rdbtnMale.isSelected()) {
								String genderM = rdbtnMale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(genderM);
								executive.setGender(gender);
								System.out.println(genderM);

							}
							if (rdbtnFemale.isSelected()) {
								String female = rdbtnFemale.getText()
										.toUpperCase();
								Gender gender = Gender.valueOf(female);
								executive.setGender(gender);
								System.out.println(female);
							}
							Address address = new Address(
									textField_StreetName.getText(),
									(Long.parseLong(textField_ZipCode.getText())),
									textField_BuildingName.getText(),
									(String) comboBox_City.getSelectedItem(),
									(String) comboBox_Country.getSelectedItem());

							System.out.println(address);

							// employee = new Employee();
							executive.setName(empName.getText());
							System.out.println(empName.getText());
							executive.setAdress(address);
							AgeCalculator ageCalculator = new AgeCalculator();
							try {
								executive.setBirthDate(concatDate());
								System.out.println("Birthdate" + concatDate());

							} catch (InvalidDateFormatExcetion e3) {
								// TODO Auto-generated catch block
								e3.printStackTrace();
							}
							try {
								executive.setAge(ageCalculator
										.calculateAge(concatDate()));
							} catch (InvalidDateFormatExcetion e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							executive.getAge();
							executive.setEmail(textField_Email.getText());
							executive.setContactNo(textField_Contact.getText());

							// setEmployee(employee);
							System.out.println(executive);

						}

					}
				}
			}

			Grades grade3 = Grades.valueOf(comboBox_Grade.getSelectedItem()
					.toString());

			executive.setGrade(grade3);
			executive.setDesignations(grade3);
			Department dept3 = new Department();
			System.out.println(grade3);

			Departments departmantName3 = Departments
					.valueOf(comboBox_DepartmentName.getSelectedItem()
							.toString());
			System.out.println(departmantName3);
			dept3.setDepartmantName(departmantName3);
			executive.setDepartment(dept3);
			executive.getDepartment().setDeptId(departmantName3);
			String id3 = String.valueOf(executive.getDepartment()
					.getDepartmentId());
			textField_DepartmentId.setText(id3);

			textField_Designation
					.setText(executive.getDesignation().toString());

			executive.setEmployeeSSN();
			executive.setExecutiveSSN();
			textField_employeeId.setText(executive.getExecutiveSSN());

			try {
				executive.setDateOfJoining(concatJoiningDate());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Client client3 = new Client();
			Company company3 = new Company();
			if (textField_CompanyName.getText().matches(
					"([a-zA-Z]+ +)*[a-zA-Z]+")) {
				company3.setComanyName(textField_CompanyName.getText());
				company3.setLocation(textField_CompanyLocation.getText());
				company3.setLocationId();
				client3.setClientId();
				client3.setClientCompany(company3);
				executive.setClient(client3);
				String cid3 = String.valueOf(client3.getClientId());
				textField_ClientId.setText(cid3);

				executive.setClient(client3);
				Project project3 = new Project();
				Projects projName3 = Projects.valueOf(comboBox_Projectname
						.getSelectedItem().toString());
				project3.setProjectName(projName3);
				project3.generateId(projName3);
				textField_ProjectId.setText(String.valueOf(project3
						.getProjectId()));
				textField_LocationId.setText(String.valueOf(dept3
						.getLocationId()));
				textField_CompanyLocation.setText(project3.getLocation());
				project3.setLocationId(client3.getClientCompany()
						.getLocationId());
				project3.setLocation(textField_CompanyLocation.getText());
				executive.setProject(project3);

				if (textField_AccountNo.getText().matches("\\d{10}")) {
					executive.setAccountNo(Long.parseLong(textField_AccountNo
							.getText()));
				} else {
					lblValidateaccountno.setText("Invalid Number");
				}
				Salary salary3 = new Salary();
				String ctc3 = textField_Ctc.getText().toString();
				salary3.setCtc(Double.valueOf(ctc3));
				executive.setSalary(salary3);
				textField_FixedAllowance.setText(String.valueOf(salary3
						.getFixedAllowance()));
				textField_BasicSalary
						.setText(String.valueOf(salary3.getBasic()));
				textField_Conveyance.setText(String.valueOf(salary3
						.getConveyance()));
				textField_GiftCard
						.setText(String.valueOf(salary3.getGiftCard()));
				textField_Gratuity
						.setText(String.valueOf(salary3.getGratuty()));
				textField_Travel.setText(String.valueOf(salary3
						.getLeavetravelAllowance()));
				textField_ProvidentFund
						.setText(String.valueOf(salary3.getPf()));
				textField_Hra.setText(String.valueOf(salary3.getHra()));
				textField_Medical.setText(String.valueOf(salary3
						.getMedicalReimbursement()));
				textField_MealCoupon.setText(String.valueOf(salary3
						.getMealCoupon()));

				try {
					populate.insertDataIntoClient(client3);
					populate.insertDataIntoComapny(company3);
					populate.insertDataIntoDepartment(executive.getDepartment());
					populate.insertDataIntoProject(project3);
					populate.insertDataIntoEmployee(executive);
					populate.insertDataIntoManager(executive);

				} catch (InvaliadValueException e) {
					e.getMessage();
				}
			} else {
				lblValidatecompname.setText("Invalid Name");
			}
			System.out.println(executive);

			break;
		}

	}

	public Calendar concatDate() throws InvalidDateFormatExcetion {
		String day = comboBox_Day.getSelectedItem().toString();
		String month = comboBox_Month.getSelectedItem().toString();
		String year = comboBox_Year.getSelectedItem().toString();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		String date = year + "-" + month + "-" + day;
		/**
		 * parse the date and set birthdate on calender instance
		 */
		try {
			calendar.setTime(sdf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendar;
	}

	public Calendar concatJoiningDate() throws ParseException {
		String day = comboBox_JoiningDay.getSelectedItem().toString();
		String month = comboBox_JoiningMonth.getSelectedItem().toString();
		String year = comboBox_JoiningYear.getSelectedItem().toString();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		String date = year + "-" + month + "-" + day;
		/**
		 * parse the date and set birthdate on calender instance
		 */
		calendar.setTime(sdf.parse(date));
		return calendar;
	}
}
