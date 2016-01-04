package employeeManagement.companyDatabase.inputValidation.classes;



public class IntegerValidator {
	public static boolean isContactValid(String string){
		return string.matches("\\d{6,10}");
	}
	public static boolean isZipValid(String string){
		return string.matches("\\d{6}");
	}
	public static boolean isAccountNumberValid(String string){
		return string.matches("\\d{8,10}");
	}
	public static boolean isCtcValid(String string){
		return string.matches("\\d{5,10}");
	}
}
