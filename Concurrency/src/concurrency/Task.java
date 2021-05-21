package concurrency;

public class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run");
		go();
	}

	private void go() {
		// TODO Auto-generated method stub
		System.out.println("Inside go");
		more();
	}

	private void more() {
		// TODO Auto-generated method stub
		System.out.println("Inside more... ");
	}
	
	
}
