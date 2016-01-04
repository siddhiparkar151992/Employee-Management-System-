package employeeManagement.companyDatabase.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import employeeManagement.companyDatabase.collections.Personnel;
import employeeManagement.companyDatabase.interfaces.EmployeeOperations;


public class EmployeeService implements EmployeeOperations {

	@Override
	public Personnel<Employee> getAllEmployees() {
		Calendar cal = Calendar.getInstance();
		ResultSet result = null;
		Personnel<Employee> employeelist = new Personnel<Employee>();
		PreparedStatement statement=null;

		String selectAll = "SELECT * FROM Employee";
		try {
			statement.execute(selectAll);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (result.next()) {
				Employee employee = new Employee();
				employee.setAge(result.getInt("employeeAge"));
				cal.setTime(result.getDate("dateOfBirth"));
				cal.setTime(result.getDate(1, cal));
				employee.setBirthDate(cal);
				
				employee.setContactNo(result.getString("employeeSSN"));
				employeelist.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee searchEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
