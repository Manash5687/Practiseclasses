

	public class Multithread2 implements Runnable
	{	   
	       public static void main(String args[]) {
	    	   Thread  thread1 = new Thread(new Multithread2());
	    	   Thread  thread2 = new Thread(new Multithread2());
	    	  
	        thread1.start();
	      
	        thread2.start();
	        
	  }  
	       public void run() {
	  		 if(Thread.currentThread().getName().equals("Thread-0"))
	  		 {
	  		 	try {
	  		 		Thread.sleep(1000);
	  		 		
	  		 		System.out.println("Thread-0");
	  		 	} catch (Exception e) {
	  		 		System.out.println("Error"+e);
	  		 	}
	  		 }
	  		 if(Thread.currentThread().getName().equals("Thread-1"))
	  		 {
	  		 	try {
	  		 		Thread.sleep(100);
	  		 		System.out.println("Thread-1");
	  		 	} catch (Exception e) {
	  		 		System.out.println("Error"+e);
	  		 	}
	  		 }
	  	    }
	}

