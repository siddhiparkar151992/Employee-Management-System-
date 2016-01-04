/**
 * 
 */
package employeeManagement.companyDatabase.classes;

/**
 * @author parkar_s
 * 
 */
public class Address {
	private String streetName;
	private long zipCode;
	private String BuildingName;
	private String city;
	private String country;

	public Address(String streetName, long zipCode, String buildingName, String city, String country) {
		super();
		this.streetName = streetName;
		this.zipCode = zipCode;
		BuildingName = buildingName;
		this.city = city;
		this.country = country;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getBuildingName() {
		return BuildingName;
	}

	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", zipCode=" + zipCode
				+ ", BuildingName=" + BuildingName + "]";
	}

}
