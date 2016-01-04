/**
 * 
 */
package employeeManagement.companyDatabase.databaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import employeeManagement.companyDatabase.classes.DatabaseConnection;

/**
 * @author parkar_s
 * 
 */
public class MasterDatabaseCreation implements DatabaseCreator {
	/**
	 * 
	 */
	public void createCompanyTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Company" + "(" + "locationId INTEGER,"

		+ "location VARCHAR(50) NOT NULL," + "PRIMARY KEY(locationId))";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Company Table created");
		statement.close();

	}

	/**
	 * 
	 */
	@Override
	public void deleteCompanyTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Company";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Company Table dropped ");

	}

	/**
	 * 
	 */
	public void createEmployeeTable() throws SQLException {
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

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Employee Table created");
		statement.close();
	}

	@Override
	public void createManagerTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Manager"
				+ "(managerSSN VARCHAR(30) not NULL,"
				+ "employeeSSN VARCHAR(30) NOT NULL,"
				+ "FOREIGN KEY(employeeSSN) REFERENCES CompanySchema.Employee(employeeSSN),"
				+ "PRIMARY KEY(managerSSN))";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Manager Table created");
		statement.close();

	}

	@Override
	public void createExecutiveTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Executive"
				+ "(executiveSSN VARCHAR(30) NOT NULL,"
				+ "employeeSSN VARCHAR(30) NOT NULL,"
				+ "FOREIGN KEY(employeeSSN) REFERENCES CompanySchema.Employee(employeeSSN),"
				+ "PRIMARY KEY(executiveSSN))";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Executive Table created");
		statement.close();
	}

	@Override
	public void createDepartmentTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Department"
				+ "(departmentId INTEGER not NULL, departmentName VARCHAR(50) NOT NULL,"

				+ "locationId INTEGER REFERENCES CompanySchema.company(locationId),"
				+ "PRIMARY KEY(departmentId)," + "CHECK(departmnetId>0))";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Department Table created");
		statement.close();
	}

	@Override
	public void createProjectTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Project"
				+ "(projectId INTEGER not NULL, ProjectNAme VARCHAR(20) NOT NULL,"

				+ "location VARCHAR(10) NOT NULL,CHECK(projectId>0),PRIMARY KEY(projectId))";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Project Table created");
		statement.close();

	}

	@Override
	public void deleteEmployeeTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Employee";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Employee Table dropped ");

	}

	@Override
	public void deleteManagerTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Manager";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Manager Table dropped ");

	}

	@Override
	public void deleteExecutiveTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Executive";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Executive Table dropped ");

	}

	@Override
	public void deleteDepartmentTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Department";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Department Table dropped ");

	}

	@Override
	public void deleteProjectTable() throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String deletTable = "DROP TABLE Project";
		Statement statement = connection.createStatement();
		statement.execute(deletTable);
		System.out.println("Project Table dropped ");

	}

	@Override
	public void createClientTable() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnection.getConnection();
		String st = "CREATE TABLE Client" + "(" + "clientId INTEGER,"

		+ "Company VARCHAR(20) NOT NULL)";

		Statement statement = connection.createStatement();// 1
		statement.executeUpdate(st);
		System.out.println("Client Table created");
		statement.close();

	}
public static void main(String[] args) {
	MasterDatabaseCreation m=new MasterDatabaseCreation();
	try {
		
		m.createCompanyTable();
		m.createClientTable();
		m.createProjectTable();
		m.createDepartmentTable();
		m.createEmployeeTable();
		m.createManagerTable();
		m.createExecutiveTable();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
