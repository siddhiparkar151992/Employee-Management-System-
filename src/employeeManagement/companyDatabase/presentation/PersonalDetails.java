package employeeManagement.companyDatabase.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import employeeManagement.companyDatabase.classes.Address;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Executive;
import employeeManagement.companyDatabase.classes.Manager;
import employeeManagement.companyDatabase.controller.PersonalDataController;
import employeeManagement.companyDatabase.enums.Gender;
import employeeManagement.companyDatabase.interfaces.AgeCalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PersonalDetails {
	
	Address address = new Address();
	Employee employee = new Employee();

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the listManagers
	 */
	public JComboBox getListManagers() {
		return listManagers;
	}

	/**
	 * @param listManagers the listManagers to set
	 */
	public void setListManagers(JComboBox listManagers) {
		this.listManagers = listManagers;
	}

	JTextField empName;
	JLabel date_Of_Birth;
	JLabel lblYear;
	JLabel lblMonth;
	JLabel lblDay;
	JComboBox comboBox_Year;
	JComboBox comboBox_Month;
	JComboBox comboBox_Day;
	JLabel lblAge;
	JTextField textField_Age;
	JLabel lblAddress;
	JLabel lblBuildingName;
	JTextField textField_StreetName;
	JTextField textField_BuildingName;
	JLabel lblCountry;
	JComboBox comboBox_Country;
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
	JButton btnNext;
	JRadioButton rdbtnMale;
	JComboBox listManagers;
	JButton btnSave;

	
	/**
	 * @return the textField_StreetName
	 */
	public JTextField getTextField_StreetName() {
		return textField_StreetName;
	}

	/**
	 * @param textField_StreetName
	 *            the textField_StreetName to set
	 */
	public void setTextField_StreetName(JTextField textField_StreetName) {
		this.textField_StreetName = textField_StreetName;
	}

	/**
	 * @return the rdbtnMale
	 */
	public JRadioButton getRdbtnMale() {
		return rdbtnMale;
	}

	/**
	 * @param rdbtnMale
	 *            the rdbtnMale to set
	 */
	public void setRdbtnMale(JRadioButton rdbtnMale) {
		this.rdbtnMale = rdbtnMale;
	}

	/**
	 * @return the rdbtnFemale
	 */
	public JRadioButton getRdbtnFemale() {
		return rdbtnFemale;
	}

	/**
	 * @param rdbtnFemale
	 *            the rdbtnFemale to set
	 */
	public void setRdbtnFemale(JRadioButton rdbtnFemale) {
		this.rdbtnFemale = rdbtnFemale;
	}

	JRadioButton rdbtnFemale;

	/**
	 * @return the empName
	 */
	public JTextField getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(JTextField empName) {
		this.empName = empName;
	}

	/**
	 * @return the date_Of_Birth
	 */
	public JLabel getDate_Of_Birth() {
		return date_Of_Birth;
	}

	/**
	 * @param date_Of_Birth
	 *            the date_Of_Birth to set
	 */
	public void setDate_Of_Birth(JLabel date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	/**
	 * @return the lblYear
	 */
	public JLabel getLblYear() {
		return lblYear;
	}

	/**
	 * @param lblYear
	 *            the lblYear to set
	 */
	public void setLblYear(JLabel lblYear) {
		this.lblYear = lblYear;
	}

	/**
	 * @return the lblMonth
	 */
	public JLabel getLblMonth() {
		return lblMonth;
	}

	/**
	 * @param lblMonth
	 *            the lblMonth to set
	 */
	public void setLblMonth(JLabel lblMonth) {
		this.lblMonth = lblMonth;
	}

	/**
	 * @return the lblDay
	 */
	public JLabel getLblDay() {
		return lblDay;
	}

	/**
	 * @param lblDay
	 *            the lblDay to set
	 */
	public void setLblDay(JLabel lblDay) {
		this.lblDay = lblDay;
	}

	/**
	 * @return the comboBox_Year
	 */
	public JComboBox getComboBox_Year() {
		return comboBox_Year;
	}

	/**
	 * @param comboBox_Year
	 *            the comboBox_Year to set
	 */
	public void setComboBox_Year(JComboBox comboBox_Year) {
		this.comboBox_Year = comboBox_Year;
	}

	/**
	 * @return the comboBox_Month
	 */
	public JComboBox getComboBox_Month() {
		return comboBox_Month;
	}

	/**
	 * @param comboBox_Month
	 *            the comboBox_Month to set
	 */
	public void setComboBox_Month(JComboBox comboBox_Month) {
		this.comboBox_Month = comboBox_Month;
	}

	/**
	 * @return the comboBox_Day
	 */
	public JComboBox getComboBox_Day() {
		return comboBox_Day;
	}

	/**
	 * @param comboBox_Day
	 *            the comboBox_Day to set
	 */
	public void setComboBox_Day(JComboBox comboBox_Day) {
		this.comboBox_Day = comboBox_Day;
	}

	/**
	 * @return the lblAge
	 */
	public JLabel getLblAge() {
		return lblAge;
	}

	/**
	 * @param lblAge
	 *            the lblAge to set
	 */
	public void setLblAge(JLabel lblAge) {
		this.lblAge = lblAge;
	}

	/**
	 * @return the textField_Age
	 */
	public JTextField getTextField_Age() {
		return textField_Age;
	}

	/**
	 * @param textField_Age
	 *            the textField_Age to set
	 */
	public void setTextField_Age(JTextField textField_Age) {
		this.textField_Age = textField_Age;
	}

	/**
	 * @return the lblAddress
	 */
	public JLabel getLblAddress() {
		return lblAddress;
	}

	/**
	 * @param lblAddress
	 *            the lblAddress to set
	 */
	public void setLblAddress(JLabel lblAddress) {
		this.lblAddress = lblAddress;
	}

	/**
	 * @return the lblBuildingName
	 */
	public JLabel getLblBuildingName() {
		return lblBuildingName;
	}

	/**
	 * @param lblBuildingName
	 *            the lblBuildingName to set
	 */
	public void setLblBuildingName(JLabel lblBuildingName) {
		this.lblBuildingName = lblBuildingName;
	}

	/**
	 * @return the textField_BuildingName
	 */
	public JTextField getTextField_BuildingName() {
		return textField_BuildingName;
	}

	/**
	 * @param textField_BuildingName
	 *            the textField_BuildingName to set
	 */
	public void setTextField_BuildingName(JTextField textField_BuildingName) {
		this.textField_BuildingName = textField_BuildingName;
	}

	/**
	 * @return the lblCountry
	 */
	public JLabel getLblCountry() {
		return lblCountry;
	}

	/**
	 * @param lblCountry
	 *            the lblCountry to set
	 */
	public void setLblCountry(JLabel lblCountry) {
		this.lblCountry = lblCountry;
	}

	/**
	 * @return the comboBox_Country
	 */
	public JComboBox getComboBox_Country() {
		return comboBox_Country;
	}

	/**
	 * @param comboBox_Country
	 *            the comboBox_Country to set
	 */
	public void setComboBox_Country(JComboBox comboBox_Country) {
		this.comboBox_Country = comboBox_Country;
	}

	/**
	 * @return the lblState
	 */
	public JLabel getLblState() {
		return lblState;
	}

	/**
	 * @param lblState
	 *            the lblState to set
	 */
	public void setLblState(JLabel lblState) {
		this.lblState = lblState;
	}

	/**
	 * @return the comboBox_State
	 */
	public JComboBox getComboBox_State() {
		return comboBox_State;
	}

	/**
	 * @param comboBox_State
	 *            the comboBox_State to set
	 */
	public void setComboBox_State(JComboBox comboBox_State) {
		this.comboBox_State = comboBox_State;
	}

	/**
	 * @return the lblCity
	 */
	public JLabel getLblCity() {
		return lblCity;
	}

	/**
	 * @param lblCity
	 *            the lblCity to set
	 */
	public void setLblCity(JLabel lblCity) {
		this.lblCity = lblCity;
	}

	/**
	 * @return the comboBox_City
	 */
	public JComboBox getComboBox_City() {
		return comboBox_City;
	}

	/**
	 * @param comboBox_City
	 *            the comboBox_City to set
	 */
	public void setComboBox_City(JComboBox comboBox_City) {
		this.comboBox_City = comboBox_City;
	}

	/**
	 * @return the lblZipCode
	 */
	public JLabel getLblZipCode() {
		return lblZipCode;
	}

	/**
	 * @param lblZipCode
	 *            the lblZipCode to set
	 */
	public void setLblZipCode(JLabel lblZipCode) {
		this.lblZipCode = lblZipCode;
	}

	/**
	 * @return the textField_ZipCode
	 */
	public JTextField getTextField_ZipCode() {
		return textField_ZipCode;
	}

	/**
	 * @param textField_ZipCode
	 *            the textField_ZipCode to set
	 */
	public void setTextField_ZipCode(JTextField textField_ZipCode) {
		this.textField_ZipCode = textField_ZipCode;
	}

	/**
	 * @return the lblContact
	 */
	public JLabel getLblContact() {
		return lblContact;
	}

	/**
	 * @param lblContact
	 *            the lblContact to set
	 */
	public void setLblContact(JLabel lblContact) {
		this.lblContact = lblContact;
	}

	/**
	 * @return the textField_Contact
	 */
	public JTextField getTextField_Contact() {
		return textField_Contact;
	}

	/**
	 * @param textField_Contact
	 *            the textField_Contact to set
	 */
	public void setTextField_Contact(JTextField textField_Contact) {
		this.textField_Contact = textField_Contact;
	}

	/**
	 * @return the lblEmail
	 */
	public JLabel getLblEmail() {
		return lblEmail;
	}

	/**
	 * @param lblEmail
	 *            the lblEmail to set
	 */
	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	/**
	 * @return the textField_Email
	 */
	public JTextField getTextField_Email() {
		return textField_Email;
	}

	/**
	 * @param textField_Email
	 *            the textField_Email to set
	 */
	public void setTextField_Email(JTextField textField_Email) {
		this.textField_Email = textField_Email;
	}

	/**
	 * @return the btnNext
	 */
	public JButton getBtnNext() {
		return btnNext;
	}

	/**
	 * @param btnNext
	 *            the btnNext to set
	 */
	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}

	protected JPanel createPersonalDetailsPanel(String text) {
		PersonalDetails details = new PersonalDetails();
		JPanel personalDetailsPanel = new JPanel();

		personalDetailsPanel.setLayout(null);

		JLabel personalDetails = new JLabel("PERSONAL DETAILS :");
		personalDetails.setBounds(10, 11, 128, 14);
		personalDetailsPanel.add(personalDetails);

		JLabel emp_Name = new JLabel("Name :");
		emp_Name.setBounds(20, 33, 80, 14);
		personalDetailsPanel.add(emp_Name);

		String[] employeeTypes = { "Employee", "Manager", "Executive",
				"Retired Employee" };

		// Create the combo box, select item at index 4.
		// Indices start at 0, so 4 specifies the pig.
		listManagers = new JComboBox(employeeTypes);
		listManagers.setSelectedIndex(0);
		listManagers.setBounds(500, 33, 100, 22);
		personalDetailsPanel.add(listManagers);

		empName = new JTextField();
		empName.setBounds(131, 33, 300, 20);
		personalDetailsPanel.add(empName);
		empName.setColumns(10);
		details.setEmpName(empName);

		date_Of_Birth = new JLabel("Date Of Birth :");
		date_Of_Birth.setBounds(20, 80, 80, 14);
		personalDetailsPanel.add(date_Of_Birth);

		String[] year = new String[] { "1992", "1993", "1994" };
		lblYear = new JLabel("Year");
		lblYear.setBounds(131, 60, 26, 14);
		personalDetailsPanel.add(lblYear);

		lblMonth = new JLabel("Month");
		lblMonth.setBounds(239, 60, 36, 14);
		personalDetailsPanel.add(lblMonth);

		lblDay = new JLabel("Day");
		lblDay.setBounds(342, 60, 31, 14);
		personalDetailsPanel.add(lblDay);

		comboBox_Year = new JComboBox(year);
		comboBox_Year.setBounds(128, 75, 100, 22);
		personalDetailsPanel.add(comboBox_Year);

		String[] months = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12" };
		comboBox_Month = new JComboBox(months);
		comboBox_Month.setBounds(235, 75, 100, 22);
		personalDetailsPanel.add(comboBox_Month);

		String[] days = new String[] { "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" };
		comboBox_Day = new JComboBox(days);
		comboBox_Day.setBounds(342, 75, 95, 22);
		personalDetailsPanel.add(comboBox_Day);

		lblAddress = new JLabel("ADDRESS :");
		lblAddress.setBounds(10, 206, 108, 14);
		personalDetailsPanel.add(lblAddress);

		lblBuildingName = new JLabel("Building Name :");
		lblBuildingName.setBounds(20, 243, 98, 14);
		personalDetailsPanel.add(lblBuildingName);

		JLabel lblStreetName = new JLabel("Street Name :");
		lblStreetName.setBounds(20, 275, 80, 14);
		personalDetailsPanel.add(lblStreetName);

		textField_StreetName = new JTextField();
		textField_StreetName.setBounds(131, 271, 195, 20);
		personalDetailsPanel.add(textField_StreetName);
		textField_StreetName.setColumns(10);
		details.setTextField_StreetName(textField_StreetName);

		textField_BuildingName = new JTextField();
		textField_BuildingName.setBounds(131, 240, 195, 20);
		personalDetailsPanel.add(textField_BuildingName);
		textField_BuildingName.setColumns(10);
		details.setTextField_BuildingName(textField_BuildingName);

		String[] country = new String[] { "India", "Usa", "Denmark",
				"Australia", "China", "Russia" };
		lblCountry = new JLabel("Country :");
		lblCountry.setBounds(20, 305, 80, 14);
		personalDetailsPanel.add(lblCountry);

		comboBox_Country = new JComboBox(country);
		comboBox_Country.setBounds(131, 301, 195, 22);
		personalDetailsPanel.add(comboBox_Country);
		details.setComboBox_Country(comboBox_Country);

		String[] states = new String[] { "Maharashtra", "Gujrat", "Karnataka",
				"Haryana", "Madhya Pradesh" };
		lblState = new JLabel("State :");
		lblState.setBounds(20, 338, 46, 14);
		personalDetailsPanel.add(lblState);
		details.setComboBox_State(comboBox_State);

		comboBox_State = new JComboBox(states);
		comboBox_State.setBounds(131, 334, 195, 22);
		personalDetailsPanel.add(comboBox_State);
		String[] city = new String[] { "pune", "mumbai", "Kolkata", "Gurgaon",
				"Indore", "Bangalore" };
		lblCity = new JLabel("City :");
		lblCity.setBounds(20, 371, 46, 14);
		personalDetailsPanel.add(lblCity);

		comboBox_City = new JComboBox(city);
		comboBox_City.setBounds(131, 367, 195, 22);
		personalDetailsPanel.add(comboBox_City);
		details.setComboBox_City(comboBox_City);

		lblZipCode = new JLabel("Zip Code :");
		lblZipCode.setBounds(20, 403, 80, 14);
		personalDetailsPanel.add(lblZipCode);

		textField_ZipCode = new JTextField();
		textField_ZipCode.setBounds(128, 400, 198, 20);
		personalDetailsPanel.add(textField_ZipCode);
		textField_ZipCode.setColumns(10);
		details.setTextField_ZipCode(textField_ZipCode);

		lblContact = new JLabel("Contact :");
		lblContact.setBounds(20, 140, 80, 14);
		personalDetailsPanel.add(lblContact);

		textField_Contact = new JTextField();
		textField_Contact.setBounds(128, 135, 283, 20);
		personalDetailsPanel.add(textField_Contact);
		textField_Contact.setColumns(10);
		details.setTextField_Contact(textField_Contact);

		lblEmail = new JLabel("Email :");
		lblEmail.setBounds(20, 170, 46, 14);
		personalDetailsPanel.add(lblEmail);

		textField_Email = new JTextField();
		textField_Email.setBounds(128, 165, 283, 20);
		personalDetailsPanel.add(textField_Email);
		textField_Email.setColumns(10);
		details.setTextField_Email(textField_Email);

		btnNext = new JButton("Next>>");

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		btnNext.setBounds(150, 450, 91, 23);
		personalDetailsPanel.add(btnNext);

		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(20, 110, 60, 14);
		personalDetailsPanel.add(lblGender);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(128, 105, 98, 20);
		personalDetailsPanel.add(rdbtnMale);
		details.setRdbtnMale(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(230, 106, 75, 23);
		personalDetailsPanel.add(rdbtnFemale);
		details.setRdbtnFemale(rdbtnFemale);

		btnSave = new JButton("Save");
		btnSave.setBounds(280, 450, 91, 23);
		personalDetailsPanel.add(btnSave);
		btnSave.setBounds(280, 450, 91, 23);
		personalDetailsPanel.add(btnSave);

		//return personalDetailsPanel;

	
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String emp=getListManagers().getSelectedItem().toString();
				if(emp.equals("Employee")){
					getPersonalData(employee);
				}
				else if(emp.equals("Manager"))
				{
					Manager manager=(Manager)employee;
					getPersonalData(manager);
				}
				else if(emp.equals("Executive"))
				{
					Executive executive=(Executive)employee;
					
					
					
					
					getPersonalData(executive);
				}
			}

		});
		btnSave.setBounds(280, 450, 91, 23);
		personalDetailsPanel.add(btnSave);

		return personalDetailsPanel;
	}

	/**
	 * @return the btnSave
	 */
	public JButton getBtnSave() {
		return btnSave;
	}

	/**
	 * @param btnSave the btnSave to set
	 */
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public Calendar concatDate() throws ParseException {
		String day = getComboBox_Day().getSelectedItem().toString();
		String month = getComboBox_Month().getSelectedItem().toString();
		String year = getComboBox_Year().getSelectedItem().toString();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd", Locale.US);
		String date=year+"-"+month+"-"+day;
		/**
		 * parse the date and set birthdate on calender instance
		 */
		calendar.setTime(sdf.parse(date));
		return calendar;
	}

