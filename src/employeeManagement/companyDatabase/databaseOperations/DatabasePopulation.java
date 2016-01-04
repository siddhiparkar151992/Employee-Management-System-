package employeeManagement.companyDatabase.databaseOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import employeeManagement.companyDatabase.classes.Client;
import employeeManagement.companyDatabase.classes.Company;
import employeeManagement.companyDatabase.classes.DatabaseConnection;
import employeeManagement.companyDatabase.classes.Department;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Executive;
import employeeManagement.companyDatabase.classes.Manager;
import employeeManagement.companyDatabase.classes.Project;
import employeeManagement.companyDatabase.exceptions.InvaliadValueException;

public class DatabasePopulation {

	Employee employee;// pass data from ui controller
	Manager manager;
	Executive executive;
	Connection connection = DatabaseConnection.getConnection();

	public void insertDataIntoDepartment(Department department)
			throws InvaliadValueException {

		StringBuilder buildDepartment = new StringBuilder();
		buildDepartment.append("INSERT INTO Department VALUES(?,?,?)");

		try {
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildDepartment.toString());
			preStatement2.setInt(1, department.getDepartmentId());
			preStatement2.setString(2, department.getDepartmantName()
					.toString());
			preStatement2.setInt(3, department.getLocationId());
			preStatement2.executeUpdate();
			System.out.println("added Departmeny row");
			// connection.commit();
			System.out.println("Committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}

	public void insertDataIntoProject(Project project)
			throws InvaliadValueException {
		try {
			StringBuilder buildProject = new StringBuilder();
			buildProject.append("INSERT INTO Project VALUES(?,?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildProject.toString());
			preStatement2.setInt(1, project.getProjectId());
			preStatement2.setString(2, project.getProjectName().toString());
			preStatement2.setString(3, project.getLocation());
			preStatement2.executeUpdate();
			System.out.println("added Project row");
			// connection.commit();
			System.out.println("committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}

	public void insertDataIntoClient(Client client)
			throws InvaliadValueException {
		try {
			StringBuilder buildClient = new StringBuilder();
			buildClient.append("INSERT INTO Client VALUES(?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildClient.toString());
			preStatement2.setInt(1, client.getClientId());
			preStatement2.setString(2, client.getClientCompany()
					.getComanyName());

			preStatement2.executeUpdate();
			System.out.println("added Client row");
			// connection.commit();
			System.out.println("committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}

	public void insertDataIntoEmployee(Employee employee)
			throws InvaliadValueException {
		try {
			StringBuilder buildDepartment = new StringBuilder();
			buildDepartment
					.append("INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildDepartment.toString());
			preStatement2.setString(1, employee.getEmployeeSSN());
			preStatement2.setString(2, employee.getName());
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(employee.getBirthDate().getTime());
			java.sql.Date sqlDate = new java.sql.Date(calendar.getTime()
					.getTime());
			preStatement2.setDate(3, sqlDate);
			preStatement2.setString(4, employee.getEmail());
			preStatement2.setString(5, employee.getContactNo());
			preStatement2.setInt(6, employee.getAge());
			Calendar calendarDOJ = Calendar.getInstance();
			calendarDOJ.setTime(employee.getDateOfJoining().getTime());
			java.sql.Date sqlDate2 = new java.sql.Date(calendarDOJ.getTime()
					.getTime());
			preStatement2.setDate(7, sqlDate2);
			preStatement2.setLong(8, employee.getAccountNo());
			preStatement2.setDouble(9, employee.getSalary().getCtc());
			preStatement2.setString(10, employee.getGender().toString());
			preStatement2.setString(11, employee.getGrade().toString());
			preStatement2.setString(12, employee.getDesignation().toString());
			preStatement2.setInt(13, employee.getProject().getProjectId());
			preStatement2
					.setInt(15, employee.getDepartment().getDepartmentId());
			preStatement2.setInt(14, employee.getClient().getClientId());
			preStatement2.executeUpdate();
			System.out.println("added Employee row");
			// connection.commit();
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}
	}

	public void insertDataIntoManager(Manager manager)
			throws InvaliadValueException {
		try {
			StringBuilder buildManager = new StringBuilder();
			buildManager.append("INSERT INTO Manager VALUES(?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildManager.toString());
			preStatement2.setString(1, manager.getManagerSSN());
			preStatement2.setString(2, manager.getEmployeeSSN());
			preStatement2.executeUpdate();
			System.out.println("added Manager row");
			// connection.commit();
			System.out.println("Committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}

	public void insertDataIntoExecutive(Executive executive)
			throws InvaliadValueException {
		try {
			StringBuilder buildManager = new StringBuilder();
			buildManager.append("INSERT INTO Executive VALUES(?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildManager.toString());
			preStatement2.setString(1, executive.getExecutiveSSN());
			preStatement2.setString(2, executive.getEmployeeSSN());
			preStatement2.executeUpdate();
			System.out.println("added Executive row");
			// connection.commit();
			System.out.println("Committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}

	public void insertDataIntoComapny(Company company)
			throws InvaliadValueException {
		try {
			StringBuilder buildManager = new StringBuilder();
			buildManager.append("INSERT INTO Company VALUES(?,?)");
			PreparedStatement preStatement2 = connection
					.prepareStatement(buildManager.toString());
			preStatement2.setString(2, company.getLocation());
			preStatement2.setInt(1, company.getLocationId());
			preStatement2.executeUpdate();
			System.out.println("added Company row");
			// connection.commit();
			System.out.println("Committed");
		} catch (SQLException e) {

			throw new InvaliadValueException(e);
		}

	}
}
