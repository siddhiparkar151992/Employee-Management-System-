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
public class Executive extends Manager {
	


	/**
	 * @param executiveSSN
	 * @param managerList
	 */
	public Executive(String executiveSSN, Personnel<Manager> managerList) {
		super();
		this.executiveSSN = executiveSSN;
		this.managerList = managerList;
	}

	





	public Executive() {
	}
	private String executiveSSN;
	private Personnel<Manager> managerList;

	/**
	 * @return the executiveSSN
	 */
	public String getExecutiveSSN() {
		return executiveSSN;
	}

	/**
	 * @param executiveSSN
	 *            the executiveSSN to set
	 */
	public void setExecutiveSSN() {
		this.executiveSSN = "Ex"+new Random().nextInt(10000);
	}

	/**
	 * @return the managerList
	 */
	public Personnel<Manager> getManagerList() {
		return managerList;
	}

	/**
	 * @param managerList
	 *            the managerList to set
	 */
	public void setManagerList(Personnel<Manager> managerList) {
		this.managerList = managerList;
	}

}
