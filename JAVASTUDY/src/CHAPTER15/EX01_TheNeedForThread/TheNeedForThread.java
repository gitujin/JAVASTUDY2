package CHAPTER15.EX01_TheNeedForThread;

public class TheNeedForThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		// �ڸ� ��ȣ �ϳ� ~ �ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		// ���� ������ ���
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("(���� ������) " + intArray[i]);
			try { Thread.sleep(200);} catch(InterruptedException e) {}
		}
		// �ڸ� ��ȣ ���
		for(int i = 0; i<strArray.length; i++) {
			System.out.println("(�ڸ� ��ȣ) "+strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}
