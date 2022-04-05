package CHAPTER13.EX02_UseMemberOfOuterClass;

class A{
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A Ŭ���� �޼���");
	}
	// �ν��Ͻ� �̳� Ŭ���� ����
	class B{
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B Ŭ���� �޼���");
		}
		void bcd() {
			// �̳� Ŭ������ ��� ȣ�� �Ǵ� ���
			System.out.println(a);
			System.out.println(b);
			abc();
			
			// �ƿ��� Ŭ������ ��� ȣ�� �Ǵ� ���
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}

public class UseMemberOfOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƿ��� Ŭ���� ��ü ����
		A a = new A();
		
		// �̳� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.bcd();
	}

}
