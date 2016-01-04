package employeeManagement.companyDatabase.exceptions;

public class NoSuchRecordException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	NoSuchRecordException() {
		super();
	}

	public NoSuchRecordException(String message) {
		super(message);
	}

	public NoSuchRecordException(Throwable cause) {
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
