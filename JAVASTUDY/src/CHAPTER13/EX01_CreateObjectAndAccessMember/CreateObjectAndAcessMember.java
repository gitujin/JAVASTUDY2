package CHAPTER13.EX01_CreateObjectAndAccessMember;

class A{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A Ŭ���� �޼��� abc()");
	}
	//�ν��Ͻ� �̳� Ŭ����
	class B{
		void bcd() {
			//�ƿ��� Ŭ������ �ʵ� ���
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			// �ƿ��� Ŭ������ �޼��� ȣ��
			abc();
		}
	}
}

public class CreateObjectAndAcessMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƿ��� Ŭ���� ��ü ����
		A a = new A();
		// ��� ���
		A.B b = a.new B();
		b.bcd();
	}

}
