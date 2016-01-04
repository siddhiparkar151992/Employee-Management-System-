package employeeManagement.companyDatabase.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import employeeManagement.companyDatabase.classes.Address;
import employeeManagement.companyDatabase.classes.Client;
import employeeManagement.companyDatabase.classes.Company;
import employeeManagement.companyDatabase.classes.Department;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Executive;
import employeeManagement.companyDatabase.classes.Manager;
import employeeManagement.companyDatabase.classes.Project;
import employeeManagement.companyDatabase.presentation.ApplicationForm;
import employeeManagement.companyDatabase.salary.Salary;

public class PersonalDataController extends Controller implements ActionListener {
	public PersonalDataController() {
		fr.getBtnSave().addActionListener(this);
	}
	static ApplicationForm fr=new ApplicationForm();
	Controller controller=new Controller();
	public  void retrieveObject()
	{
		System.out.println("inside retrieve method");

		fr.getBtnSave().addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Inside action performed");
				getAddress().setZipCode(Integer.valueOf(fr.getTextField_ZipCode().getText()));
				getAddress().setCity(fr.getComboBox_City()
						.getSelectedItem().toString());
				getAddress().setCountry(fr
						.getComboBox_Country().getSelectedItem().toString());
				getAddress().setStreetName(fr
						.getTextField_StreetName().getText());
				getEmployee().setName(fr.getEmpName()
						.toString());
				getEmployee().setAdress(getAddress());
				getEmployee().setBirthDate(concatDate());
				getEmployee().setContactNo(fr
						.getTextField_Contact().toString());
				getEmployee().setEmail(fr
						.getTextField_Email().toString());
				System.out.println(getEmployee());
				
			}
		});
		
	

	}

	public Calendar concatDate() {
		String day = fr.getComboBox_Day().toString();
		String month = fr.getComboBox_Month()
				.toString();
		String year = fr.getComboBox_Year()
				.toString();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.valueOf(year), Integer.valueOf(month),
				Integer.valueOf(day));
		return calendar;
	}
	
	
	public static void main(String[] args) {
		
		
		fr.run();
		PersonalDataController pd=new PersonalDataController();
		pd.retrieveObject();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==fr.getBtnSave())
	{
		System.out.println("Inside action performed");
		getAddress().setZipCode(Integer.valueOf(fr.getTextField_ZipCode().getText()));
		getAddress().setCity(fr.getComboBox_City()
				.getSelectedItem().toString());
		getAddress().setCountry(fr
				.getComboBox_Country().getSelectedItem().toString());
		getAddress().setStreetName(fr
				.getTextField_StreetName().getText());
		getEmployee().setName(fr.getEmpName()
				.toString());
		getEmployee().setAdress(getAddress());
		getEmployee().setBirthDate(concatDate());
		getEmployee().setContactNo(fr
				.getTextField_Contact().toString());
		getEmployee().setEmail(fr
				.getTextField_Email().toString());
		System.out.println(getEmployee());
		
	}
	}
	
}
