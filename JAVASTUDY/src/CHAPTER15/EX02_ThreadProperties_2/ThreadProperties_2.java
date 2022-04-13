package CHAPTER15.EX02_ThreadProperties_2;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i<1000000000; i++) {}
			System.out.println(getName() + " 우선순위: " + getPriority());
	}
}

public class ThreadProperties_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cpu 코어 수
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 우선순위 직접 지정
		for(int i = 0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+ "번째 쓰레드");
		}
	}

}
