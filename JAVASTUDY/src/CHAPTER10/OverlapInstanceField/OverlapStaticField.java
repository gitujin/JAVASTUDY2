package CHAPTER10.OverlapInstanceField;

class A1 {
	static int m = 3;
}
class B1 extends A1{
	static int m = 4;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���������� �ٷ� ����
		System.out.println(A1.m);
		System.out.println(B1.m);
		System.out.println();
		
		//��ü ����
		A1 aa = new A1();
		B1 bb = new B1();
		A1 ab = new B1();
		
		//������ ��ü�� ���� �ʵ� ȣ��
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}

}
