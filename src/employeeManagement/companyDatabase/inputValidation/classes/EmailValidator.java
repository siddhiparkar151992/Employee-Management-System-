package employeeManagement.companyDatabase.inputValidation.classes;

public class EmailValidator {

	public boolean validateEmail(String email1)
	{
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\ @([\\w]+\\.)+[\\w]+[\\w]$";
		
			      Boolean b = email1.matches(EMAIL_REGEX);
			      System.out.println("is e-mail: "+email1+" :Valid = " + b);
			      String email2 = "user^domain.co.in";
			      b = email2.matches(EMAIL_REGEX);
			      System.out.println("is e-mail: "+email2
			      +" :Valid = " + b);
				return b;
	}

}
