package employeeManagement.companyDatabase.databaseOperations;

import employeeManagement.companyDatabase.exceptions.DuplicateValueException;
import employeeManagement.companyDatabase.exceptions.TableNotFoundException;

public interface Database {

	public void createEmployeeTable() throws DuplicateValueException;
	public void createManagerTable() throws DuplicateValueException;
	public void createExecutiveTable() throws DuplicateValueException;
	public void createDepartmentTable() throws DuplicateValueException;
	public void createProjectTable() throws DuplicateValueException;
	public void createCompanyTable() throws DuplicateValueException;
	public void deleteEmployeeTable() throws TableNotFoundException;
	public void deleteManagerTable() throws TableNotFoundException;
	public void deleteExecutiveTable() throws TableNotFoundException;
	public void deleteDepartmentTable() throws TableNotFoundException;
	public void deleteProjectTable() throws TableNotFoundException;
	public void deleteCompanyTable() throws TableNotFoundException;
	public void createClientTable() throws DuplicateValueException;
	
}
