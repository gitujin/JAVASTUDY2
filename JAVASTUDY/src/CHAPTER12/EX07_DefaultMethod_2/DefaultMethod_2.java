package CHAPTER12.EX07_DefaultMethod_2;

interface A{
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}
class B implements A{
	public void abc() {
		A.super.abc();
		System.out.println("B Ŭ������ abc()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[] args) {
		// ��ü ����
		B b = new B();
		
		// �޼��� ȣ��
		b.abc();

	}

}
