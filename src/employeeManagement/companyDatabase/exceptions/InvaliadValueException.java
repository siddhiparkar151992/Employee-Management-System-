package employeeManagement.companyDatabase.exceptions;

public class InvaliadValueException extends Exception{
	private static final long serialVersionUID = 1L;
;

	public InvaliadValueException(Exception e) {
		super(e);
	}

	public InvaliadValueException(String message) {
		super(message);
	}

	public InvaliadValueException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "Value is invalid please enter date in dd/mm/YYY format";
	}
	
	public String getMessage()
	{
		return toString();
	}


}
