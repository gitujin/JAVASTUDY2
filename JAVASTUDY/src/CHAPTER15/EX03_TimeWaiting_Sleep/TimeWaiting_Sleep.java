package CHAPTER15.EX03_TimeWaiting_Sleep;

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(" -- sleep() ���� �� interrupted() �߻�");
			for(long i = 0; i < 10000000000L; i++) {}
		}
	}
}

public class TimeWaiting_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch(InterruptedException e) {}
		System.out.println("MyThread State= " + myThread.getState());
		
		myThread.interrupt();
		try {Thread.sleep(100);} catch(InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
	}

}
