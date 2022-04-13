package CHAPTER15.EX04_CreateAndStartThread_M2C2;

class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		// �ڸ� ��ȣ �ϳ� ~ �ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		// �ڸ� ��ȣ ���
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ� ��ȣ) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable{
	@Override
	public void run() {
		// ���� ������ ��ȣ 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		// ���� ������ ��ȣ ���
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("(���� ������) " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SMIRunnable ��ü ����
		Runnable smiFileRunnable = new SMIFileRunnable();
		// smiFileRunnable.start();
		Thread thread1 = new Thread(smiFileRunnable);
		thread1.start();
		// VideoFileRunnable ��ü ����
		Runnable videoFileRunnable = new VideoFileRunnable();
		// videoFileRunnable.start();
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
	}

}
