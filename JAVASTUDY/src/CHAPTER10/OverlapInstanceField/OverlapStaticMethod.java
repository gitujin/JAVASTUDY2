package CHAPTER10.OverlapInstanceField;

class AA {
	static void print() {
		System.out.println("A Ŭ����");
	}
}
class BB extends AA {
	static void print() {
		System.out.println("B Ŭ����");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���������� �ٷ� ����
		AA.print();
		BB.print();
		System.out.println();
		
		// ��ü ����
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		//��ü�� ���� �޼��� ȣ��
		aa.print();
		bb.print();
		ab.print();
	}

}
