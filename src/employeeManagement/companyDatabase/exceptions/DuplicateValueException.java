package employeeManagement.companyDatabase.exceptions;

public class DuplicateValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = null;

	public DuplicateValueException(Exception e) {
		super(e);
	}

	public DuplicateValueException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "DuplicateValueException [message=" + message + "]";
	}
	
	public String getMessage()
	{
		return "Table Laready Exist";
	}

}
