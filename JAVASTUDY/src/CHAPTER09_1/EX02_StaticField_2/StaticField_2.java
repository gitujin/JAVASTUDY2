package CHAPTER09_1.EX02_StaticField_2;

class A{
	int m = 3; // �ν��Ͻ� �ʵ�
	static int n = 5; //���� �ʵ�
}

public class StaticField_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		
		// �ν��Ͻ� �ʵ�
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		// ���� �ʵ�
		a1.n = 7;
		a2.m = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}

}
