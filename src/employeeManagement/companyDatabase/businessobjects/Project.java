package employeeManagement.companyDatabase.classes;

import java.util.Random;

import employeeManagement.companyDatabase.collections.Personnel;
import employeeManagement.companyDatabase.enums.Projects;

public class Project {
	private int projectId;
	static int proCount=7862378;
	private Projects projectName;
	private String location;
	private int locationId;
	
	/**
	 * @return the proCount
	 */
	public static int getProCount() {
		return proCount;
	}

	/**
	 * @param proCount the proCount to set
	 */
	public static void setProCount(int proCount) {
		Project.proCount = proCount;
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

	private Personnel<Employee> listEmployees;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, Projects projectName, String location,
			Personnel<Employee> listEmployees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.location = location;
		this.listEmployees = listEmployees;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = (int) (Math.random()*proCount++);
	}

	/**
	 * @return the projectName
	 */
	public Projects getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName
	 *            the projectName to set
	 */
	public void setProjectName(Projects projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the locationId
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the listEmployees
	 */
	public Personnel<Employee> getListEmployees() {
		return listEmployees;
	}

	/**
	 * @param listEmployees
	 *            the listEmployees to set
	 */
	public void setListEmployees(Personnel<Employee> listEmployees) {
		this.listEmployees = listEmployees;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", locationId=" + location + ", listEmployees="
				+ listEmployees + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((listEmployees == null) ? 0 : listEmployees.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + projectId;
		result = prime * result
				+ ((projectName == null) ? 0 : projectName.hashCode());
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Project)) {
			return false;
		}
		Project other = (Project) obj;
		if (listEmployees == null) {
			if (other.listEmployees != null) {
				return false;
			}
		} else if (!listEmployees.equals(other.listEmployees)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (projectId != other.projectId) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		return true;
	}

	public void generateId(Projects projectname) {

		switch (projectname) {
		case SHOPPING_APPLICATION:
			this.setProjectId(014124);
			break;
		case CAR_SELLING_WEBSITE:
			this.setProjectId(014126);
			break;
		case HRMS:
			this.setProjectId(014247);
			break;
		case ANDROID_PROJECT:
			this.setProjectId(014230);
			break;
		case BLACKBERRY_PROJECT:
			this.setProjectId(014240);
			break;
		case HADOOP_PROJECT:
			this.setProjectId(0142402);
			break;
		case COMPANY_WEBSITE:
			this.setProjectId(0142467);
			break;

		}
	}

}
