package employeeManagement.companyDatabase.exceptions;

import java.sql.SQLException;

public class TableNotFoundException extends SQLException{
	
	private static final long serialVersionUID = 1L;
	private String message;

	TableNotFoundException(Exception e) {
		super(e);
	}

	public TableNotFoundException(String message) {
		super(message);
	}

	public TableNotFoundException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "No such Record exist [message=" + message + "]";
	}

	public String getMessage() {
		return "Record you are trying fectch does not exist!";

	}

}
