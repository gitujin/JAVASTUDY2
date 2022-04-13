package CHAPTER15.EX05_CreateAndStartThread_M2C3;

public class CreateAndStartThread_M2C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڸ� ��ȣ�� ����ϴ� �������� �͸� �̳� Ŭ���� ����
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// �ڸ� ��ȣ �ϳ� ~ �ټ�
				String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
				try {Thread.sleep(10);} catch(InterruptedException e) {}
				// �ڸ� ��ȣ ���
				for(int i = 0; i < strArray.length; i++) {
					System.out.println(" - (�ڸ� ��ȣ) " + strArray[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		// ���� ������ ��ȣ�� ����ϴ� �������� �͸� �̳� Ŭ���� ����
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// ���� ������ ��ȣ 1~5
				int[] intArray = {1, 2, 3, 4, 5};
				
				// ���� ������ ��ȣ ���
				for (int i =0; i<intArray.length; i++) {
					System.out.print("(���� ������) " + intArray[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		//Thread ����
		thread1.start();
		thread2.start();
	}

}
