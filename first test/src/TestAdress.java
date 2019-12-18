
public class TestAdress {
	public static void main(String[] args) {

		Student student1 =new Student("Santosh");
		Student student2 = new Student("Manash");
				
				
		//AddressNew santosh = new AddressNew();
				
		student1.setAddress(new Address("", "", "Hyderabad", "Telangana", ""));
		student2.setAddress(new Address("", "", "Charelotte", "nc", ""));
		
		// Requires reference to an object of type Address
		//santosh.showAddress2();
		student1.showaddress();
		student2.showaddress();
	}
}
