
public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name; 
	}

	private Address address;

	public void showaddress(){
		
		System.out.println("Address of student ["+this.name+" is: ]");
		System.out.println(this.address.getCity() +", "+this.address.getState());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
