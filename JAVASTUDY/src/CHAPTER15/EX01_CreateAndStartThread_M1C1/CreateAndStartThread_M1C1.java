package CHAPTER15.EX01_CreateAndStartThread_M1C1;

class SMIFileThread extends Thread{
	@Override
	public void run() {
		// �ڸ� ��ȣ �ϳ�~�ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		// �ڸ� ��ȣ ���
		for(int i=0; i<strArray.length;i++) {
			System.out.println("- (�ڸ� ��ȣ) " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M1C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SMIFileThread ��ü ���� �� ����
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		// ���� ������ ��ȣ 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// ���� ������ ��ȣ ���
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("(���� ������) " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}

}
