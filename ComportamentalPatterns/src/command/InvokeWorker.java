package command;

public class InvokeWorker implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Check queue...");
			if(InvokerQueue.size() > 0) {
				InvokerQueue.poll().execute();
			}else {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
