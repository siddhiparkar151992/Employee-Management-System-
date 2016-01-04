package employeeManagement.companyDatabase.interfaces;

import java.util.Calendar;

public class AgeCalculator {
	
	public int calculateAge(Calendar birthDate)
	
	{
		Calendar currentDate=Calendar.getInstance();
		int age=currentDate.get(Calendar.YEAR)-birthDate.get(Calendar.YEAR);
		if(currentDate.get(Calendar.DAY_OF_YEAR)<birthDate.get(Calendar.DAY_OF_YEAR))
			age--;
		return age;
		
	}

}
