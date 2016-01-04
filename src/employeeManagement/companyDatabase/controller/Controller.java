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

public class Controller {
	
	private Employee employee=new Employee();
	private Department department=new Department();
	private Project project=new Project();
	private Client client=new Client();
	private Address address=new Address();
	private Executive executive=new Executive();
	private Salary salary=new Salary();
	private Manager manager=new Manager();
	private Company company=new Company();
	ApplicationForm frontEnd;
	
	
	

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
	 * @return the frontEnd
	 */
	public ApplicationForm getFrontEnd() {
		return frontEnd;
	}

	/**
	 * @param frontEnd the frontEnd to set
	 */
	public void setFrontEnd(ApplicationForm frontEnd) {
		this.frontEnd = frontEnd;
	}

	/**
	 * @return the employe
	 */
	public Employee getEmploye() {
		return employee;
	}

	/**
	 * @param employe the employe to set
	 */
	public void setEmploye(Employee employe) {
		this.employee = employe;
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

	
	public static void main(String[] args) {
		Controller c = new Controller();
	}

	
	
}
