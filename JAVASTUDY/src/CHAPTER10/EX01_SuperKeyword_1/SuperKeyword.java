package CHAPTER10.EX01_SuperKeyword_1;

class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A{
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		abc(); //this.abc();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
		B bb = new B();
		
		//�޼��� ȣ��
		bb.bcd();
	}

}
