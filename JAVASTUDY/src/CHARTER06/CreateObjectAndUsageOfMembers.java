package CHARTER06;

class A{
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class CreateObjectAndUsageOfMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ������ ��ü(�ؾ) ����
		A a = new A();
		
		//Ŭ���� ��� Ȱ��(�ؾ �Ա�)
		//@�ʵ� Ȱ�� : �ʵ忡 ���� �б�/����
		a.m = 5;
		System.out.println(a.m);
		
		//@�޼��� Ȱ�� : �޼��� ȣ��
		a.print();
	}

}
