package CHAPTER13.EX01_AccessMemberAndLocalVariable;

class A{
	int a = 3; //�ʵ�
	void abc() {
		int b = 5; //���� ����
		// ���� �̳� Ŭ����
		class B{
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				// b = 7; -> ���� �̳� Ŭ�������� ����ϴ� ���� ������ �ڵ� final ����
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc();
	}

}
