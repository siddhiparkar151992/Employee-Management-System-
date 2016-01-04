package employeeManagement.companyDatabase.classes;

import employeeManagement.companyDatabase.collections.Personnel;
import employeeManagement.companyDatabase.enums.Departments;


public class Department{

	private int departmentId;
	private int locationId;
	private Departments departmantName;
	private Personnel<Employee> employeeList;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(int departmentId, int locationId, Departments departmantName,
			Personnel<Employee> employeeList) {
		super();
		this.departmentId = departmentId;
		this.locationId = locationId;
		this.departmantName = departmantName;
		this.employeeList = employeeList;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", locationId="
				+ locationId + ", departmantName=" + departmantName
				+ ", employeeList=" + employeeList + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((departmantName == null) ? 0 : departmantName.hashCode());
		result = prime * result + departmentId;
		result = prime * result
				+ ((employeeList == null) ? 0 : employeeList.hashCode());
		result = prime * result + locationId;
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
		if (!(obj instanceof Department)) {
			return false;
		}
		Department other = (Department) obj;
		if (departmantName == null) {
			if (other.departmantName != null) {
				return false;
			}
		} else if (!departmantName.equals(other.departmantName)) {
			return false;
		}
		if (departmentId != other.departmentId) {
			return false;
		}
		if (employeeList == null) {
			if (other.employeeList != null) {
				return false;
			}
		} else if (!employeeList.equals(other.employeeList)) {
			return false;
		}
		if (locationId != other.locationId) {
			return false;
		}
		return true;
	}


	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}


	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}


	/**
	 * @return the departmantName
	 */
	public Departments getDepartmantName() {
		return departmantName;
	}


	/**
	 * @param departmantName the departmantName to set
	 */
	public void setDepartmantName(Departments departmantName) {
		this.departmantName = departmantName;
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
	
	public void setDeptId(Departments departmantName)
	{
		switch(departmantName)
		{
		case ACCOUNTS:
			this.setDepartmentId((int) (Math.random()*17829));
			this.setLocationId((int) (Math.random()*5633));
		case FINANCE:
			this.setDepartmentId((int) (Math.random()*54782));
			this.setLocationId((int) (Math.random()*5123));
		case ADMINISTRATOR:
			this.setDepartmentId((int) (Math.random()*54278));
			this.setLocationId((int) (Math.random()*5566));
		case HARDWARE:
			this.setDepartmentId((int) (Math.random()*64678));
			this.setLocationId((int) (Math.random()*7843));
		case HUMAN_RESOURCE:
			this.setDepartmentId((int) (Math.random()*344789));
			this.setLocationId((int) (Math.random()*7845));
		case SECURITY:
			this.setDepartmentId((int) (Math.random()*12378));
			this.setLocationId((int) (Math.random()*9012));
		case SOFTAWRE:
			this.setDepartmentId((int) (Math.random()*12543));
			this.setLocationId((int) (Math.random()*75643));
			
		}
		
		
	}
}
