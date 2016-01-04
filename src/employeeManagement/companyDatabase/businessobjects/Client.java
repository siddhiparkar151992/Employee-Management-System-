/**
 * 
 */
package employeeManagement.companyDatabase.classes;

/**
 * @author parkar_s
 * 
 */
public class Client {
	static int clientcount=87438;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientCompany="
				+ clientCompany + ", project=" + project + "]";
	}

	private int clientId;
	private Company clientCompany;
	private Project project;

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId() {
		this.clientId = (int) (Math.random()*873);
	}

	/**
	 * @return the clientCompany
	 */
	public Company getClientCompany() {
		return clientCompany;
	}

	/**
	 * @param clientCompany
	 *            the clientCompany to set
	 */
	public void setClientCompany(Company clientCompany) {
		this.clientCompany = clientCompany;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

}
