package CHAPTER15.EX02_ThreadProperties_2;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i<1000000000; i++) {}
			System.out.println(getName() + " �켱����: " + getPriority());
	}
}

public class ThreadProperties_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cpu �ھ� ��
		System.out.println("�ھ� �� : " + Runtime.getRuntime().availableProcessors());
		
		// �켱���� �ڵ� ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// �켱���� ���� ����
		for(int i = 0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+ "��° ������");
		}
	}

}
