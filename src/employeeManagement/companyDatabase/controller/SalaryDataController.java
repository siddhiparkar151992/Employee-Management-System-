package employeeManagement.companyDatabase.controller;

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

public class SalaryDataController extends Controller {
	
	ApplicationForm frontend = getFrontend();
	Employee employee = getEmploye();
	private Department department = getDepartment();
	private Project project = getProject();
	private Client client = getClient();
	private Address address = getAddress();
	private Executive executive = getExecutive();
	private Salary salary = getSalary();
	private Manager manager = getManager();
	private Company company = getCompany();
	/**
	 * @return the frontend
	 */
	public ApplicationForm getFrontend() {
		return frontend;
	}
	/**
	 * @param frontend the frontend to set
	 */
	public void setFrontend(ApplicationForm frontend) {
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
	
	

}
