package employeeManagement.companyDatabase.classes;

import employeeManagement.companyDatabase.collections.Personnel;

public class Manager extends Employee {

	private String managerSSN;
	private Personnel<Employee> employeeList;

	public Manager() {
	}

	

	/**
	 * @return the managerSSN
	 */
	public String getManagerSSN() {
		return managerSSN;
	}

	/**
	 * @param managerSSN
	 *            the managerSSN to set
	 */
	public void setManagerSSN() {
		this.managerSSN = "M"+getEmployeeSSN();
	}

	/**
	 * @return the employeeList
	 */
	public Personnel<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @param employeeList
	 *            the employeeList to set
	 */
	public void setEmployeeList(Personnel<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((employeeList == null) ? 0 : employeeList.hashCode());
		result = prime * result
				+ ((managerSSN == null) ? 0 : managerSSN.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Manager)) {
			return false;
		}
		Manager other = (Manager) obj;
		if (employeeList == null) {
			if (other.employeeList != null) {
				return false;
			}
		} else if (!employeeList.equals(other.employeeList)) {
			return false;
		}
		if (managerSSN == null) {
			if (other.managerSSN != null) {
				return false;
			}
		} else if (!managerSSN.equals(other.managerSSN)) {
			return false;
		}
		return true;
	}
}
