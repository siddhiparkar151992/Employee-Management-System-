package employeeManagement.companyDatabase.inputValidation.classes;


public class NameValidator {

	public boolean isFullNameValid(String string) {

		return string.matches("^[\\p{L} .'-]+$");
	}
}
