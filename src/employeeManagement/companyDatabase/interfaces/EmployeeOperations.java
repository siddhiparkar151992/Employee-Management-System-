package employeeManagement.companyDatabase.interfaces;

import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.collections.Personnel;


public interface EmployeeOperations {
	 public Personnel<Employee> getAllEmployees();

	 public void addEmployee( Employee employee );

	 public Employee searchEmployee( int employeeId );

	 
}
