package CHAPTER09_1.EX04_StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5; // ���� �ʵ��� �ʱ�ȭ�� static {} ������ ����
		System.out.println("Ŭ���� A�� �ε��ƽ��ϴ�!!");
	}
	A(){
		a = 3;
	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.b);
	}

}
