package CHAPTER15.EX03_ThreadProperties_3_1;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName()+": "+(isDaemon()?"���� ������":"�Ϲ� ������"));
		for(int i = 0; i<6; i++) {
			System.out.println(getName()+": " + i + "��");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ϲ� ������
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread");
		thread1.start();
		
		// 3.5�� �� main ������ ����
		try {Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main Thread ����");
		
	}

}
