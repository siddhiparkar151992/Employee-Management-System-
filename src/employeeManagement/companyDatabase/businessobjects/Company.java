/**
 * 
 */
package employeeManagement.companyDatabase.classes;

import java.util.Random;

import employeeManagement.companyDatabase.collections.Personnel;



/**
 * @author parkar_s
 * 
 */
public class Company  {

	private String location;
	private int locationId;
	private String comanyName;
	private Personnel<Manager> managerList;
	/**
	 * @return the comanyName
	 */
	public String getComanyName() {
		return comanyName;
	}

	/**
	 * @param comanyName the comanyName to set
	 */
	public void setComanyName(String comanyName) {
		this.comanyName = comanyName;
	}

	private Personnel<Employee> employeeList;
	
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId() {
		this.locationId = (new Random().nextInt(100000));
	}

	/**
	 * @param location
	 * @param locationId
	 */
	public Company(String location, int locationId) {
		super();
		this.location = location;
		this.locationId = locationId;
	}

	/**
	 * 
	 */
	public Company() {
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
		if (!(obj instanceof Company)) {
			return false;
		}
		Company other = (Company) obj;
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (locationId != other.locationId) {
			return false;
		}
		return true;
	}

	/**
	 * @return the employeeList
	 */
	public Personnel<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(Personnel<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	/**
	 * @return the managerList
	 */
	public Personnel<Manager> getManagerList() {
		return managerList;
	}

	/**
	 * @param managerList the managerList to set
	 */
	public void setManagerList(Personnel<Manager> managerList) {
		this.managerList = managerList;
	}

	
}
