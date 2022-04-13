package CHAPTER15.EX01_NewRunnableTerminated;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� ���� Ŭ����
		Thread.State state;
		
		//1. ��ü ����(NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i<1000000000; i++) {}
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//2. myThread ����
		myThread.start();
		state=myThread.getState();
		System.out.println("myThrad stat = " + state);
		
		//3. myThread ����
		try {
			myThread.join();
		} catch(InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state =" + state);
	}

}
