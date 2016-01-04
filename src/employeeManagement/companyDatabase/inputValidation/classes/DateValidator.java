package employeeManagement.companyDatabase.inputValidation.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


	public class DateValidator {
		 
		public boolean isDateValid(String dateToValidate){
	 
			if(dateToValidate == null){
				return false;
			}
	 
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/YYYY");
			dateFormat.setLenient(false);
	 
			try {
	 
				System.out.println(dateToValidate);
				//if not valid, it will throw ParseException
				Date date = dateFormat.parse(dateToValidate);
				System.out.println(date);
	 
			} catch (ParseException e) {
	 
				e.printStackTrace();
				return false;
			}
	 
			return true;
		}
	 
	}
