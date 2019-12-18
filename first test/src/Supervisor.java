
public class Supervisor {
	
	private IWorker worker;
	
	
	public void completeJob()
	{
		worker.doWork1();
		worker.doWork2();
		
		System.out.println("Job Completed");
		
	}

	public IWorker getWorker() {
		return worker;
	}

	public void setWorker(IWorker worker) {
		this.worker = worker;
	}
	
	
}
