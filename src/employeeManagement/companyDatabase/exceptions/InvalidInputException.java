package employeeManagement.companyDatabase.exceptions;

public class InvalidInputException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidInputException() {
		super();
	}

	public InvalidInputException(String message) {
		super(message);
	}

	public InvalidInputException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "Input is invalid please try again...";
	}
	
	public String getMessage()
	{
		return toString();
	}

}
