/**
 * 
 */
package employeeManagement.companyDatabase.databaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import employeeManagement.companyDatabase.classes.DatabaseConnection;
import employeeManagement.companyDatabase.exceptions.DuplicateValueException;
import employeeManagement.companyDatabase.exceptions.TableNotFoundException;

/**
 * @author parkar_s
 * 
 */
public class MasterDatabase implements Database {
	/**
	 * @throws SQLException
	 * 
	 */
	public void createCompanyTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Company" + "(" + "locationId INTEGER,"

		+ "location VARCHAR(50) NOT NULL," + "PRIMARY KEY(locationId))";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(st);
			System.out.println("Company Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);

		}

		// 1

	}

	/**
	 * @throws
	 * @throws
	 * 
	 */
	@Override
	public void deleteCompanyTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Company";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.execute(deletTable);
			System.out.println("Company Table dropped ");
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}

	}

	/**
	 * 
	 */
	public void createEmployeeTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Employee"
				+ "(employeeSSN VARCHAR(10) not NULL, employeeName VARCHAR(50), "
				+ "dateOfBirth Date,"
				+ "email VARCHAR(20),"
				+ "contact VARCHAR(20),"
				+ "employeeAge INTEGER NOT NULL,"
				+ "DateOfJoining Date,"
				+ "AccountNumber INTEGER NOT NULL,"
				+ "Salary BIGINT,"
				+ "Gender VARCHAR(6),"
				+ "Grade VARCHAR(3),"
				+ "Designation VARCHAR(30),"
				+ "ProjectId INTEGER NOT NULL, "
				+ "ClientId INTEGER NOT NULL,"
				+ "DepartmentId INTEGER NOT NULL,"
				+ "FOREIGN KEY(projectId) REFERENCES CompanySchema.Project(projectId),"
				+ "CHECK(employeeAge>18 AND Gender In('Female','Male')),"
				+ "PRIMARY KEY(employeeSSN),"
				+ "FOREIGN KEY(DepartmentId) REFERENCES CompanySchema.Department(departmentId))";

		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(st);
			System.out.println("Employee Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}// 1

	}

	@Override
	public void createManagerTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Manager"
				+ "(managerSSN VARCHAR(30) not NULL,"
				+ "employeeSSN VARCHAR(30) NOT NULL,"
				+ "FOREIGN KEY(employeeSSN) REFERENCES CompanySchema.Employee(employeeSSN),"
				+ "PRIMARY KEY(managerSSN))";

		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(st);
			System.out.println("Manager Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}// 1

	}

	@Override
	public void createExecutiveTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Executive"
				+ "(executiveSSN VARCHAR(30) NOT NULL,"
				+ "employeeSSN VARCHAR(30) NOT NULL,"
				+ "FOREIGN KEY(employeeSSN) REFERENCES CompanySchema.Employee(employeeSSN),"
				+ "PRIMARY KEY(executiveSSN))";

		try {
			Statement statement = connection.createStatement();// 1
			statement.executeUpdate(st);
			System.out.println("Executive Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}

	}

	@Override
	public void createDepartmentTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Department"
				+ "(departmentId INTEGER not NULL, departmentName VARCHAR(50) NOT NULL,"

				+ "locationId INTEGER REFERENCES CompanySchema.company(locationId),"
				+ "PRIMARY KEY(departmentId)," + "CHECK(departmnetId>0))";

		try {
			Statement statement = connection.createStatement();// 1
			statement.executeUpdate(st);
			System.out.println("Department Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}

	}

	@Override
	public void createProjectTable() throws DuplicateValueException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Project"
				+ "(projectId INTEGER not NULL, ProjectNAme VARCHAR(20) NOT NULL,"

				+ "location VARCHAR(10) NOT NULL,CHECK(projectId>0),PRIMARY KEY(projectId))";

		try {
			Statement statement = connection.createStatement();// 1
			statement.executeUpdate(st);
			System.out.println("Project Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}

	}

	@Override
	public void deleteEmployeeTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Employee";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.execute(deletTable);
			System.out.println("Employee Table dropped ");
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}

	}

	@Override
	public void deleteManagerTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Manager";

		try {
			Statement statement = connection.createStatement();
			statement.execute(deletTable);
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}
		System.out.println("Manager Table dropped ");

	}

	@Override
	public void deleteExecutiveTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Executive";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.execute(deletTable);
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}

		System.out.println("Executive Table dropped ");

	}

	@Override
	public void deleteDepartmentTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Department";

		try {
			Statement statement = connection.createStatement();
			statement.execute(deletTable);
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}
		System.out.println("Department Table dropped ");

	}

	@Override
	public void deleteProjectTable() throws TableNotFoundException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Project";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.execute(deletTable);
		} catch (SQLException e) {
			throw new TableNotFoundException(e);
		}

		System.out.println("Project Table dropped ");

	}

	@Override
	public void createClientTable() throws DuplicateValueException {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Client" + "(" + "clientId INTEGER,"

		+ "Company VARCHAR(20) NOT NULL)";

		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(st);
			System.out.println("Client Table created");
			statement.close();
		} catch (SQLException e) {
			throw new DuplicateValueException(e);
		}// 1

	}

	public static void main(String[] args) {
		MasterDatabase m = new MasterDatabase();

		try {
			m.createCompanyTable();
			m.createClientTable();
			m.createProjectTable();
			m.createEmployeeTable();
			m.createManagerTable();
			m.createExecutiveTable();
		} catch (DuplicateValueException e) {
			e.getMessage();
		}

	}
}
