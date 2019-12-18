import java.util.*; 


public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alist = new ArrayList<>();
		alist.add("Manash");
		alist.add("Santosh");
		alist.add("Alexandra");
		alist.add("Shakti");
		alist.add("visenya");
		alist.add("java");
		alist.add(6,"python");
		alist.add(5,"R");	
System.out.println(alist);
	

	alist.remove(0);
	System.out.println(alist);
	System.out.println(alist.size());
	}
}
