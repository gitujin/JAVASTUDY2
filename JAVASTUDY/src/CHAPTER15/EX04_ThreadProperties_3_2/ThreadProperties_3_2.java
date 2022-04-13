package CHAPTER15.EX04_ThreadProperties_3_2;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+": " +(isDaemon()?"���� ������":"�Ϲ� ������"));
		for(int i=0; i<6; i++) {
			System.out.println(getName()+": "+ i + "��");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ������
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		//3.5�� �� main ������ ����
		try {Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main Thread ����");
	}

}
