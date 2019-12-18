
public class Address {
	
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String zipCode;
	
	public Address(String streetNo, String area, String city, String state, String zipCode) {
		this.streetNo = streetNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}
	
	
	

	
}
