package CHAPTER13.EX01_AnonymousClass_1;

class A{
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C{
		public void bcd() {
			System.out.println("�ν��Ͻ� �̳� Ŭ����");
		}
	}
}
interface C{
	public abstract void bcd();
}

public class AnonymousClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc();
	}

}
