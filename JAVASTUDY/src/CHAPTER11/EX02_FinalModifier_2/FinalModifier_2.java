package CHAPTER11.EX02_FinalModifier_2;

class A{
	void abc() {}
	final void bcd() {}
}
class B{
	void abc() {}
	// void bcd(){} -> final �޼���� �������̵� �Ұ���
}
final class C{}
//class D extends C{} -> final Ŭ������ ��� ��ü�� �Ұ���

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
