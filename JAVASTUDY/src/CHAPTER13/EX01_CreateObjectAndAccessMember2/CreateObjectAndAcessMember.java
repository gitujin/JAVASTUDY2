package CHAPTER13.EX01_CreateObjectAndAccessMember2;

class A{
	int a =3;
	static int b =4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	// ���� �̳� Ŭ����
	static class B{
		void bcd() {
			// �ʵ� ���
			// System.out.println(a);
			System.out.println(b);
			//�޼��� ȣ��
			// method1();
			method2();
		}
	}
}

public class CreateObjectAndAcessMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �̳� Ŭ������ ��ü ����
		A.B b = new A.B();
		//�޼��� ȣ��
		b.bcd();
	}

}
