package CHAPTER09_1.EX01_StaticField_1;

class A{
	int m = 3; //�ν��Ͻ� �ʵ�
	static int n = 5; // ���� �ʵ�
}

public class StaticField_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ν��Ͻ� �ʵ� Ȱ�� ���(��ü�� ������ �� ��� ����)
		A a1 = new A();
		System.out.println(a1.m);
		
		// ���� �ʵ� Ȱ�� ���
		// 1. ��ü ���� ���� Ŭ���������� �ٷ� Ȱ��
		System.out.println(A.n);
		// 2. ��ü�� ������ �� Ȱ��(�������� ����)
		A a2 = new A();
		System.out.println(a2.n);
	}

}
