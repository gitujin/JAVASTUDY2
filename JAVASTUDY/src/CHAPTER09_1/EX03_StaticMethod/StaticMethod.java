package CHAPTER09_1.EX03_StaticMethod;

class A{
	void abc() {
		System.out.println("instance �޼���");
	}
	static void bcd() {
		System.out.println("static �޼���");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ν��Ͻ� �޼��� Ȱ��(��ü�� ������ �� ��� ����)
		A a1 = new A();
		a1.abc();
		
		//���� �޼��� Ȱ��
		//1. Ŭ���������� �ٷ� ������ ���
		A.bcd();
		//2. ��ü�� ������ �� ���(�������� ����)
		A a2 = new A();
		a2.bcd();
	}

}
