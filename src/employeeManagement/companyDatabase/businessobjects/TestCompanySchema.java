/**
 * 
 */
package employeeManagement.companyDatabase.classes;

import java.sql.SQLException;

import employeeManagement.companyDatabase.databaseOperations.MasterDatabase;

/**
 * @author parkar_s
 * 
 */
public class TestCompanySchema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MasterDatabase m = new MasterDatabase();
		try {

			//m.deleteExecutiveTable();
			//m.deleteManagerTable();
			//m.deleteEmployeeTable();
			//m.deleteDepartmentTable();
			//m.deleteProjectTable();

			//m.createDepartmentTable();
			//m.createProjectTable();
			//m.createAccountTable();
			m.createEmployeeTable();
			m.createManagerTable();
			m.createExecutiveTable();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
