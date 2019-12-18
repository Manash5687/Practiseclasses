
import java.util.HashMap;

public class Hashmap1 {
	

	
	  public static void main(String[] args) {
	    HashMap<String,String> studentClass = new HashMap<>();
	    studentClass.put("Window", "Student1");
	    studentClass.put(null, "Student2");
	    studentClass.put("Java", "Student3");
	    studentClass.put("MySql", "Student4");
	    
	    System.out.println(studentClass);
	    System.out.println(studentClass.get("Window"));
	    
	  }
	}

    