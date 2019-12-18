import java.util.*;
public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ln = new LinkedList<String>();
		ln.add("Manash");
		ln.add("Alexandra");
		ln.add("Shakti");
		ln.addFirst("loca");
		ln.addLast("Santosh");
		ln.add(5,"pagla");
		
		Iterator<String> it = ln.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		ln.removeFirst();
		Iterator<String> it2 = ln.iterator();
		while (it2.hasNext()) {
			
			System.out.println("\n" + it2.next());
		}
		
		
	}

}
