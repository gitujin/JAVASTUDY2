package CHAPTER10.MethodOverriding;

class A1{
	void print() {
		System.out.println("A Ŭ����");
	}
}

class B11 extends A1{
	@Override
	void print() {
		System.out.println("B Ŭ����");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		// A Ÿ��/ A ������
		A1 aa = new A1();
		aa.print();
		
		//B Ÿ�� / B ������
		B11 bb = new B11();
		bb.print();
		
		//A Ÿ�� / B ������
		A1 ab = new B11();
		ab.print();
	}

}
