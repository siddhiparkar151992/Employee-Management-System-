package employeeManagement.companyDatabase.interfaces;

import java.sql.SQLException;

public interface TableOperator {

	public void createTable() throws SQLException;
	void deleteTable() throws SQLException;
}
