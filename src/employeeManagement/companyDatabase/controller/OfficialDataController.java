package employeeManagement.companyDatabase.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import employeeManagement.companyDatabase.classes.Address;
import employeeManagement.companyDatabase.classes.Client;
import employeeManagement.companyDatabase.classes.Company;
import employeeManagement.companyDatabase.classes.Department;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Executive;
import employeeManagement.companyDatabase.classes.Manager;
import employeeManagement.companyDatabase.classes.Project;
import employeeManagement.companyDatabase.enums.Grades;
import employeeManagement.companyDatabase.presentation.FrontEnd;
import employeeManagement.companyDatabase.salary.Salary;

public class OfficialDataController extends Controller {

	/**PersonalDataController pers=new PersonalDataController();
	FrontEnd frontend = pers.getFrontend();
	Employee employee = pers. getEmploye();
	private Department department =  pers.getDepartment();
	private Project project =  pers.getProject();
	private Client client =  pers.getClient();
	private Address address =  pers.getAddress();
	private Executive executive =  pers.getExecutive();
	private Salary salary =  pers.getSalary();
	private Manager manager = pers. getManager();
	private Company company =  pers.getCompany();
	
	
	
/**
	 * @return the pers
	 */
	public PersonalDataController getPers() {
		return pers;
	}

	/**
	 * @param pers the pers to set
	 */
	public void setPers(PersonalDataController pers) {
		this.pers = pers;
	}

	/**
	 * @return the frontend
	 */
	public FrontEnd getFrontend() {
		return frontend;
	}

	/**
	 * @param frontend the frontend to set
	 */
	public void setFrontend(FrontEnd frontend) {
		this.frontend = frontend;
	}

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
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
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
	 * @return the executive
	 */
	public Executive getExecutive() {
		return executive;
	}

	/**
	 * @param executive the executive to set
	 */
	public void setExecutive(Executive executive) {
		this.executive = executive;
	}

	/**
	 * @return the salary
	 */
	public Salary getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the front
	 */
	public FrontEnd getFront() {
		return front;
	}

	/**
	 * @param front the front to set
	 */
	public void setFront(FrontEnd front) {
		this.front = front;
	}

FrontEnd front=new FrontEnd();*/

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			pers.getEmployee().setEmployeeSSN((pers.getFrontend().getOfficialDetails().getTextField_employeeId()).toString());
			Grades grade=Grades.valueOf(front.getOfficialDetails().getComboBox_Grade().toString());
			pers.getEmployee().setGrade(grade);
			department.setDepartmantName(front.getOfficialDetails().getComboBox_DepartmentName().toString());
			department.setDepartmentId(Integer.valueOf(front.getOfficialDetails().getTextField_DepartmentId().toString()));
			department.setLocationId(Integer.valueOf(front.getOfficialDetails().getTextField_LocationId().toString()));
			employee.setDepartment(department);
			company.setComanyName(front.getOfficialDetails().getTextField_CompanyName().toString());
			company.setLocationId(Integer.valueOf(front.getOfficialDetails().getTextField_LocationId().toString()));
			client.setClientCompany(company);
			client.setClientId(Integer.valueOf(front.getOfficialDetails().getTextField_ClientId().toString()));
			project.setLocation(front.getOfficialDetails().getCompany().getLocation().toString());
			project.setProjectId(Integer.valueOf(front.getOfficialDetails().getTextField_ProjectId().toString()));
		}

	}
	
	public Employee collectEmployeeData() {

		return this.getEmployee();

	}
	

	public static void main(String[] args) {
		FrontEnd frontEnd=new FrontEnd();
		frontEnd.run();
		
		
	}
}
