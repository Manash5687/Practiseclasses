
public class Thread1 extends Thread{

	public static void main(String[] args) {
		
		
		Thread1 obj1=new Thread1();
		Thread1 obj2=new Thread1();
		
		obj1.start();
		obj2.start();
	}
	
	public void run() {
	
	if(getName().equals("Thread-1"))
	{
		
		try {
			
			Thread.sleep(10000);
			System.out.println("My thread is running" + getName());
	
			}
			
		catch(Exception e) {
			
			System.out.println("Exception in Thread1");
			
		}
	}
		
		if(getName().equals("Thread-0"))
		{
			
			try {
				
				Thread.sleep(100);
				System.out.println("My thread is running" + getName());
		
				}
				
			catch(Exception e) {
				
				System.out.println("Exception in Thread-0");
				
			
			
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
	}


