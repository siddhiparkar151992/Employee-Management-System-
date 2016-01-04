/**
 * 
 */
package employeeManagement.companyDatabase.classes;

import java.util.Calendar;
import java.util.Random;

import employeeManagement.companyDatabase.enums.Designation;
import employeeManagement.companyDatabase.enums.Gender;
import employeeManagement.companyDatabase.enums.Grades;
import employeeManagement.companyDatabase.salary.Salary;


/**
 * @author parkar_s
 * 
 */
public  class Employee extends Person {
	private String employeeSSN;
	private Project project;
	private Department department;
	private Grades grade;
	private Designation designation;
	private Calendar dateOfJoining;
	private long accountNo;
	private Salary salary;
	private Client client;
	static int counter=87932;

	public Employee(){
		
	}

	/**
	 * @param employeeSSN
	 * @param project
	 * @param department
	 * @param grade
	 * @param designation
	 * @param dateOfJoining
	 * @param account
	 * @param salary
	 * @param client
	 */
	public Employee(String name, Address adress, Calendar birthDate, int age,
			String email, String contactNo, Gender gender,String employeeSSN, Project project, Department department,
			Grades grade, Designation designation, Calendar dateOfJoining,
			long account, Salary salary, Client client) {
		super(name, adress, birthDate, age, email, contactNo, gender);
		this.employeeSSN = employeeSSN;
		this.project = project;
		this.department = department;
		this.grade = grade;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.setAccountNo(account);
		this.salary = salary;
		this.client = client;
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
	 * @return the grade
	 */
	public Grades getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(Grades grade) {
		this.grade = grade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeSSN=" + employeeSSN + ", project=" + project
				+ ", department=" + department + ", grade=" + grade
				+ ", designation=" + designation + ", dateOfJoining="
				+ dateOfJoining + ", accountNo=" + accountNo + ", salary="
				+ salary + ", client=" + client + ", getEmail()=" + getEmail()
				+ ", getContactNo()=" + getContactNo() + ", getName()="
				+ getName() + ", getAdress()=" + getAdress()
				+ ", getBirthDate()=" + getBirthDate() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result
				+ ((employeeSSN == null) ? 0 : employeeSSN.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (employeeSSN == null) {
			if (other.employeeSSN != null) {
				return false;
			}
		} else if (!employeeSSN.equals(other.employeeSSN)) {
			return false;
		}
		if (project == null) {
			if (other.project != null) {
				return false;
			}
		} else if (!project.equals(other.project)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the employeeSSN
	 */
	public String getEmployeeSSN() {
		return employeeSSN;
	}

	/**
	 * @param employeeSSN
	 *            the employeeSSN to set
	 */
	public void setEmployeeSSN() {
		this.employeeSSN ="e"+ new Random().nextInt(10000);
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setDesignations(Grades grade) {
		switch (grade) {
		case G1:
			this.setDesignation(Designation.TRAINEE);
			break;
		case G2:
			this.setDesignation(Designation.SOFTWARE_ENGINEER);
			break;
		case G3:
			this.setDesignation(Designation.SENIOR_SOFTWARE_ENGINEER);
			break;
		case G4:
			this.setDesignation(Designation.PROJECT_MANAGER);
		case G5:
			this.setDesignation(Designation.PROJECT_LEAD);
		case G6:
			break;
		default:
			break;

		}
	}

	/**
	 * @return the designation
	 */
	public Designation getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	/**
	 * @return the dateOfJoining
	 */
	public Calendar getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining
	 *            the dateOfJoining to set
	 */
	public void setDateOfJoining(Calendar dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * @return the salary
	 */
	public Salary getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(Salary salary) {
		this.salary = salary;
	}



	public long getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}


}
