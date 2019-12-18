


public class Multithread1 extends Thread{  
		  
		  public static void main(String args[]){  
			 
			  Multithread1 obj=new Multithread1();  
			  Multithread1 obj1=new Multithread1();
			  obj.start(); 
		     obj1.start();  
		  }  
		  
		  public void run(){  
			    
			    if(getName().equals("Thread-1"))
			    {
			    	try{
			    	Thread.sleep(10000);
			    	System.out.println("My thread is in running state."+ getName());  
			    	}
			    	catch(Exception e) {
			    		System.out.println("In Thread-1");
			    	}
			    }
			    if(getName().equals("Thread-0"))
			    {
			    	try{
			    	Thread.sleep(100);
			    	System.out.println("My thread is in running state."+ getName());  
			    	}
			    	catch(Exception e) {
			    		System.out.println("In Thread-0");
			    	}
			    }
			 
			  }   
		}


