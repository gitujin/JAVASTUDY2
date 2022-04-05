package CHAPTER13.EX04_AnonymousClass_4;

interface A{
	public abstract void abc();
}
class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		// ��� 3. Ŭ������X + ���� ������ O
		A a = new A() {
			public void abc() {
				System.out.println("�Է� �Ű����� ����");
			}
		};
		c.cde(a);
		// ��� 4. Ŭ������ X + ���� ������ X
		c.cde(new A() {
			public void abc() {
				System.out.println("�Է� �Ű����� ����");
			}
		});
	}

}
