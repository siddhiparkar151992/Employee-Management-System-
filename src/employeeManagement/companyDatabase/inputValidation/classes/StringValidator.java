package employeeManagement.companyDatabase.inputValidation.classes;

public class StringValidator {
	
	public boolean isValidString(String string)
	{
		return string.matches("^[a-zA-Z\\s]+$");
	}

	public boolean isThreeLetters(String s) {
		return s.matches("[a-zA-Z]{3}");

	}
	public boolean isNoNumberAtBeginning(String s){
	    return s.matches("^[^\\d].*");
	  }
	
	public boolean isLessThenThreeHundred(String s){
	    return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
	  }
	
	public static boolean isNameValid(String string)
	{
		return string.matches("([a-zA-Z]+ +)*[a-zA-Z]+");
	}
	
	public static boolean isEmailValid(String string)
	{
		return string.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}
	
}