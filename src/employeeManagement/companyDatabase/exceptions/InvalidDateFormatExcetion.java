package employeeManagement.companyDatabase.exceptions;

public class InvalidDateFormatExcetion extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidDateFormatExcetion() {
		super();
	}

	public InvalidDateFormatExcetion(String message) {
		super(message);
	}

	public InvalidDateFormatExcetion(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "Date is invalid please enter date in dd/mm/YYY format";
	}

	public String getMessage() {
		return toString();
	}

}
