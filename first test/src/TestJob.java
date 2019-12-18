
public class TestJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker1 worker1 = new Worker1();
		Worker2 worker2 = new Worker2();
		
		Supervisor supervisor=new Supervisor();
		supervisor.setWorker(worker1);

		supervisor.setWorker(worker2);
		supervisor.completeJob();																															
	}

}