public void getPersonalData(Employee employee)
{
		if (empName.getText().matches("([a-zA-Z]+ +)*[a-zA-Z]+")) {
			System.out.println("name");
			
				if (textField_Contact.getText().matches("\\d{10}")) {
					System.out.println("contact");
					if (textField_Email
							.getText()
							.matches(
									"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
						System.out.println("mail");
						if (textField_ZipCode.getText().matches(
								"\\d{6}")) {
							System.out.println("zipcode");
							if(getRdbtnFemale().isSelected())
							{
								String genderF=getRdbtnFemale().getText();
								System.out.println(genderF);
								
							}
							 if(getRdbtnMale().isSelected())
							 {
								 String male=getRdbtnMale().getText();
								 System.out.println(male);
							 }
							Address address = new Address(
									textField_StreetName.getText(),
									(Long.parseLong(textField_ZipCode
											.getText())),
									textField_BuildingName.getText(),
									(String) comboBox_City
											.getSelectedItem(),
									(String) comboBox_Country
											.getSelectedItem());
							
							
								System.out.println(address);
								
							
							employee = new Employee();
							employee.setName(empName.getText());
							System.out.println(empName.getText());
							employee.setAdress(address);
							AgeCalculator ageCalculator=new AgeCalculator();
							try {
								employee.setBirthDate(concatDate());
								System.out.println("Birthdate"+concatDate());
								
								
							} catch (ParseException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							try {
								employee.setAge(ageCalculator.calculateAge(concatDate()));
							} catch (ParseException e4) {
								// TODO Auto-generated catch block
								e4.printStackTrace();
							}
							employee.getAge();
							employee.setEmail(textField_Email.getText());
							employee.setContactNo(textField_Contact
									.getText());

							System.out.println(employee);
						}

					}
				}
		
		}
		
	}
}
