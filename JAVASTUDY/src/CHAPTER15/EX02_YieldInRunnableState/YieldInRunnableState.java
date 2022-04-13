package CHAPTER15.EX02_YieldInRunnableState;

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			}else {
				System.out.println(getName() + "����");
				for(long i = 0; i<100000000; i++) {}
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag=false;
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag=true;
		thread2.setDaemon(true);
		thread2.start();
		
		// 6�� ����(1�ʸ��� �� ���� �纸)
		for(int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;
		}
	}

}