package employeeManagement.companyDatabase.databaseOperations;

import java.sql.SQLException;

public interface DatabaseCreator {

	public void createEmployeeTable() throws SQLException;
	public void createManagerTable() throws SQLException;
	public void createExecutiveTable() throws SQLException;
	public void createDepartmentTable() throws SQLException;
	public void createProjectTable() throws SQLException;
	public void createCompanyTable() throws SQLException;
	public void deleteEmployeeTable() throws SQLException;
	public void deleteManagerTable() throws SQLException;
	public void deleteExecutiveTable() throws SQLException;
	public void deleteDepartmentTable() throws SQLException;
	public void deleteProjectTable() throws SQLException;
	public void deleteCompanyTable() throws SQLException;
	public void createClientTable() throws SQLException;
	
}
