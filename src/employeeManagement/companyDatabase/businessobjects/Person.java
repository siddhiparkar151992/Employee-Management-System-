/**
 * 
 */
package employeeManagement.companyDatabase.classes;

import java.util.Calendar;

import employeeManagement.companyDatabase.enums.Gender;


/**
 * @author parkar_s
 *
 */
public abstract class Person{
	
	private String name;
	private Address adress;
	private Calendar birthDate;
	private int age;
	private String email;
	private String contactNo;
	private Gender gender;
	private AgeCalculator ageCalculator;
	
	Person(){}
	
	
	
	public Person(String name, Address adress, Calendar birthDate, int age,
			String email, String contactNo, Gender gender) {
		super();
		this.name = name;
		this.adress = adress;
		this.birthDate = birthDate;
		this.age = calculateAge(birthDate);
		this.email = email;
		this.contactNo = contactNo;
		this.setGender(gender);
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar date) {
		this.birthDate = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + age;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (adress == null) {
			if (other.adress != null) {
				return false;
			}
		} else if (!adress.equals(other.adress)) {
			return false;
		}
		if (age != other.age) {
			return false;
		}
		if (birthDate == null) {
			if (other.birthDate != null) {
				return false;
			}
		} else if (!birthDate.equals(other.birthDate)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + ", birthDate="
				+ birthDate + ", age=" + age + ", email=" + email
				+ ", contactNo=" + contactNo + "]";
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public static int calculateAge(Calendar birthDate) {
		Calendar currentDate=Calendar.getInstance();
		int age=currentDate.get(Calendar.YEAR)-birthDate.get(Calendar.YEAR);
		if(currentDate.get(Calendar.DAY_OF_YEAR)<birthDate.get(Calendar.DAY_OF_YEAR))
			age--;
		return age;
	}
}
