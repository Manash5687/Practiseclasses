	import java.util.*; 
	public class Linked1 {

 
	public static void main(String args[]){  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("Student1");  
	al.add("Student2");  
	al.add("Student1");  
	al.add("Student4");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

