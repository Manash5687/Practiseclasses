
public class Employees {

	private String department;
	private int salary;
	private String companyName;
	private String name;
	
	public Employees(String name, String department, int salary, String companyName) {
		super();
		this.department = department;
		this.salary = salary;
		this.companyName = companyName;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	public void printDetails()
	{
		System.out.println("Employee "+this.name+" is from department: " +this.department+" and have salary " +this.salary);
		
	}
}
