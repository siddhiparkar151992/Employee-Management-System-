package employeeManagement.companyDatabase.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	static Connection connection;
	private DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}
	

	public static Connection getConnection()  {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/CompanySchema", "root", "root");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("Connected to database!");
		}
		return connection;
	}
	
}
