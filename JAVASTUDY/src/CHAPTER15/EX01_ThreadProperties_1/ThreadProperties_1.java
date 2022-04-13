package CHAPTER15.EX01_ThreadProperties_1;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü �����ϱ�, �������� ���� ��������
		Thread curThread = Thread.currentThread();
		System.out.println("���� �������� �̸� = " + curThread.getName());
		System.out.println("�����ϴ� �������� ���� = " + Thread.activeCount()); // �������� ������
		
		// ������ �̸� �ڵ� ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// ������ �̸� ���� ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		// ������ �̸� �ڵ� ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// �������� ���� ��������
		System.out.println("�����ϴ� �������� ���� = " + Thread.activeCount());
	}

}
