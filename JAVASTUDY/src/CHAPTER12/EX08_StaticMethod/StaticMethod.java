package CHAPTER12.EX08_StaticMethod;

interface A{
	static void abc() {
		System.out.println("A �������̽��� ���� �޼��� abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �޼��� ȣ��
		A.abc();
	}

}
