package CHAPTER12.EX01_InterfaceCharacteristics;

interface A{
	public static final int a = 3;
	public abstract void abc();
}
interface B{
	int b = 3;
	void bcd();
}

public class InterfaceCharacterisitics {

	public static void main(String[] args) {
		// static �ڵ� �߰� Ȯ��
		System.out.println(A.a);
		System.out.println(B.b);
		
		// final �ڵ� �߰� Ȯ��
		// A.a = 5; //�Ұ���
		// B.b = 5; //�Ұ���

	}

}