package employeeManagement.companyDatabase.inputValidation.classes;

public class ContactValidator {

	 public static boolean isPhoneValid(String phone) {
	      boolean retval = false;
	      String phoneNumberPattern = 
	      "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
	      retval = phone.matches(phoneNumberPattern);
	      String msg = "NO MATCH: pattern:" + phone
	      + "\r\n regex: " + phoneNumberPattern;
	      if (retval) {
	         msg = " MATCH: pattern:" + phone 
	         + "\r\n regex: " + phoneNumberPattern;
	      }
	      System.out.println(msg + "\r\n");
	      return retval;
	   }

}
