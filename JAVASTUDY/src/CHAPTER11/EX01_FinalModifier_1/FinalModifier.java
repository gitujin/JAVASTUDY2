package CHAPTER11.EX01_FinalModifier_1;

class A1{
	int a = 3;
	final int b = 5;
	A1(){
		
	}
}
class A2{
	int a;
	final int b;
	A2(){
		a=3;
		b=4;
	}
}
class A3{
	int a = 3;
	final int b =5;
	A3(){
		a = 5;
		// b = 5; -> final �ʵ�� ���� ����� ���� ���� ������ �� ����
	}
}
class B{
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
		//b = 9; -> final ���� ������ ���� ����� ���� ���� ������ �� ����.
	}
}

public class FinalModifier {

	public static void main(String[] args) {
		// ��ü ����
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		//�ʵ尪 ����
		a1.a = 7;
		//a1.b = 9; ->final �ʵ�� �� �� ������ ���� ������ �� ����.
		a2.a = 7;
		//a2.b = 9; ->final �ʵ�� �� �� ������ ���� ������ �� ����.
			
	}

}
