package CHAPTER13.EX03_AnonymousClass_3;

interface A{
	public abstract void abc();
}
// �ڽ� Ŭ���� ���� ����
class B implements A{
	public void abc() {
		System.out.println("�Է¸Ű����� ����");
	}
}
class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		// ��� 1. Ŭ������ O + ���� ������ O
		A a = new B();
		c.cde(a);
		// ��� 2. Ŭ������ O + ���� ������ X
		c.cde(new B());
	}

}
