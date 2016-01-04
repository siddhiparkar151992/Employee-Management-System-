package employeeManagement.companyDatabase.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


	public class DateValidator {
		 /**
		  * 
		  * @param dateToValidate
		  * @return take a date as parameter and validate it using calender class
		  */
		public boolean isDateValid(String dateToValidate){
	 
			/**
			 * if date is null return false
			 */
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
